package com.capgemini.librarymanagementsystemjpa.controller;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.capgemini.librarymanagementsystemjpa.dto.BookBean;
import com.capgemini.librarymanagementsystemjpa.dto.BookBorrowBean;
import com.capgemini.librarymanagementsystemjpa.dto.BookIssueBean;
import com.capgemini.librarymanagementsystemjpa.dto.BookRequestBean;
import com.capgemini.librarymanagementsystemjpa.dto.UserBean;
import com.capgemini.librarymanagementsystemjpa.exception.LMSException;
import com.capgemini.librarymanagementsystemjpa.factory.LMSFactory;
import com.capgemini.librarymanagementsystemjpa.service.UsersService;
import com.capgemini.librarymanagementsystemjpa.validation.Validation;

public class LMSController {
	public static void doRegistration() {
		boolean flag = false;
		int regId = 0;
		String regFirstName = null;
		String regLastName = null;
		long regMobile = 0;
		String regEmail = null;
		String regPassword = null;
		String name = null;
		
		String bookName=null;
		String bookAuthor =null;
		String bookPublisher =null;
		String bookCategory = null;

		boolean loginStatus = true;
		Validation validation = new Validation();
		do {
			try (Scanner scanner = new Scanner(System.in);) {
				System.out.println("************Library Management System*************");
				System.out.println("Press 1 to Register");
				System.out.println("Press 2 to Login");
				System.out.println("Press 3 to EXIT");
				do {
					try {
						UsersService service1 = LMSFactory.getUsersService();
						int choice = scanner.nextInt();
						switch (choice) {
						case 1:

							do {
								try {
									System.out.println("Enter First Name :");
									regFirstName = scanner.next();
									validation.validatedName(regFirstName);
									flag = true;
								} catch (InputMismatchException e) {
									flag = false;
									System.err.println("Name should contains only Alphabates");
								} catch (LMSException e) {
									flag = false;
									System.err.println(e.getMessage());
								}
							} while (!flag);
							do {
								try {
									System.out.println("Enter Last Name :");
									regLastName = scanner.next();
									validation.validatedName(regLastName);
									flag = true;
								} catch (InputMismatchException e) {
									flag = false;
									System.err.println("Name should contains only Alphabates");
								} catch (LMSException e) {
									flag = false;
									System.err.println(e.getMessage());
								}
							} while (!flag);

							do {
								try {
									System.out.println("Enter Email :");
									regEmail = scanner.next();
									validation.validatedEmail(regEmail);
									flag = true;
								} catch (InputMismatchException e) {
									flag = false;
									System.err.println("Email should be proper ");
								} catch (LMSException e) {
									flag = false;
									System.err.println(e.getMessage());
								}
							} while (!flag);

							do {
								try {
									System.out.println("Enter Password :");
									regPassword = scanner.next();
									validation.validatedPassword(regPassword);
									flag = true;
								} catch (InputMismatchException e) {
									flag = false;
									System.err.println("Enter correct Password ");
								} catch (LMSException e) {
									flag = false;
									System.err.println(e.getMessage());
								}
							} while (!flag);

							do {
								try {
									System.out.println("Enter Mobile :");
									regMobile = scanner.nextLong();
									validation.validatedMobile(regMobile);
									flag = true;
								} catch (InputMismatchException e) {
									flag = false;
									System.err.println("Mobile Number  should contains only numbers");
								} catch (LMSException e) {
									flag = false;
									System.err.println(e.getMessage());
								}
							} while (!flag);
							System.out.println("Enter the role");
							String regRole = scanner.next();
							UserBean ai = new UserBean();
							ai.setUserId(regId);
							ai.setFirstName(regFirstName);
							ai.setLastName(regLastName);
							ai.setEmail(regEmail);
							ai.setPassword(regPassword);
							ai.setMobile(regMobile);
							ai.setRole(regRole);
							try {
								boolean check = service1.register(ai);
								if (check) {
									System.out.println("Registered");
								} else {
									System.out.println("Already user is registered");
								}
							} catch (LMSException e) {
								System.err.println(e.getMessage());
							}
							break;
						case 2:
							System.out.println("enter email");
							String email = scanner.next();
							System.out.println("enter password");
							String password = scanner.next();
							try {
								UserBean loginInfo = service1.login(email, password);
								if (loginInfo.getEmail().equals(email) && loginInfo.getPassword().equals(password)) {
									System.out.println("Logged In");
								}
								if (loginInfo.getRole().equals("admin")) {
									do {
										try {
											System.out.println("-----------------------------------------------");
											System.out.println("Press 1 to add book");
											System.out.println("Press 2 to remove book");
											System.out.println("Press 3 to issue book");
											System.out.println("Press 4 to Search the Book by Author");
											System.out.println("Press 5 to Search the Book by Title");
											System.out.println("Press 6 to Get the Book Information");
											System.out.println("Press 7 to Search the book by Id");
											System.out.println("Press 8 to update the book");
											System.out.println("Press 9 to check student book history");
											System.out.println("Press 10 to check requests");
											System.out.println("Press 11 to check issued books");
											System.out.println("Press 12 to view users");
											System.out.println("Press 13 to update Password");
											System.out.println("Press 14 to logout");

											int choice1 = scanner.nextInt();
											switch (choice1) {
											case 1:
												System.out.println("Add book");

												do {
													try {
														System.out.println("Enter book Name");
														bookName = scanner.next();
														validation.validatedName(bookName);
														flag = true;
													} catch (InputMismatchException e) {
														System.err.println("Book Name should contain alphabets");
														flag = false;
														scanner.next();
													} catch (LMSException e) {
														System.err.println(e.getMessage());
														flag = false;
													}
												} while (!flag);
												/*
												 * System.out.println("enter bookname"); String addName =
												 * scanner.next();
												 */
												do {
													try {
														System.out.println("Enter book Author");
														bookAuthor = scanner.next();
														validation.validatedName(bookAuthor);
														flag = true;
													} catch (InputMismatchException e) {
														System.err.println("Book Name should contain alphabets");
														flag = false;
														scanner.next();
													} catch (LMSException e) {
														System.err.println(e.getMessage());
														flag = false;
													}
												} while (!flag);

												do {
													try {
														System.out.println("Enter book category");
													bookCategory = scanner.next();
														validation.validatedName(bookCategory);
														flag = true;
													} catch (InputMismatchException e) {
														System.err.println("Book Name should contain alphabets");
														flag = false;
														scanner.next();
													} catch (LMSException e) {
														System.err.println(e.getMessage());
														flag = false;
													}
												} while (!flag);
												do {
													try {
														System.out.println("Enter book publisher");
													bookPublisher = scanner.next();
														validation.validatedName(bookPublisher);
														flag = true;
													} catch (InputMismatchException e) {
														System.err.println("Book Name should contain alphabets");
														flag = false;
														scanner.next();
													} catch (LMSException e) {
														System.err.println(e.getMessage());
														flag = false;
													}
												} while (!flag);

												/*
												 * System.out.println("enter publisher"); String addPublisher =
												 * scanner.next();
												 */
												BookBean bi = new BookBean();
												bi.setBookName(bookName);
												bi.setBookAuthor(bookAuthor);
												bi.setCategory(bookCategory);
												bi.setPublisher(bookPublisher);

												try {
													boolean check2 = service1.addBook(bi);
													if (check2) {
														System.out.println(
																"-----------------------------------------------");
														System.out.println("Added Book");
													} else {
														System.out.println(
																"-----------------------------------------------");
														System.out.println("Book not added");
													}
												} catch (LMSException e) {
													System.err.println(e.getMessage());
												}
												break;
											case 2:

												System.out.println("enter id");
												int removeId = scanner.nextInt();

												try {
													boolean check3 = service1.removeBook(removeId);
													if (check3) {
														System.out.println(
																"-----------------------------------------------");
														System.out.println("Removed Book");
													} else {
														System.out.println(
																"-----------------------------------------------");
														System.out.println("Book not removed");
													}
												} catch (LMSException e) {
													System.err.println(e.getMessage());
												}
												break;

											case 3:
												System.out.println("enter Book Id");
												int issueId = scanner.nextInt();
												System.out.println("Enter User Id");
												int userId = scanner.nextInt();
												try {
													boolean check4 = service1.issueBook(issueId, userId);
													if (check4) {
														System.out.println(
																"-----------------------------------------------");
														System.out.println("Book Issued");
													} else {
														System.out.println(
																"-----------------------------------------------");
														System.out.println("Book not issued");
													}
												} catch (LMSException e) {
													System.err.println(e.getMessage());
												}
												break;
											case 4:
												do {
													try {
														System.out.println("Search the book by the Author Name:");
														name = scanner.next();
														validation.validatedName(name);
														flag = true;
													} catch (InputMismatchException e) {
														System.err.println("Book Name should contain alphabets");
														flag = false;
														scanner.next();
													} catch (LMSException e) {
														System.err.println(e.getMessage());
														flag = false;
													}
												} while (!flag);
												try {
													List<BookBean> bookauthor = service1.searchBookByAuthor(name);

													System.out.println(String.format("%-10s %-25s %-25s %-20s %s",
															"Book-Id", "Book-Name", "Author", "Category", "Publisher"));
													for (BookBean bookBean : bookauthor) {

														if (bookBean != null) {
															System.out.println(String.format(
																	"%-10s %-25s %-25s %-20s %s", bookBean.getBookId(),
																	bookBean.getBookName(), bookBean.getBookAuthor(),
																	bookBean.getCategory(), bookBean.getPublisher()));
														} else {
															System.out.println(
																	"-----------------------------------------------");
															System.out.println(
																	"No books are available written by this author");
														}
													}
												} catch (LMSException e) {
													System.err.println(e.getMessage());
												}
												break;
											case 5:
												do {
													try {
														System.out.println("Search the book by the book Name:");
														name = scanner.next();
														validation.validatedName(name);
														flag = true;
													} catch (InputMismatchException e) {
														System.err.println("Book Name should contain alphabets");
														flag = false;
														scanner.next();
													} catch (LMSException e) {
														System.err.println(e.getMessage());
														flag = false;
													}
												} while (!flag);
												try {
													List<BookBean> booktitle = service1.searchBookByTitle(name);
													System.out.println(String.format("%-10s %-25s %-25s %-20s %s",
															"Book-Id", "Book-Name", "Author", "Category", "Publisher"));
													for (BookBean bookBean : booktitle) {
														if (bookBean != null) {

															System.out.println(String.format(
																	"%-10s %-25s %-25s %-20s %s", bookBean.getBookId(),
																	bookBean.getBookName(), bookBean.getBookAuthor(),
																	bookBean.getCategory(), bookBean.getPublisher()));

														} else {
															System.out.println(
																	"-----------------------------------------------");
															System.out
																	.println("No books are available with this title.");
														}
													}
												} catch (LMSException e) {
													System.err.println(e.getMessage());
												}
												break;

											case 6:
												try {
													List<BookBean> info = service1.getBooksInfo();
													System.out.println(String.format("%-10s %-25s %-25s %-20s %s",
															"Book-Id", "Book-Name", "Author", "Category", "Publisher"));
													for (BookBean bookBean : info) {
														if (bookBean != null) {
															System.out.println(String.format(
																	"%-10s %-25s %-25s %-20s %s", bookBean.getBookId(),
																	bookBean.getBookName(), bookBean.getBookAuthor(),
																	bookBean.getCategory(), bookBean.getPublisher()));

														} else {
															System.out.println(
																	"-----------------------------------------------");
															System.out.println("Books info is not present");
														}
													}
												} catch (LMSException e) {
													System.err.println(e.getMessage());
												}
												break;
											case 7:
												System.out.println("  Search the book by the Book_ID :");
												int book_Id = scanner.nextInt();
												try {
													List<BookBean> bId = service1.searchBookById(book_Id);
													System.out.println(String.format("%-10s %-25s %-25s %-20s %s",
															"Book-Id", "Book-Name", "Author", "Category", "Publisher"));
													for (BookBean bookBean : bId) {
														if (bookBean != null) {
															System.out.println(String.format(
																	"%-10s %-25s %-25s %-20s %s", bookBean.getBookId(),
																	bookBean.getBookName(), bookBean.getBookAuthor(),
																	bookBean.getCategory(), bookBean.getPublisher()));

														} else {
															System.out.println(
																	"-----------------------------------------------");
															System.out.println("No books are available with this ID.");
														}
													}
												} catch (LMSException e) {
													System.err.println(e.getMessage());
												}
												break;
											case 8:
												System.out.println("Enter the updated id :");
												int bid = scanner.nextInt();
												System.out.println("Enter bookName to be updtaed");
												String updatedBookName = scanner.next();
												BookBean bean2 = new BookBean();
												bean2.setBookId(bid);
												bean2.setBookName(updatedBookName);
												try {
													boolean updated = service1.updateBook(bean2);
													if (updated) {
														System.out.println(
																"-----------------------------------------------");
														System.out.println("Book is updated");
													} else {
														System.out.println(
																"-----------------------------------------------");
														System.out.println("Book is not updated");
													}
												} catch (LMSException e) {
													System.err.println(e.getMessage());
												}
												break;

											case 9:
												/*
												 * // System.out.println("Enter the User Id"); // int user_Id =
												 * scanner.nextInt(); // try { // List<Integer> uid =
												 * service1.bookHistoryDetails(user_Id); // for (Integer issueDetails :
												 * uid) { // if(issueDetails != null) { //
												 * System.out.println("-----------------------------------------------")
												 * ; // System.out.println("No of books Borrowed :"+issueDetails); // }
												 * else { //
												 * System.out.println("-----------------------------------------------")
												 * ; // System.out.println("Respective user hasn't borrowed any books");
												 * // } // } // }catch (LMSException e) { //
												 * System.err.println(e.getMessage()); // } // break;
												 */
											case 10:
												System.out.println(" Requests received are:");
												try {
													List<BookRequestBean> requests = service1.showRequests();
													System.out.println(String.format("%10s %-10s %-10s %-25s %s", "id",
															"User_Id", "Book_Id", "User_Email", "BookName"));
													for (BookRequestBean requestBean : requests) {
														if (requestBean != null) {
															System.out.println(String.format(
																	"%-10s %-10s %-10s %-25s %s", requestBean.getId(),
																	requestBean.getUserId(), requestBean.getBookId(),
																	requestBean.getEmail(), requestBean.getBookName()));
														} else {
															System.out.println(
																	"-----------------------------------------------");
															System.out.println("No Requests are received");
														}
													}
												} catch (LMSException e) {
													System.err.println(e.getMessage());
												}
												break;
											case 11:
												System.out.println("Issued Books are:");
												try {
													List<BookIssueBean> issuedBooks = service1.showIssuedBooks();
													System.out.println(String.format("%-10s %-10s %-10s %25s %s", "Id",
															"User_Id", "Book_Id", "Issue_Date", "Return_Date"));
													for (BookIssueBean issueBean : issuedBooks) {
														if (issueBean != null) {
															System.out.println(String.format(
																	"%-10s %-10s %-10s %25s %s", issueBean.getId(),
																	issueBean.getUserId(), issueBean.getBookId(),
																	issueBean.getIssueDate(),
																	issueBean.getReturnDate()));

														} else {
															System.out.println(
																	"-----------------------------------------------");
															System.out.println("No book has been issued");
														}
													}
												} catch (LMSException e) {
													System.err.println(e.getMessage());
												}
												break;
											case 12:
												System.out.println("Users are:");
												try {
													List<UserBean> users = service1.showUsers();
													System.out.println(
															String.format("%-10s %-15s %-15s %-15s %-10s %-10s %s",
																	"UserId", "FirstName", "LastName", "Email",
																	"Password", "Mobile", "Role"));
													for (UserBean bean : users) {
														if (bean != null) {
															System.out.println(String.format(
																	"%-10s %-15s %-15s %-15s %-10s %-10s %s",
																	bean.getUserId(), bean.getFirstName(),
																	bean.getLastName(), bean.getEmail(),
																	bean.getPassword(), bean.getMobile(),
																	bean.getRole()));
														} else {
															System.out.println(
																	"-----------------------------------------------");
															System.out.println("No Users are present");
														}
													}
												} catch (LMSException e) {
													System.err.println(e.getMessage());
												}
												break;
											case 13:
												System.out.println("Enter the email :");
												String email_Id = scanner.next();
												System.out.println("Enter the Old password");
												String old_Password = scanner.next();
												System.out.println("Enter the new password");
												String new_Password = scanner.next();
												String user_Role = loginInfo.getRole();
												try {
													boolean updated = service1.updatePassword(email_Id, old_Password,
															new_Password, user_Role);
													if (updated) {
														System.out.println(
																"-----------------------------------------------");
														System.out.println("Password is updated");
													} else {
														System.out.println(
																"-----------------------------------------------");
														System.out.println("Password is not updated");
													}
												} catch (LMSException e) {
													System.err.println(e.getMessage());
												}
												break;

											case 14:
												doRegistration();

											default:
												System.out.println("-----------------------------------------------");
												System.out.println("Invalid Choice");
												break;
											}
										} catch (InputMismatchException ex) {
											System.out
													.println("Incorrect entry. Please input only a positive integer.");
											scanner.nextLine();
										}
									} while (true);
								} else if (loginInfo.getRole().equals("student")) {
									do {
										try {
											System.out.println("-----------------------------------------------");
											System.out.println("Press 1 to request book");
											System.out.println("Press 2 to view the books borrowed");
											System.out.println("Press 3 to search book by author");
											System.out.println("Press 4 to search book by title");
											System.out.println("Press 5 to search book by Id");
											System.out.println("Press 6 to get books info");
											System.out.println("Press 7 to return book");
											System.out.println("Press 8 to update password");
											System.out.println("Press 9 to main");

											int choice2 = scanner.nextInt();
											switch (choice2) {
											case 1:
												System.out.println("Enter the Book Id:");
												int reqBookId = scanner.nextInt();
												System.out.println("Enter the user Id:");
												int reqUserId = scanner.nextInt();
												try {
													if (loginInfo.getUserId() == reqUserId) {
														boolean requested = service1.request(reqBookId, reqUserId);
														if (requested != false) {
															System.out.println(
																	"-----------------------------------------------");
															System.out.println("Book is Requested");
														} else {
															System.out.println(
																	"-----------------------------------------------");
															System.out.println("Book is not Requested");
														}
													} else {
														System.out.println("Enter the correct UserId");
													}
												} catch (LMSException e) {
													System.err.println(e.getMessage());
												}
												break;

											case 2:
												System.out.println("Enter the user Id");
												int user_Id = scanner.nextInt();
												try {
													if (loginInfo.getUserId() == user_Id) {
														List<BookBorrowBean> borrowedBookList = service1
																.borrowedBook(user_Id);
														System.out.println(String.format("%-5s %-5s %-5s %s", "Id",
																"User-Id", "Book-Id", "BookName"));
														for (BookBorrowBean bookBean : borrowedBookList) {

															if (bookBean != null) {
																System.out.println(String.format("%-5s %-5s %-5s %s",
																		bookBean.getId(), bookBean.getUserId(),
																		bookBean.getBookId(), bookBean.getBookName()));
															} else {
																System.out.println(
																		"-----------------------------------------------");
																System.out.println("No books are borrowed by the user");
															}
														}
													} else {
														System.out.println("Incorrect user_Id");
													}
												} catch (LMSException e) {
													System.err.println(e.getMessage());
												}
												break;

											case 3:
												do {
													try {
														System.out.println("Search the book by the Author Name:");
														name = scanner.next();
														validation.validatedName(name);
														flag = true;
													} catch (InputMismatchException e) {
														System.err.println("Book Name should contain alphabets");
														flag = false;
														scanner.next();
													} catch (LMSException e) {
														System.err.println(e.getMessage());
														flag = false;
													}
												} while (!flag);

												try {
													List<BookBean> bookauthor = service1.searchBookByAuthor(name);
													System.out.println(String.format("%-10s %-25s %-25s %-20s %s",
															"Book-Id", "Book-Name", "Author", "Category", "Publisher"));

													for (BookBean bookBean : bookauthor) {

														if (bookBean != null) {
															System.out.println(String.format(
																	"%-10s %-25s %-25s %-20s %s", bookBean.getBookId(),
																	bookBean.getBookName(), bookBean.getBookAuthor(),
																	bookBean.getCategory(), bookBean.getPublisher()));

														} else {
															System.out.println(
																	"-----------------------------------------------");
															System.out.println(
																	"No books are available written by this author");
														}
													}
												} catch (LMSException e) {
													System.err.println(e.getMessage());
												}
												break;
											case 4:
												do {
													try {
														System.out.println("Search the book by the Book Name:");
														name = scanner.next();
														validation.validatedName(name);
														flag = true;
													} catch (InputMismatchException e) {
														System.err.println("Book Name should contain alphabets");
														flag = false;
														scanner.next();
													} catch (LMSException e) {
														System.err.println(e.getMessage());
														flag = false;
													}
												} while (!flag);

												try {
													List<BookBean> booktitle = service1.searchBookByTitle(name);
													System.out.println(String.format("%-10s %-25s %-25s %-20s %s",
															"Book-Id", "Book-Name", "Author", "Category", "Publisher"));
													for (BookBean bookBean : booktitle) {
														if (bookBean != null) {
															System.out.println(String.format(
																	"%-10s %-25s %-25s %-20s %s", bookBean.getBookId(),
																	bookBean.getBookName(), bookBean.getBookAuthor(),
																	bookBean.getCategory(), bookBean.getPublisher()));

														} else {
															System.out.println(
																	"-----------------------------------------------");
															System.out
																	.println("No books are available with this title.");
														}
													}
												} catch (LMSException e) {
													System.err.println(e.getMessage());
												}
												break;
											case 5:
												System.out.println("  Search the book by the Book_ID :");
												int book_Id = scanner.nextInt();

												try {
													List<BookBean> bId = service1.searchBookById(book_Id);
													System.out.println(String.format("%-10s %-25s %-25s %-20s %s",
															"Book-Id", "Book-Name", "Author", "Category", "Publisher"));
													for (BookBean bookBean : bId) {
														if (bookBean != null) {
															System.out.println(String.format(
																	"%-10s %-25s %-25s %-20s %s", bookBean.getBookId(),
																	bookBean.getBookName(), bookBean.getBookAuthor(),
																	bookBean.getCategory(), bookBean.getPublisher()));

														} else {
															System.out.println(
																	"-----------------------------------------------");
															System.out
																	.println("No books are available with this title.");
														}
													}
												} catch (LMSException e) {
													System.err.println(e.getMessage());
												}
												break;
											case 6:
												try {
													List<BookBean> info = service1.getBooksInfo();
													System.out.println(String.format("%-10s %-25s %-25s %-20s %s",
															"Book-Id", "Book-Name", "Author", "Category", "Publisher"));
													for (BookBean bookBean : info) {

														if (bookBean != null) {
															System.out.println(String.format(
																	"%-10s %-25s %-25s %-20s %s", bookBean.getBookId(),
																	bookBean.getBookName(), bookBean.getBookAuthor(),
																	bookBean.getCategory(), bookBean.getPublisher()));

														} else {
															System.out.println(
																	"-----------------------------------------------");
															System.out.println("Books info is not presernt");
														}
													}
												} catch (LMSException e) {
													System.err.println(e.getMessage());
												}
												break;
											case 7:
												System.out.println("Enter the Book id to return :");
												int returnId = scanner.nextInt();
												System.out.println("Enter userId");
												int userId = scanner.nextInt();
												System.out.println("Enter the status of the book");
												String status = scanner.next();
												try {
													if (loginInfo.getUserId() == userId) {
														boolean returned = service1.returnBook(returnId, userId,
																status);
														if (returned != false) {
															System.out.println(
																	"-----------------------------------------------");
															System.out.println("Book is Returned");
														} else {
															System.out.println(
																	"-----------------------------------------------");
															System.out.println("Book is not Returned");
														}
													} else {
														System.out.println("Invalid userId");
													}
												} catch (LMSException e) {
													System.err.println(e.getMessage());
												}
												break;

											case 8:
												System.out.println("Enter the email :");
												String email_Id = scanner.next();
												System.out.println("Enter the Old password");
												String old_Password = scanner.next();
												System.out.println("Enter the new password");
												String new_Password = scanner.next();
												String user_Role = loginInfo.getRole();
												try {
													boolean updated = service1.updatePassword(email_Id, old_Password,
															new_Password, user_Role);
													if (updated) {
														System.out.println(
																"-----------------------------------------------");
														System.out.println("Password is updated");
													} else {
														System.out.println(
																"-----------------------------------------------");
														System.out.println("Password is not updated");
													}
												} catch (LMSException e) {
													System.err.println(e.getMessage());
												}
												break;

											case 9:
												doRegistration();
											default:
												break;
											}
										} catch (InputMismatchException ex) {
											System.out
													.println("Incorrect entry. Please input only a positive integer.");
											scanner.nextLine();
										}
									} while (true);
								}
							} catch (Exception e) {
								System.out.println("Invalid Credentials");
								System.out.println("Try logging in again,Press 2 to login");
							}
							break;

						case 3:
							System.out.println("EXIT");
							System.exit(0);

						default:
							break;
						}
					} catch (InputMismatchException ex) {
						System.out.println("Incorrect entry. Please input only a positive integer.");
						scanner.nextLine();
					}
				} while (true);
			}
		} while (loginStatus);
	}
}
