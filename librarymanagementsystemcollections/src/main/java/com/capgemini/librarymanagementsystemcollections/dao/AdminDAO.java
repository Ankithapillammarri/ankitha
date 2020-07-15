package com.capgemini.librarymanagementsystemcollections.dao;

import java.util.List;

import com.capgemini.librarymanagementsystemcollections.dto.Admin;
import com.capgemini.librarymanagementsystemcollections.dto.BookInfo;
import com.capgemini.librarymanagementsystemcollections.dto.RequestInfo;
import com.capgemini.librarymanagementsystemcollections.dto.Student;

public interface AdminDAO {
	boolean register(Student info);

	Admin auth(String emailId, String password);

	boolean addBook(BookInfo info);

	BookInfo search(int bookId);

	boolean removeBook(BookInfo info);

	List<BookInfo> showBooks();

	List<Student> showStudents();

	List<RequestInfo> showRequests();

	boolean issueBook(Student student, BookInfo info);

	boolean isBookReceieved(Student student, BookInfo info);
}
