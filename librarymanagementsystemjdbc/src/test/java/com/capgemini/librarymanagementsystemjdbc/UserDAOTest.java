package com.capgemini.librarymanagementsystemjdbc;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.capgemini.librarymanagementsystemjdbc.dao.UserDAO;
import com.capgemini.librarymanagementsystemjdbc.dao.UserDAOImplement;
import com.capgemini.librarymanagementsystemjdbc.dto.BookBean;
import com.capgemini.librarymanagementsystemjdbc.dto.BookBorrow;
import com.capgemini.librarymanagementsystemjdbc.dto.BookIssue;
import com.capgemini.librarymanagementsystemjdbc.dto.BookRequest;
import com.capgemini.librarymanagementsystemjdbc.dto.User;

public class UserDAOTest {
	private UserDAO dao = new UserDAOImplement();
	@Test
	public void testRegisterValid() {
		User bean = new User();
		bean.setUserId(100005);
		bean.setFirstName("Pranu");
		bean.setLastName("Pillalamarri");
		bean.setEmail("pranu@gmail.com");
		bean.setPassword("Pranath@123");
		bean.setRole("student");
		boolean check = dao.register(bean);
		Assertions.assertTrue(check);		
	}
	
	@Test
	public void testRegisterInvalid() {
		User bean = new User();
		bean.setUserId(100005);
		bean.setFirstName("Pranu");
		bean.setLastName("Pillalamarri");
		bean.setEmail("pranu@gmail.com");
		bean.setPassword("Sridhar@123");
		bean.setRole("student");
		boolean check = dao.register(bean);
		Assertions.assertFalse(check);
	}

	@Test
	public void testLoginValid() {
		User info = dao.login("anki@gmail.com", "Anki@1234");
		Assertions.assertNotNull(info);
	}
	
	@Test
	public void testLoginInvalid() {
		User info = dao.login("anki@gmail.com", "Anki1234");
		Assertions.assertNull(info);
	}
	
	@Test
	public void testSearchBookByIdValid() {
		List<BookBean> info = dao.searchBookById(101);
		Assertions.assertNotNull(info);
		Assertions.assertEquals(1, info.size());
		
	}
	
	@Test
	public void testSearchBookByIdInvalid() {
		List<BookBean> info = dao.searchBookById(109);
		Assertions.assertNotNull(info);
		Assertions.assertEquals(0, info.size());		
	}
	
	@Test
	public void testSearchBookByTitleValid() {
		List<BookBean> info = dao.searchBookByTitle("English");
		Assertions.assertNotNull(info);
		Assertions.assertEquals(1, info.size());		
	}
	
	@Test
	public void testSearchBookByTitleInvalid() {
		List<BookBean> info = dao.searchBookByTitle("Maths");
		Assertions.assertNotNull(info);
		Assertions.assertEquals(0, info.size());		
	}
	
	@Test
	public void testSearchBookByAuthorValid() {
		List<BookBean> info = dao.searchBookByAuthor("Rk");
		Assertions.assertNotNull(info);
		Assertions.assertEquals(1, info.size());		
	}
	
	@Test
	public void testSearchBookByAuthorInvalid() {
		List<BookBean> info = dao.searchBookByAuthor("Vishwas");
		Assertions.assertNotNull(info);
		Assertions.assertEquals(0, info.size());	
	}
	
	@Test
	public void testBooksInfoValid() {
		List<BookBean> info = dao.getBooksInfo();
		Assertions.assertNotNull(info);
		Assertions.assertEquals(5, info.size());
	}
	
	@Test
	public void testBooksInfoInvalid() {
		List<BookBean> info = dao.getBooksInfo();
		Assertions.assertNotNull(info);
		Assertions.assertNotEquals(6, info.size());
	}
	
	@Test
	public void testUpdatePasswordValid() {
		boolean check = dao.updatePassword("anki@gmail.com", "Anki@1234", "Ankitha@123", "admin");
		Assertions.assertTrue(check);
	}
	
