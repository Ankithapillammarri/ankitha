package com.capgemini.librarymanagementsystemcollections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.capgemini.librarymanagementsystemcollections.dao.StudentDAO;
import com.capgemini.librarymanagementsystemcollections.dao.StudentDAOImplement;
import com.capgemini.librarymanagementsystemcollections.dto.BookInfo;
import com.capgemini.librarymanagementsystemcollections.dto.RequestInfo;
import com.capgemini.librarymanagementsystemcollections.dto.Student;

public class StudentDAOTest {
	StudentDAO dao=new StudentDAOImplement();

	@Test
	public void testSearch() {
		BookInfo b = dao.search(123456);
		Assertions.assertNotNull(b);	
	}
	
	/*
	 * @Test public void testRequestBook() { BookInfo book = new BookInfo(); Student
	 * student = new Student(); book.setBookId(123456); student.setId(987654);
	 * boolean status = dao.requestBook(student, book); }
	 */
	@Test
	public void testbookRequest() {
		BookInfo book = new BookInfo();
		Student s = new Student();
		book.setBookId(123456);
		s.setId(234567);
		RequestInfo r=dao.requestBook(s, book);
		Assertions.assertNotNull(r);
	}
	@Test
	public void testbookReturn() {
		BookInfo book = new BookInfo();
		Student s = new Student();
		book.setBookId(123456);
		s.setId(234567);
		RequestInfo r=dao.returnBook(s, book);
		Assertions.assertNotNull(r);
	}
}
