import { Component, OnInit } from '@angular/core';
import { LibraryService } from '../library.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-borrowed-books',
  templateUrl: './borrowed-books.component.html',
  styleUrls: ['./borrowed-books.component.css']
})
export class BorrowedBooksComponent implements OnInit {

  borrows;
  constructor(private libraryService: LibraryService, private router: Router) {
    this.getBorrowedDetails();
  }

  ngOnInit(): void {
  }

  getBorrowedDetails(){
    this.libraryService.getBorrowedData().subscribe(response => {
      console.log(response);
      this.borrows = response.borrowedBooks;
    }, error => {
      console.log(error);
    }
    );
  }

}
