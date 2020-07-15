import { Component, OnInit } from '@angular/core';
import { LibraryService } from '../library.service';

@Component({
  selector: 'app-delete-book',
  templateUrl: './delete-book.component.html',
  styleUrls: ['./delete-book.component.css']
})
export class DeleteBookComponent implements OnInit {

  message: string;
  books: any;

  constructor(private libraryService: LibraryService) {
    this.getBooks();
  }

  ngOnInit() {
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

  deleteData(bookbean) {
    this.libraryService.deleteData(bookbean).subscribe(response => {
      console.log(response);
      if (response.error) {
        this.message = 'Failed to delete the book';
      } else {
        this.message = 'book deleted successfully';
      }
      setTimeout(() => {
        this.message = null;
      }, 5000);
      this.getBooks();
    });
  }

}