	@Test
	public void testUpdatePasswordInvalid() {
		boolean check = dao.updatePassword("anki@gmail.com", "Anki@1234", "Ankitha@123", "student");
		Assertions.assertFalse(check);
	}
	@Test
	public void testAddBookValid() {
		BookBean bean = new BookBean();
		bean.setBookId(105);
		bean.setBookName("Java");
		bean.setBookAuthor("James");
		bean.setCategory("Programing");
		bean.setPublisher("Arihent");
		boolean check = dao.addBook(bean);
		Assertions.assertTrue(check);
	}
	@Test
	public void testAddBookInvalid() {
		BookBean bean = new BookBean();
		bean.setBookId(105);
		bean.setBookName("Java");
		bean.setBookAuthor("James");
		bean.setCategory("Programing");
		bean.setPublisher("Arihent");
		boolean check = dao.addBook(bean);
		Assertions.assertFalse(check);	
	} 
	
	@Test
	public void testRemoveBookValid() {
		boolean check = dao.removeBook(105);
		Assertions.assertTrue(check);
	}
	
	@Test
	public void testRemoveBookInvalid() {
		boolean check = dao.removeBook(107);
		Assertions.assertFalse(check);
	}
	
	@Test
	public void testUpdateBookValid() {
		BookBean book = new BookBean();
		book.setBookId(104);
		book.setBookName("Maths");
		boolean check = dao.updateBook(book);
		Assertions.assertTrue(check);
	}
	
	@Test
	public void testUpdateBookInvalid() {
		BookBean book = new BookBean();
		book.setBookId(109);
		book.setBookName("Maths");
		boolean check = dao.updateBook(book);
		Assertions.assertFalse(check);
	}
	
	@Test
	public void testIssueBookValid() {
		boolean check = dao.issueBook(105, 100002);
		Assertions.assertTrue(check);
	}
	
	@Test
	public void testIssueBookInvalid() {
		boolean check = dao.issueBook(109, 100002);
		Assertions.assertFalse(check);
	}
	
	@Test
	public void testBookHistoryDetailsValid() {
		List<BookIssue> info = dao.bookHistoryDetails(100002);
		Assertions.assertNotNull(info);
		Assertions.assertEquals(1, info.size());		
	}
	
	@Test
	public void testBookHistoryDetailsInvalid() {
		List<BookIssue> info = dao.bookHistoryDetails(100003);
		Assertions.assertNotNull(info);
		Assertions.assertNotEquals(0, info.size());		
	}
	
	@Test
	public void testShowRequestsValid() {
		List<BookRequest> info = dao.showRequests();
		Assertions.assertNotNull(info);
		Assertions.assertEquals(1, info.size());		
	}
	
	@Test
	public void testShowRequestsInvalid() {
		List<BookRequest> info = dao.showRequests();
		Assertions.assertNotNull(info);
		Assertions.assertNotEquals(2, info.size());		
	}
	
	@Test
	public void testShowIssuedBooksValid() {
		List<BookIssue> info = dao.showIssuedBooks();
		Assertions.assertNotNull(info);
		Assertions.assertEquals(1, info.size());		
	}
	
	@Test
	public void testShowIssuedBooksInvalid() {
		List<BookIssue> info = dao.showIssuedBooks();
		Assertions.assertNotNull(info);
		Assertions.assertNotEquals(2, info.size());		
	}
	
	@Test
	public void testShowUsersValid() {
		List<User> info = dao.showUsers();
		Assertions.assertNotNull(info);
		Assertions.assertEquals(4, info.size());		
	}
	
	@Test
	public void testShowUsersInvalid() {
		List<User> info = dao.showUsers();
		Assertions.assertNotNull(info);
		Assertions.assertNotEquals(2, info.size());		
	}

	@Test
	public void testRequestValid() {
		boolean check = dao.request(100002, 105);
		Assertions.assertTrue(check);		
	}
	
	@Test
	public void testRequestInvalid() {
		boolean check = dao.request(100002, 109);
		Assertions.assertFalse(check);		
	}
	
	@Test
	public void testBorrowedBooksValid() {
		List<BookBorrow> info = dao.borrowedBook(100002);
		Assertions.assertNotNull(info);
		Assertions.assertEquals(1, info.size());
	}
	
	@Test
	public void testBorrowedBooksInvalid() {
		List<BookBorrow> info = dao.borrowedBook(100002);
		Assertions.assertNotNull(info);
		Assertions.assertNotEquals(6, info.size());
	}
	
	@Test
	public void testReturnBookValid() {
		boolean check = dao.returnBook(105, 100002, "yes");
		Assertions.assertTrue(check);
	}
	
	@Test
	public void testReturnBookInvalid() {
		boolean check = dao.returnBook(105, 100002, "yes");
		Assertions.assertFalse(check);
	}
}
