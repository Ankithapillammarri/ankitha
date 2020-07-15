import { Component, OnInit } from '@angular/core';
import { LibraryService } from '../library.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-show-users',
  templateUrl: './show-users.component.html',
  styleUrls: ['./show-users.component.css']
})
export class ShowUsersComponent implements OnInit {

  users;
  searchText;
  fieldName = 'name';
  constructor(private libraryService: LibraryService, private router: Router) {
    this.getUserDetails();
  }

  ngOnInit(): void {
  }

  getUserDetails() {
    this.libraryService.getUserData().subscribe(response => {
      console.log(response);
      this.users = response.usersInfo;
    }, error => {
      console.log(error);
    }
    );
  }


}
