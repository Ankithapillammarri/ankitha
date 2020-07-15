package com.capgemini.librarymanagementsystemcollections;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.capgemini.librarymanagementsystemcollections.dao.AdminDAO;
import com.capgemini.librarymanagementsystemcollections.dao.AdminDAOImplement;
import com.capgemini.librarymanagementsystemcollections.dto.BookInfo;
import com.capgemini.librarymanagementsystemcollections.dto.RequestInfo;
import com.capgemini.librarymanagementsystemcollections.dto.Student;

public class AdminDAOTest {
	private AdminDAO dao = new AdminDAOImplement();
	
	@Test
	public void testRegister() {
		Student s1=new Student();
		s1.setEmail("pranu@gmail.com");
		s1.setId(987654);
		s1.setName("Pranath");
		s1.setPassword("Pranu@123");
		boolean status = dao.register(s1);
		Assertions.assertTrue(status);
	}

	@Test
	public void testAddBook() {
		BookInfo info = new BookInfo();
		info.setBookId(123456);
		info.setBookName("java");
		info.setBookAuthor("james");
		boolean status = dao.addBook(info);
		Assertions.assertTrue(status);
	}

	@Test
	public void testSearch() {
		BookInfo b = dao.search(123456);
		Assertions.assertNotNull(b);
		
	}

	@Test
	public void testRemoveBook() {
		BookInfo bi = new BookInfo();
		bi.setBookId(123456);
		boolean status = dao.removeBook(bi);
		Assertions.assertTrue(status);
	}

	@Test
	public void testShowBooks() {
		List<BookInfo> b1 = dao.showBooks();
		Assertions.assertNotNull(b1);
	}

	@Test
	public void testShowStudents() {
		List<Student> student = dao.showStudents();
		Assertions.assertNotNull(student);
	}

	@Test
	public void testShowRequests() {
		List<RequestInfo> request = dao.showRequests();
		Assertions.assertNotNull(request);
	}

	@Test
	public void testIssueBook() {
		BookInfo book = new BookInfo();
		Student s = new Student();
		book.setBookId(123456);
		s.setId(234567);
		boolean status = dao.issueBook(s, book);
		Assertions.assertTrue(status);
	}
	
	@Test
	public void testIsBookRecieved() {
		BookInfo book = new BookInfo();
		Student s = new Student();
		book.setBookId(123456);
		s.setId(234567);
		boolean status = dao.isBookReceieved(s, book);
		Assertions.assertTrue(status);
	}

}
