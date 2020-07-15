
package com.capgemini.librarymanagementsystemjpa.dao;

import java.util.List;

import com.capgemini.librarymanagementsystemjpa.dto.BookBean;
import com.capgemini.librarymanagementsystemjpa.dto.BookBorrowBean;
import com.capgemini.librarymanagementsystemjpa.dto.BookIssueBean;
import com.capgemini.librarymanagementsystemjpa.dto.BookRequestBean;
import com.capgemini.librarymanagementsystemjpa.dto.UserBean;

public interface UsersDAO {
	boolean register(UserBean user);

	UserBean login(String email, String password);

	boolean addBook(BookBean book);

	boolean removeBook(int bookId);

	boolean updateBook(BookBean book);

	boolean issueBook(int bookId, int userId);

	boolean request(int bookId, int userId);

	List<BookBorrowBean> borrowedBook(int userId);

	List<BookBean> searchBookById(int bookId);

	List<BookBean> searchBookByTitle(String bookName);

	List<BookBean> searchBookByAuthor(String bookAuthor);

	List<BookBean> getBooksInfo();

	boolean returnBook(int bookId, int userId, String status);

	List<BookIssueBean> bookHistoryDetails(int userId);

	List<BookRequestBean> showRequests();

	List<BookIssueBean> showIssuedBooks();

	List<UserBean> showUsers();

	boolean updatePassword(String email, String password, String newPassword, String role);
}
