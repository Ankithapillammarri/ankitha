import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { AddComponent } from './add/add.component';
import { AddBookComponent } from './add-book/add-book.component';
import { AddUserComponent } from './add-user/add-user.component';
import { DeleteBookComponent } from './delete-book/delete-book.component';
import { IssueBookComponent } from './issue-book/issue-book.component';
import { UpdateBookComponent } from './update-book/update-book.component';
import { LoginComponent } from './login/login.component';
import { BooksComponent } from './books/books.component';
import { ShowUsersComponent } from './show-users/show-users.component';
import { ShowRequestsComponent } from './show-requests/show-requests.component';
import { SearchComponent } from './search/search.component';
import { BookByIdComponent } from './book-by-id/book-by-id.component';
import { BookByNameComponent } from './book-by-name/book-by-name.component';
import { BookByAuthorComponent } from './book-by-author/book-by-author.component';
import { StudentComponent } from './student/student.component';
import { RequestBookComponent } from './request-book/request-book.component';
import { ReturnBookComponent } from './return-book/return-book.component';
import { BorrowedBooksComponent } from './borrowed-books/borrowed-books.component';
import { ShowIssuedBooksComponent } from './show-issued-books/show-issued-books.component';
import { AuthguardGuard } from './authguard.guard';


const routes: Routes = [
  {path: 'home', component: HomeComponent},
  /* { path:", component: HomeComponent}, */
  {path: 'about', component: AboutComponent},
  {path: 'add', component: AddComponent,
  data : { roles: ['admin']}, canActivate: [AuthguardGuard]
  },
  {path: 'addBook', component: AddBookComponent},
  {path: 'addUser', component: AddUserComponent},
  {path: 'deleteBook', component: DeleteBookComponent},
  {path: 'issueBook', component: IssueBookComponent},
  {path: 'updateBook', component: UpdateBookComponent},
  {path: 'login', component: LoginComponent},
  {path: 'books', component: BooksComponent},
  {path: 'showUsers', component: ShowUsersComponent},
  {path: 'showRequests', component: ShowRequestsComponent},
  {path: 'search', component: SearchComponent},
  {path: 'bookById', component: BookByIdComponent},
  {path: 'bookByName', component: BookByNameComponent},
  {path: 'bookByAuthor', component: BookByAuthorComponent},
  {path: 'student', component: StudentComponent,
  data : { roles: ['student']}, canActivate: [AuthguardGuard]
  },
  {path: 'requestBook', component: RequestBookComponent},
  {path: 'returnBook', component: ReturnBookComponent},
  {path: 'borrowedBooks', component: BorrowedBooksComponent},
  {path: 'showIssuedBooks', component: ShowIssuedBooksComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
