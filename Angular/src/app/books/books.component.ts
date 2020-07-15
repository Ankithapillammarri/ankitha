import { Component, OnInit } from '@angular/core';
import { LibraryService } from '../library.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-books',
  templateUrl: './books.component.html',
  styleUrls: ['./books.component.css']
})
export class BooksComponent implements OnInit {
  message: string;
  books;
  searchText;
  fieldName = 'bookName';
  constructor(private libraryService: LibraryService, private router: Router) {
    this.getBooks();
  }

  ngOnInit(): void {
  }

  getBooks() {
    this.libraryService.getData().subscribe(response => {
      console.log(response);
      this.books = response.booksInfo;
    }, error => {
      console.log(error);
    }
    );
  }
  deleteData(bookBean){
    this.libraryService.deleteData(bookBean).subscribe(response => {
      console.log(response);
      if ( response.error){
        this.message = 'Failed to delete the Book';
      }else{
        this.message = 'Book deleted successfully';
      }
      setTimeout(() => {

      this.message = null;

      }, 5000);
      this.getBooks();
    });
  }


}
