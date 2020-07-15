package com.capgemini.librarymanagementsystemcollections.dao;

import com.capgemini.librarymanagementsystemcollections.dto.BookInfo;
import com.capgemini.librarymanagementsystemcollections.dto.RequestInfo;
import com.capgemini.librarymanagementsystemcollections.dto.Student;

public interface StudentDAO {
	Student auth(String email, String password);

	BookInfo search(int bookId);

	RequestInfo requestBook(Student student, BookInfo info);

	RequestInfo returnBook(Student student, BookInfo info);
}
