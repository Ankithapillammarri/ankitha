import { Component, OnInit } from '@angular/core';
import { LibraryService } from '../library.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-request-book',
  templateUrl: './request-book.component.html',
  styleUrls: ['./request-book.component.css']
})
export class RequestBookComponent implements OnInit {
  books;
error: string;
message: string;
  ngOnInit(): void {

  }
  constructor(private libraryService: LibraryService, private router: Router) {
    this.getBooks();
  }
  /* getBooks() {
    this.libraryService.getBorrowedData().subscribe(response => {
      console.log(response);
      this.books = response.borrowedBooks;
    }, error => {
      console.log(error);
    }
    );
  } */
  getBooks() {
    this.libraryService.getData().subscribe(response => {
      console.log(response);
      this.books = response.booksInfo;
    }, error => {
      console.log(error);
    }
    );
  }
  requestData(bid){
    let userDetails = JSON.parse(localStorage.getItem('userDetails'));
    let userId = userDetails.userInfo.uid;
    this.libraryService.requestData({uid: userId, bid: bid}).subscribe(response => {
      console.log(response);
      if (response.error()) {
        this.error = response.message;
        setTimeout(() => {
          this.error = null;
        }, 5000);
      }else{
        this.message = 'request placed';
        setTimeout(() => {
          this.message = null;
        }, 5000);
      }
    });
  }


  /* loginUser(form: NgForm) {
    this.libraryService.requestData(form.value).subscribe(response => {
      console.log(response);
      if (response.error) {
        this.error = response.message;
        setTimeout(() => {
          this.error = null;
        }, 5000);
      } else {
        localStorage.setItem('userDetails', JSON.stringify(response));
      }
      form.reset();
    });
  } */
/* books;
bookDetails;
error: string;
message: string;
  ngOnInit(): void {

  }
  constructor(private libraryService: LibraryService, private router: Router) {
     this.getBooks();
  }
   getBooks() {
    this.libraryService.getBorrowedData().subscribe(response => {
      console.log(response);
      this.books = response.borrowedBooks;
    }, error => {
      console.log(error);
    }
    );
  }



  loginUser(form: NgForm) {
    this.libraryService.requestData(form.value).subscribe(response => {
      console.log(response);
      if (response.error) {
        this.error = response.message;
        setTimeout(() => {
          this.error = null;
        }, 5000);
      } else {
        localStorage.setItem('userDetails', JSON.stringify(response));
        // this.router.navigateByUrl('/add');
      }
      form.reset();
    });
  }
 */

  /* getBooks() {
    this.libraryService.getData().subscribe(response => {
      console.log(response);
      this.books = response.booksInfo;
    }, error => {
      console.log(error);
    }
    );
  }

 requestData(books){
    this.libraryService.requestData(books).subscribe(response => {
      console.log(response);
      if (response.error){
        this.error = response.booksInfo;
        setTimeout(() => {
          this.error = null;
        }, 5000);
      } else {
        localStorage.setItem('usersBean', JSON.stringify(response));
        alert('Request sent successfully');
        this.message = 'request sent to admin successfully';
      }

    });
  } */
}

