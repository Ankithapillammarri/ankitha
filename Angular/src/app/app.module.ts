import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {  HttpClientModule } from '@angular/common/http';
import { FormsModule , ReactiveFormsModule} from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { AddComponent } from './add/add.component';
import { AddUserComponent } from './add-user/add-user.component';
import { AddBookComponent } from './add-book/add-book.component';
import { DeleteBookComponent } from './delete-book/delete-book.component';
import { UpdateBookComponent } from './update-book/update-book.component';
import { IssueBookComponent } from './issue-book/issue-book.component';
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
import { SearchBookPipe } from './search-book.pipe';
import { LogoutComponent } from './logout/logout.component';
import { SearchUserPipe } from './search-user.pipe';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    AboutComponent,
    AddComponent,
    AddUserComponent,
    AddBookComponent,
    DeleteBookComponent,
    UpdateBookComponent,
    IssueBookComponent,
    LoginComponent,
    BooksComponent,
    ShowUsersComponent,
    ShowRequestsComponent,
    SearchComponent,
    BookByIdComponent,
    BookByNameComponent,
    BookByAuthorComponent,
    StudentComponent,
    RequestBookComponent,
    ReturnBookComponent,
    BorrowedBooksComponent,
    ShowIssuedBooksComponent,
    SearchBookPipe,
    LogoutComponent,
    SearchUserPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
