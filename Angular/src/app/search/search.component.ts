import { Component, OnInit } from '@angular/core';
import { LibraryService } from '../library.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {
search;
message: string;
books;
fieldName;
searchText;
constructor(private libraryService: LibraryService, private router: Router) {
  /* this.getBooks(); */
}

ngOnInit(): void {
}
/*
getBooks() {
  this.libraryService.getData().subscribe(response => {
    console.log(response);
    this.books = response.booksInfo;
  }, error => {
    console.log(error);
  }
  );
} */

}
