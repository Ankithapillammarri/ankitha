import { Component, OnInit } from '@angular/core';
import { LibraryService } from '../library.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-return-book',
  templateUrl: './return-book.component.html',
  styleUrls: ['./return-book.component.css']
})
export class ReturnBookComponent implements OnInit {
requests;
borrows;
message: string;
error: string;
returns;
constructor(private libraryService: LibraryService, private router: Router) {
  /* this.getIssueDetails(); */
  this.getBorrowedDetails();
}

ngOnInit(): void {
}

/* getIssueDetails() {
  this.libraryService.getIssuedData().subscribe(response => {
    console.log(response);
    this.requests = response.issueInfo;
  }, error => {
    console.log(error);
  }
  );
} */
getBorrowedDetails(){
  this.libraryService.getBorrowedData().subscribe(response => {
    console.log(response);
    this.borrows = response.borrowedBooks;
  }, error => {
    console.log(error);
  }
  );
}
returnData(book) {
  this.libraryService.returnData({ bid: book.bid, uid: book.uid}).subscribe(response => {
    console.log(response);
    if (!response.error) {
      this.message = 'Book  is returned the user';
    } else {
      this.error = 'Book is not returned ';
    }
    this.getBorrowedDetails();
    setTimeout(() => {
      this.message = null;
    }, 5000);
   /*  this.getIssueDetails(); */
  });

}
}
