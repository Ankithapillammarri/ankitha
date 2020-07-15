package com.capgemini.librarymanagementsystemcollections.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.capgemini.librarymanagementsystemcollections.db.DataBase;
import com.capgemini.librarymanagementsystemcollections.dto.Admin;
import com.capgemini.librarymanagementsystemcollections.dto.BookInfo;
import com.capgemini.librarymanagementsystemcollections.dto.RequestInfo;
import com.capgemini.librarymanagementsystemcollections.dto.Student;
import com.capgemini.librarymanagementsystemcollections.exception.LMSException;

public class AdminDAOImplement implements AdminDAO {

	Date date = new Date();
	Date expectedReturnDate = new Date();
	Date returnDate = new Date();
	Calendar calendar = Calendar.getInstance();

	@Override
	public boolean register(Student info) {
		// boolean check;
		for (Student student : DataBase.STUDENT) {
			if ((student.getId() == info.getId()) || (student.getEmail().equals(student.getEmail()))) {
				throw new LMSException("User Already Exists");
			}
		}
		DataBase.STUDENT.add(info);
		return true;
	}

	@Override
	public BookInfo search(int bookId) {
		for (BookInfo book : DataBase.BOOK) {
			if (book.getBookId() == bookId) {
				return book;
			}
		}
		throw new LMSException("book not found");
	}

	@Override
	public Admin auth(String emailId, String password) {
		Admin bean = new Admin();
		// for(Admin admin:DataBase.ADMIN) {
		if (bean.getEmailId().equals(emailId) && bean.getPassword().equals(password)) {
			return bean;
		}
		// }
		throw new LMSException("Invalid Credentials");
	}

	@Override
	public boolean addBook(BookInfo info) {
		// boolean check;
		for (BookInfo book : DataBase.BOOK) {
			if (book.getBookId() == info.getBookId()) {
				// check=false;
				return false;
			}
		}
		DataBase.BOOK.add(info);
		return true;
	}

	@Override
	public boolean removeBook(BookInfo info) {
		boolean isFound = false;
		BookInfo book1 = null;
		for (BookInfo book : DataBase.BOOK) {
			if (book.getBookId() == info.getBookId()) {
				book1 = book;
				isFound = true;
			}
			if (isFound) {
				DataBase.BOOK.remove(book1);
				return true;
			}
		}
		return false;
	}

	@Override
	public List<BookInfo> showBooks() {

		List<BookInfo> bookList = new ArrayList<BookInfo>();
		for (BookInfo book : DataBase.BOOK) {

			book.getBookId();
			book.getBookName();
			book.getBookAuthor();
			book.getPublisher();
			bookList.add(book);

		}

		return bookList;
	}

	@Override
	public List<Student> showStudents() {

		List<Student> student = new ArrayList<Student>();
		for (Student student1 : DataBase.STUDENT) {
			student1.getId();
			student1.getName();
			student1.getEmail();
			student1.getPassword();
			// student1.getDepartmentNo();

			student.add(student1);

		}
		return student;
	}

	@Override
	public boolean issueBook(Student student, BookInfo info) {
		boolean isValid = false;
		// calendar.setTime(date);
		calendar.add(Calendar.DATE, 15);
		expectedReturnDate = calendar.getTime();

		// Student studentInfo = new Student();
		// BookInfo bookInfo = new BookInfo();
		RequestInfo requestInfo = new RequestInfo();

		int noOfBooksBorrowed = student.getNoOfBooksBorrowed();
		for (RequestInfo info1 : DataBase.REQUEST) {
			if (info1.getStudent().getId() == student.getId()) {
				if (info1.getBookInfo().getBookId() == info.getBookId()) {
					requestInfo = info1;

					isValid = true;
				}
			}
		}

		if (isValid) {
			System.out.println("I am entering into is valid");

			for (BookInfo info2 : DataBase.BOOK) {
				if (info2.getBookId() == info.getBookId()) {
					info = info2;
				}
			}

			for (Student student1 : DataBase.STUDENT) {
				if (student1.getId() == student.getId()) {
					student = student1;
					noOfBooksBorrowed = student.getNoOfBooksBorrowed();
				}
			}

			if (noOfBooksBorrowed < 3) {
				System.out.println("enter no of books borrowed");
				boolean isRemoved = DataBase.BOOK.remove(info);
				if (isRemoved) {
					System.out.println("book removed from db");
					System.out.println("enter into removing");
					noOfBooksBorrowed++;
					System.out.println(noOfBooksBorrowed);
					student.setNoOfBooksBorrowed(noOfBooksBorrowed);
					requestInfo.setIssued(true);
					requestInfo.setIssueDate(date);
					requestInfo.setExpectedReturnDate(expectedReturnDate);
					return true;
				} else {
					throw new LMSException("book cannot be borrowed");
				}
			} else {
				throw new LMSException("Student Exceeds maximum limit");
			}
		} else {
			throw new LMSException("Book data or Student data is incorrect");
		}
	}

	@Override
	public List<RequestInfo> showRequests() {

		List<RequestInfo> info = new ArrayList<RequestInfo>();
		for (RequestInfo requestInfo : DataBase.REQUEST) {
			requestInfo.getBookInfo();
			requestInfo.getStudent();
			requestInfo.isIssued();
			requestInfo.isReturned();
			info.add(requestInfo);
		}
		return info;
	}

	@Override
	public boolean isBookReceieved(Student student, BookInfo info) {
		boolean isValid = false;
		RequestInfo requestInfo1 = new RequestInfo();
		for (RequestInfo requestInfo : DataBase.REQUEST) {

			if (requestInfo.getBookInfo().getBookId() == info.getBookId()
					&& requestInfo.getStudent().getId() == student.getId() && requestInfo.isReturned() == true) {
				isValid = true;
				requestInfo1 = requestInfo;
			}
		}
		if (isValid) {
			info.setBookAuthor(requestInfo1.getBookInfo().getBookAuthor());
			info.setBookName(requestInfo1.getBookInfo().getBookName());
			info.setPrice(requestInfo1.getBookInfo().getPrice());
			DataBase.BOOK.add(info);
			DataBase.REQUEST.remove(requestInfo1);

			for (Student studentInfo : DataBase.STUDENT) {
				if (studentInfo.getId() == student.getId()) {
					student = studentInfo;
				}
			}

			int noOfBooksBorrowed = student.getNoOfBooksBorrowed();
			noOfBooksBorrowed--;
			student.setNoOfBooksBorrowed(noOfBooksBorrowed);
			return true;

		}
		return false;
	}
}
