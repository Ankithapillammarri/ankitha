package com.capgemini.librarymanagementsystemjdbc.dao;

import java.util.List;

import com.capgemini.librarymanagementsystemjdbc.dto.BookBean;
import com.capgemini.librarymanagementsystemjdbc.dto.BookBorrow;
import com.capgemini.librarymanagementsystemjdbc.dto.BookIssue;
import com.capgemini.librarymanagementsystemjdbc.dto.BookRequest;
import com.capgemini.librarymanagementsystemjdbc.dto.User;

public interface UserDAO {
	boolean register(User user);

	User login(String email, String password);

	boolean addBook(BookBean book);

	boolean removeBook(int bookId);

	boolean updateBook(BookBean book);

	boolean issueBook(int bookId, int userId);

	boolean request(int bookId, int userId);

	List<BookBorrow> borrowedBook(int userId);

	List<BookBean> searchBookById(int bookId);

	List<BookBean> searchBookByTitle(String bookName);

	List<BookBean> searchBookByAuthor(String bookAuthor);

	List<BookBean> getBooksInfo();

	boolean returnBook(int bookId, int userId, String status);

	List<BookIssue> bookHistoryDetails(int userId);

	List<BookRequest> showRequests();

	List<BookIssue> showIssuedBooks();

	List<User> showUsers();

	boolean updatePassword(String email, String password, String newPassword, String role);
}
