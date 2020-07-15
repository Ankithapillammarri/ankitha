package com.capgemini.librarymanagementsystemspringrest;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.librarymanagementsystemspringrest.dto.BorrowedBooksBean;
import com.capgemini.librarymanagementsystemspringrest.service.StudentService;

public class StudentServiceTest {
	@Autowired
	private StudentService service ;
		
		@Test
		public void testRequestValid() {
			boolean check = service.request(100202, 102);
			Assertions.assertTrue(check);		
		}
		
		@Test
		public void testRequestInvalid() {
			boolean check = service.request(100202, 109);
			Assertions.assertFalse(check);		
		}
		
		@Test
		public void testBorrowedBooksValid() {
			List<BorrowedBooksBean> info = service.borrowedBook();
			Assertions.assertNotNull(info);
			Assertions.assertEquals(1, info.size());
		}
		
		@Test
		public void testBorrowedBooksInvalid() {
			List<BorrowedBooksBean> info = service.borrowedBook();
			Assertions.assertNotNull(info);
			Assertions.assertNotEquals(6, info.size());
		}
		
		@Test
		public void testReturnBookValid() {
			boolean check = service.returnBook(102, 100202);
			Assertions.assertTrue(check);
		}
		
		@Test
		public void testReturnBookInvalid() {
			boolean check = service.returnBook(105, 100202);
			Assertions.assertFalse(check);
		}

}
