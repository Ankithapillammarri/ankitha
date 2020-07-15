import { Component, OnInit } from '@angular/core';
import { LibraryService } from '../library.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-show-issued-books',
  templateUrl: './show-issued-books.component.html',
  styleUrls: ['./show-issued-books.component.css']
})
export class ShowIssuedBooksComponent implements OnInit {
issues;
constructor(private libraryService: LibraryService, private router: Router) {
  this.getIssueDetails();
}

ngOnInit(): void {
}

getIssueDetails() {
  this.libraryService.getIssuedData().subscribe(response => {
    console.log(response);
    this.issues = response.issueInfo;
  }, error => {
    console.log(error);
  }
  );
}

}
