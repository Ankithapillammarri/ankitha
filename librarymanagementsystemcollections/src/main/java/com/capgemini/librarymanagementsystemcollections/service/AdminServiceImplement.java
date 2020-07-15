package com.capgemini.librarymanagementsystemcollections.service;

import java.util.List;

import com.capgemini.librarymanagementsystemcollections.dao.AdminDAO;
import com.capgemini.librarymanagementsystemcollections.dto.Admin;
import com.capgemini.librarymanagementsystemcollections.dto.BookInfo;
import com.capgemini.librarymanagementsystemcollections.dto.RequestInfo;
import com.capgemini.librarymanagementsystemcollections.dto.Student;
import com.capgemini.librarymanagementsystemcollections.factory.LMSFactory;

public class AdminServiceImplement implements AdminService {

	private AdminDAO dao = LMSFactory.getAdminDAO();

	@Override
	public boolean register(Student info) {
		return dao.register(info);
	}

	@Override
	public Admin auth(String emailId, String password) {
		return dao.auth(emailId, password);
	}

	@Override
	public boolean addBook(BookInfo info) {
		return dao.addBook(info);
	}

	@Override
	public BookInfo search(int bookId) {
		return dao.search(bookId);
	}

	@Override
	public boolean removeBook(BookInfo info) {
		return dao.removeBook(info);
	}

	@Override
	public List<BookInfo> showBooks() {
		return dao.showBooks();
	}

	@Override
	public List<Student> showStudents() {
		return dao.showStudents();
	}

	@Override
	public List<RequestInfo> showRequests() {
		return dao.showRequests();
	}

	@Override
	public boolean issueBook(Student student, BookInfo info) {
		return dao.issueBook(student, info);
	}

	@Override
	public boolean isBookReceieved(Student student, BookInfo info) {
		return dao.isBookReceieved(student, info);
	}

}
