package com.capgemini.librarymanagementsystemcollections.service;

import com.capgemini.librarymanagementsystemcollections.dao.StudentDAO;
import com.capgemini.librarymanagementsystemcollections.dto.BookInfo;
import com.capgemini.librarymanagementsystemcollections.dto.RequestInfo;
import com.capgemini.librarymanagementsystemcollections.dto.Student;
import com.capgemini.librarymanagementsystemcollections.factory.LMSFactory;

public class StudentServiceImplement implements StudentService{
	private StudentDAO dao=LMSFactory.getStudentDAO();
	@Override
	public Student auth(String email, String password) {
		return dao.auth(email, password);
	}
	@Override
	public BookInfo search(int bookId) {
		return dao.search(bookId);
	}
	@Override
	public RequestInfo requestBook(Student student, BookInfo info) {
		return dao.requestBook(student, info);
	}
	@Override
	public RequestInfo returnBook(Student student, BookInfo info) {
		return dao.requestBook(student, info);
	}
}
