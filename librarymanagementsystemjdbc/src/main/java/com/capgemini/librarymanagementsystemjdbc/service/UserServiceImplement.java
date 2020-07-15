package com.capgemini.librarymanagementsystemjdbc.service;

import java.util.List;

import com.capgemini.librarymanagementsystemjdbc.dao.UserDAO;
import com.capgemini.librarymanagementsystemjdbc.dto.BookBean;
import com.capgemini.librarymanagementsystemjdbc.dto.BookBorrow;
import com.capgemini.librarymanagementsystemjdbc.dto.BookIssue;
import com.capgemini.librarymanagementsystemjdbc.dto.BookRequest;
import com.capgemini.librarymanagementsystemjdbc.dto.User;
import com.capgemini.librarymanagementsystemjdbc.factory.LMSFactory;

public class UserServiceImplement implements UserService {
	private UserDAO dao = LMSFactory.getUserDao();

	@Override
	public boolean register(User user) {
		return dao.register(user);
	}

	@Override
	public User login(String email, String password) {
		return dao.login(email, password);
	}

	@Override
	public boolean addBook(BookBean book) {
		return dao.addBook(book);
	}

	@Override
	public boolean removeBook(int bookId) {

		return dao.removeBook(bookId);
	}

	@Override
	public boolean updateBook(BookBean book) {

		return dao.updateBook(book);
	}

	@Override
	public boolean issueBook(int bookId, int userId) {

		return dao.issueBook(bookId, userId);
	}

	@Override
	public boolean request(int bookId, int userId) {

		return dao.request(bookId, userId);
	}

	@Override
	public List<BookBorrow> borrowedBook(int userId) {

		return dao.borrowedBook(userId);
	}

	@Override
	public List<BookBean> searchBookById(int bookId) {

		return dao.searchBookById(bookId);
	}

	@Override
	public List<BookBean> searchBookByTitle(String bookName) {

		return dao.searchBookByTitle(bookName);
	}

	@Override
	public List<BookBean> searchBookByAuthor(String bookAuthor) {
		return dao.searchBookByAuthor(bookAuthor);
	}

	@Override
	public List<BookBean> getBooksInfo() {

		return dao.getBooksInfo();
	}

	@Override
	public List<BookIssue> bookHistoryDetails(int userId) {

		return dao.bookHistoryDetails(userId);
	}

	@Override
	public boolean returnBook(int bookId, int userId, String status) {
		return dao.returnBook(bookId, userId, status);
	}

	@Override
	public List<BookRequest> showRequests() {
		return dao.showRequests();
	}

	@Override
	public List<BookIssue> showIssuedBooks() {
		return dao.showIssuedBooks();
	}

	@Override
	public List<User> showUsers() {
		return dao.showUsers();
	}

	@Override
	public boolean updatePassword(String email, String password, String newPassword, String role) {
		return dao.updatePassword(email, password, newPassword, role);
	}
}
