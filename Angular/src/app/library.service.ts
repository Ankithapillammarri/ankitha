import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root'

})
export class LibraryService{
    constructor(private http: HttpClient) { }
    myURL = 'http://localhost:8080/librarymanagementsystemspringrest/';

     postData(bookbean) {
        return this.http.post<any>(`${this.myURL}addBook`, bookbean);
      }

      register(userDetails){
        return this.http.post<any>(`${this.myURL}addUser`, userDetails);
      }
      login(userDetails){
        return this.http.post<any>(`${this.myURL}login`, userDetails);
      }
      deleteData(bookbean) {
        return this.http.delete<any>(`${this.myURL}deleteBook/${bookbean.bid}`);
      }
      getData() {
        return this.http.get<any>(`${this.myURL}getBooksInfo`);
      }
      getRequestData() {
        return this.http.get<any>(`${this.myURL}showRequests`);
      }
      getUserData() {
        return this.http.get<any>(`${this.myURL}showUsers`);
      }
      getBorrowedData(){
        return this.http.get<any>(`${this.myURL}getBorrowedBooks`);
      }
      requestData(bid){
        return this.http.post<any>(`${this.myURL}requestBook`, bid);
      }
      /* getUserId() {
        var userDetails = JSON.parse(localStorage.getItem('userInfo'));
        console.log(userDetails.uid);
        return userDetails.uid;
      } */
     /*  requestData(bookbean){
        return this.http.post<any>(`${this.myURL}requestBook/${this.getUserId}`, bookbean);
      }
       getUserId() {
        var user = JSON.parse(localStorage.getItem('userInfo'));
        console.log(user.uid);
        return user.uId;
      } */

      issueData(request){
        return this.http.post<any>(`${this.myURL}issueBook`, request);
      }

      returnData(bookbean){
        return this.http.post<any>(`${this.myURL}returnBook`, bookbean);
      }
      getIssuedData(){
        return this.http.get<any>(`${this.myURL}showIssuedBooks`);
      }

}
