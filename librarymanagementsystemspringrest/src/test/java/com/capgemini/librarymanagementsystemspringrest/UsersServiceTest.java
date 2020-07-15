package com.capgemini.librarymanagementsystemspringrest;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.librarymanagementsystemspringrest.dto.BookBean;
import com.capgemini.librarymanagementsystemspringrest.dto.UsersBean;
import com.capgemini.librarymanagementsystemspringrest.service.UsersService;

public class UsersServiceTest {
	@Autowired
	private UsersService service ;
		
		@Test
		public void testRegisterValid() {
			UsersBean bean = new UsersBean();
			bean.setFirstName("Mohan");
			bean.setLastName("Pillalamarri");
			bean.setEmail("Pranu@gmail.com");
			bean.setPassword("Mohanp@1");
			bean.setRole("student");
			boolean check = service.register(bean);
			Assertions.assertTrue(check);		
		}
		
		@Test
		public void testRegisterInvalid() {
			UsersBean bean = new UsersBean();
			bean.setFirstName("Mohan");
			bean.setLastName("Pillalamarri");
			bean.setEmail("Pranu@gmail.com");
			bean.setPassword("Mohanp@1");
			bean.setRole("student");
			boolean check = service.register(bean);
			Assertions.assertFalse(check);
		}

		@Test
		public void testLoginValid() {
			UsersBean info = service.login("shailaja@gmail.com", "Shailaja@1");
			Assertions.assertNotNull(info);
		}
		
		@Test
		public void testLoginInvalid() {
			UsersBean info = service.login("shailaja@gmail.com", "Shailaja@1");
			Assertions.assertNull(info);
		}
		
		@Test
		public void testSearchBookByIdValid() {
			List<BookBean> info = service.searchBookById(102);
			Assertions.assertNotNull(info);
			Assertions.assertEquals(1, info.size());
			
		}
		
		@Test
		public void testSearchBookByIdInvalid() {
			List<BookBean> info = service.searchBookById(109);
			Assertions.assertNotNull(info);
			Assertions.assertEquals(0, info.size());		
		}
		
		@Test
		public void testSearchBookByTitleValid() {
			List<BookBean> info = service.searchBookByTitle("English");
			Assertions.assertNotNull(info);
			Assertions.assertEquals(1, info.size());		
		}
		
		@Test
		public void testSearchBookByTitleInvalid() {
			List<BookBean> info = service.searchBookByTitle("Maths");
			Assertions.assertNotNull(info);
			Assertions.assertEquals(0, info.size());		
		}
		
		@Test
		public void testSearchBookByAuthorValid() {
			List<BookBean> info = service.searchBookByAuthor("sharma");
			Assertions.assertNotNull(info);
			Assertions.assertEquals(1, info.size());		
		}
		
		@Test
		public void testSearchBookByAuthorInvalid() {
			List<BookBean> info = service.searchBookByAuthor("Rk");
			Assertions.assertNotNull(info);
			Assertions.assertEquals(0, info.size());	
		}
		
		@Test
		public void testBooksInfoValid() {
			List<BookBean> info = service.getBooksInfo();
			Assertions.assertNotNull(info);
			Assertions.assertEquals(5, info.size());
		}
		
		@Test
		public void testBooksInfoInvalid() {
			List<BookBean> info = service.getBooksInfo();
			Assertions.assertNotNull(info);
			Assertions.assertNotEquals(6, info.size());
		}
		
		@Test
		public void testUpdatePasswordValid() {
			boolean check = service.updatePassword(100202, "Shailaja@1", "Shailup@1", "admin");
			Assertions.assertTrue(check);
		}
		
		@Test
		public void testUpdatePasswordInvalid() {
			boolean check = service.updatePassword(100202, "Shailaja@1", "Shailup@1", "student");
			Assertions.assertFalse(check);
		}
		


}
