package com.capgemini.librarymanagementsystemcollections.dao;

import java.util.Date;

import com.capgemini.librarymanagementsystemcollections.db.DataBase;
import com.capgemini.librarymanagementsystemcollections.dto.BookInfo;
import com.capgemini.librarymanagementsystemcollections.dto.RequestInfo;
import com.capgemini.librarymanagementsystemcollections.dto.Student;
import com.capgemini.librarymanagementsystemcollections.exception.LMSException;

public class StudentDAOImplement implements StudentDAO {
	Date returnDate = new Date();

	@Override
	public Student auth(String email, String password) {
		for (Student student : DataBase.STUDENT) {
			if (student.getEmail().equals(email) && student.getPassword().equals(password)) {
				return student;
			}
		}
		throw new LMSException("Invalid Credentials");
	}

	@Override
	public BookInfo search(int bookId) {
		for (BookInfo info : DataBase.BOOK) {
			if (info.getBookId() == bookId) {
				return info;
			}
		}
		throw new LMSException("Invalid search");
	}

	@Override
	public RequestInfo requestBook(Student student, BookInfo info) {

		boolean flag = false, isRequestExists = false;
		RequestInfo requestInfo = new RequestInfo();
		Student studentInfo2 = new Student();
		BookInfo bookInfo2 = new BookInfo();

		for (RequestInfo requestInfo2 : DataBase.REQUEST) {
			if (info.getBookId() == requestInfo2.getBookInfo().getBookId()) {
				isRequestExists = true;

			}

		}

		if (!isRequestExists) {
			for (Student student1 : DataBase.STUDENT) {
				if (student.getId() == student1.getId()) {
					for (BookInfo book : DataBase.BOOK) {
						if (book.getBookId() == info.getBookId()) {
							studentInfo2 = student1;
							bookInfo2 = book;
							flag = true;
						}
					}
				}
			}
			if (flag == true) {
				requestInfo.setBookInfo(bookInfo2);
				requestInfo.setStudent(studentInfo2);
				DataBase.REQUEST.add(requestInfo);
				return requestInfo;
			}

		}

		throw new LMSException("Invalid request or you cannot request that book");
	}

	@Override
	public RequestInfo returnBook(Student student, BookInfo info) {

		/*
		 * for(RequestInfo requestInfo3 : DataBase.REQUEST) {
		 * if(requestInfo3.getBookInfo().getBookId() == info.getBookId() &&
		 * requestInfo3.getStudent().getId() == student.getId() &&
		 * requestInfo3.isIssued() == true) {
		 * 
		 * System.out.println("Returing book issued only");
		 * requestInfo3.setReturned(true); requestInfo3.setReturnDate(returnDate);
		 * return requestInfo3; } } throw new LMSException("Invalid return"); }
		 */
		for (RequestInfo requestInfo : DataBase.REQUEST) {

			if (requestInfo.getBookInfo().getBookId() == info.getBookId()
					&& requestInfo.getStudent().getId() == student.getId() && requestInfo.isIssued() == true) {

				// if (requestInfo.isIssued() == true) {
				System.out.println("Returning Issued book only");
				requestInfo.setReturned(true);
				requestInfo.setReturnDate(returnDate);
				// info = requestInfo;

				return requestInfo;
			}

		}

		throw new LMSException("Invalid return ");
	}

}
