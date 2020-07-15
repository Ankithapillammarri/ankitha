import { Component, OnInit } from '@angular/core';
import { LibraryService } from '../library.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-show-requests',
  templateUrl: './show-requests.component.html',
  styleUrls: ['./show-requests.component.css']
})
export class ShowRequestsComponent implements OnInit {
message: string;
  requests;
  constructor(private libraryService: LibraryService, private router: Router) {
      this.getRequestDetails();
    }

  ngOnInit(): void {
  }

  getRequestDetails(){
    this.libraryService.getRequestData().subscribe(response => {
      console.log(response);
      this.requests = response.requests;
    }, error => {
      console.log(error);
    }
    );
  }
  issueData(request){
    this.libraryService.issueData({uid: request.uid, bid: request.bid}).subscribe(response => {
      console.log(response);
      if ( !response.error){
        this.message = 'Book Issue successfully';
      }else{
        this.message = 'Book not Issued';
      }
      this.getRequestDetails();
      setTimeout(() => {
        this.message = null;
      }, 5000);

    });
  }
}
