import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { LibraryService } from '../library.service';

@Component({
  selector: 'app-add-book',
  templateUrl: './add-book.component.html',
  styleUrls: ['./add-book.component.css']
})
export class AddBookComponent implements OnInit {

  message: string;
  constructor(private libraryService: LibraryService) { }

  postBook(form: NgForm){
    this.libraryService.postData(form.value).subscribe(response => {
      console.log(response);
      form.reset();
      if ( !response.error){
        this.message = 'Book added successfully';
      }
    }, error => {
      console.log(error);
    });
   }
   ngOnInit(): void {
   }

}
