import { Component, OnInit } from '@angular/core';
import { NgForm, FormGroup, FormControl, FormArray, Validators } from '@angular/forms';
import { LibraryService } from '../library.service';

@Component({
  selector: 'app-add-user',
  templateUrl: './add-user.component.html',
  styleUrls: ['./add-user.component.css']
})
export class AddUserComponent implements OnInit {

  message: string;
  error: string;
  constructor(private libraryService: LibraryService) { }

  ngOnInit(): void {
  }
  registerUser(form: NgForm){
    this.libraryService.register(form.value).subscribe(response => {
      console.log(response);
      if ( response.error){
        this.error = response.message;
        setTimeout( () => {
         this.error = null ;
        }, 5000);
      }else{
        this.message = 'User registered successfully,Please Login';
        setTimeout( () => {
          this.message = null;
         }, 5000);
      }
      form.reset();
    });
  }

}
