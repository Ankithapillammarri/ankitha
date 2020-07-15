import { Component, OnInit } from '@angular/core';
import { LibraryService } from '../library.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-issue-book',
  templateUrl: './issue-book.component.html',
  styleUrls: ['./issue-book.component.css']
})
export class IssueBookComponent implements OnInit {
  message: string;
  constructor(private libraryService: LibraryService) { }

  issueBook(form: NgForm){
    this.libraryService.issueData(form.value).subscribe(response => {
      console.log(response);
      form.reset();
      if ( !response.error){
        this.message = 'Book Issue successfully';
      }else{
        this.message = 'Book not Issue';
      }
    }, error => {
      console.log(error);
    });
   }
   ngOnInit(): void {
   }

}


