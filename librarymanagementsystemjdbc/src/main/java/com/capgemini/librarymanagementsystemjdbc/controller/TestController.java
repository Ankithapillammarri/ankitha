package com.capgemini.librarymanagementsystemjdbc.controller;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.capgemini.librarymanagementsystemjdbc.dto.BookBean;
import com.capgemini.librarymanagementsystemjdbc.dto.BookBorrow;
import com.capgemini.librarymanagementsystemjdbc.dto.BookIssue;
import com.capgemini.librarymanagementsystemjdbc.dto.BookRequest;
import com.capgemini.librarymanagementsystemjdbc.dto.User;
import com.capgemini.librarymanagementsystemjdbc.exception.LMSException;
import com.capgemini.librarymanagementsystemjdbc.factory.LMSFactory;
import com.capgemini.librarymanagementsystemjdbc.service.UserService;
import com.capgemini.librarymanagementsystemjdbc.validation.Validation;

public class TestController {
	public static void main(String[] args) {
		doRegistration();
	}

	public static void doRegistration() {
		boolean flag = false;

		int id = 0;
		String firstName = null;
		String lastName = null;
		String email1 = null;
		String password1 = null;
		long mobile = 0;
		String name = null;

		// Double price = 0.0;

		boolean loginStatus = true;
		Validation validation = new Validation();
		do {
			try (Scanner scanner = new Scanner(System.in);) {
				System.out.println("========*LIBRARY MANAGEMENT SYSTEM*=======");
				System.out.println("Press 1 to User Register");
				System.out.println("Press 2 to Admin Login (or) Student Login");
				System.out.println("Press 3 to EXIT");
				do {
					try {
						UserService service1 = LMSFactory.getUserService();
						int choice = scanner.nextInt();
						switch (choice) {
						case 1:
							do {
								try {
									System.out.println("Enter Id");
									id = scanner.nextInt();
									validation.validatedId(id);
									flag = true;
								} catch (InputMismatchException e) {
									System.err.println("Id should contain only digits");
									flag = false;
									scanner.next();
								} catch (LMSException e) {
									System.err.println(e.getMessage());
									flag = false;
								}
							} while (!flag);

							do {
								try {
									System.out.println("Enter First Name :");
									firstName = scanner.next();
									validation.validatedName(firstName);
									flag = true;
								} catch (InputMismatchException e) {
									flag = false;
									System.err.println("Name should contain atleast 3 characters and only alphabets");
									scanner.next();
								} catch (LMSException e) {
									flag = false;
									System.err.println(e.getMessage());
								}
							} while (!flag);
							do {
								try {
									System.out.println("Enter Last Name :");
									lastName = scanner.next();
									validation.validatedName(lastName);
									flag = true;
								} catch (InputMismatchException e) {
									flag = false;
									System.err.println("Name should contain atleast 3 characters and only alphabets");
									scanner.next();
								} catch (LMSException e) {
									flag = false;
									System.err.println(e.getMessage());
								}
							} while (!flag);

							do {
								try {
									System.out.println("Enter Email :");
									email1 = scanner.next();
									validation.validatedEmail(email1);
									flag = true;
								} catch (InputMismatchException e) {
									flag = false;
									System.err.println("Enter Correct Email");
								} catch (LMSException e) {
									flag = false;
									System.err.println(e.getMessage());
								}
							} while (!flag);
							do {
								try {
									System.out.println("Enter password");
									password1 = scanner.next();
									validation.validatedPassword(password1);
									flag = true;
								} catch (LMSException e) {
									System.err.println(e.getMessage());
									flag = false;
								}
							} while (!flag);

							do {
								try {
									System.out.println("Enter Mobile :");
									mobile = scanner.nextLong();
									validation.validatedMobile(mobile);
									flag = true;
								} catch (InputMismatchException e) {
									System.err.println("Mobile Number should contains only numbers");
									flag = false;
									scanner.next();
								} catch (LMSException e) {
									flag = false;
									System.err.println(e.getMessage());
								}
							} while (!flag);
							System.out.println("Enter the Role : admin (or) student ");
							String regRole = scanner.next();
							User ai = new User();
							ai.setUserId(id);
							ai.setFirstName(firstName);
							ai.setLastName(lastName);
							ai.setEmail(email1);
							ai.setPassword(password1);
							ai.setMobile(mobile);
							ai.setRole(regRole);
							boolean check = service1.register(ai);
							if (check) {
								System.out.println(regRole + " Registered ");

							} else {
								System.out.println("Already  user is registered");
								doRegistration();
							}
							break;
						case 2:
							System.out.println("Enter Email");
							String email = scanner.next();
							System.out.println("Enter Password");
							String password = scanner.next();
							try {
								User loginInfo = service1.login(email, password);
								if (loginInfo.getEmail().equals(email) && loginInfo.getPassword().equals(password)) {
									System.out.println("Logged In");
								}
								if (loginInfo.getRole().equals("admin")) {
									do {
										System.out.println("-----------------------------------------------");
										System.out.println("Press 1 to Add Book");
										System.out.println("Press 2 to Remove Book");
										System.out.println("Press 3 to Issue Book");
										System.out.println("Press 4 to Search the Book by Author");
										System.out.println("Press 5 to Search the Book by Id");
										System.out.println("Press 6 to Search the book by BookName ");
										System.out.println("Press 7 to Get the Book Information");
										System.out.println("Press 8 to View users");
										System.out.println("Press 9 to Check student bookborrow history");
										System.out.println("Press 10 to Check requests");
										System.out.println("Press 11 to Check issued books");
										System.out.println("Press 12 to Update the bookName");
										System.out.println("Press 13 to Update Password");
										System.out.println("Press 14 to Logout");

										int choice1 = scanner.nextInt();
										switch (choice1) {
										case 1:
											System.out.println("Add book");
											do {
												try {
													System.out.println("Enter book Id");
													id = scanner.nextInt();
													validation.validatedId(id);
													flag = true;
												} catch (InputMismatchException e) {
													System.err.println("Id should contain only digits");
													flag = false;
													scanner.next();
												} catch (LMSException e) {
													System.err.println(e.getMessage());
													flag = false;
												}
											} while (!flag);

											do {
												try {
													System.out.println("Enter book Name");
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

											do {
												try {
													System.out.println("Enter book Author");
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

											do {
												try {
													System.out.println("Enter book category");
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

											do {
												try {
													System.out.println("Enter book Publisher");
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

											BookBean bi = new BookBean();
											bi.setBookId(id);
											bi.setBookName(name);
											bi.setBookAuthor(name);
											bi.setCategory(name);
											bi.setPublisher(name);
											try {
												boolean check2 = service1.addBook(bi);
												if (check2) {
													System.out
															.println("-----------------------------------------------");
													System.out.println("Added Book");
												} else {
													System.out
															.println("-----------------------------------------------");
													System.out.println("Book not added");
												}
											} catch (LMSException e) {
												System.err.println(e.getMessage());
											}

											break;
										case 2:

											do {
												try {
													System.out.println("Enter book Id to remove");
													id = scanner.nextInt();
													validation.validatedId(id);
													flag = true;
												} catch (InputMismatchException e) {
													System.err.println("Id should contain only digits");
													flag = false;
													scanner.next();
												} catch (LMSException e) {
													System.err.println(e.getMessage());
													flag = false;
												}
											} while (!flag);
											try {
												boolean check3 = service1.removeBook(id);
												if (check3) {
													System.out
															.println("-----------------------------------------------");
													System.out.println("BookID" + id + " is Removed");
												} else {
													System.out
															.println("-----------------------------------------------");
													System.out.println(
															"BookID " + id + " is already removed (or) does not exit");
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
													System.out
															.println("-----------------------------------------------");
													System.out.println("BookID " + issueId + " is Issued");
												} else {
													System.out
															.println("-----------------------------------------------");
													System.out.println("Book is not Issused");
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
														"Book-Id", "Book-Name", "Author", "Category",
														"Publisher"));
												for (BookBean bookBean : bookauthor) {

													if (bookBean != null) {
														System.out.println(String.format(
																"%-10s %-25s %-25s %-20s %s",
																bookBean.getBookId(), bookBean.getBookName(),
																bookBean.getBookAuthor(),
																bookBean.getCategory(),
																bookBean.getPublisher()));
														/*
														 * System.out.println(
														 * "-----------------------------------------------");
														 * System.out.println("Book_Id is-->" + bookBean.getBookId());
														 * System.out.println("Book_Name is-->" +
														 * bookBean.getBookName()); System.out.println(
														 * "Book_Author is-->" + bookBean.getBookAuthor());
														 * System.out.println( "Book_PublisherName is-->" +
														 * bookBean.getPublisher()); System.out.println(
														 * "Book_Category is-->" + bookBean.getCategory());
														 */
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
													System.out.println("Search the book by the Book_ID :");
													id = scanner.nextInt();
													validation.validatedId(id);
													flag = true;
												} catch (InputMismatchException e) {
													System.err.println("Id should contain only digits");
													flag = false;
													scanner.next();
												} catch (LMSException e) {
													System.err.println(e.getMessage());
													flag = false;
												}
											} while (!flag);
											try {
												List<BookBean> bId = service1.searchBookById(id);
												System.out.println(String.format("%-10s %-25s %-25s %-20s %s",
														"Book-Id", "Book-Name", "Author", "Category",
														"Publisher"));
												for (BookBean bookBean : bId) {
													if (bookBean != null) {
														System.out.println(String.format(
																"%-10s %-25s %-25s %-20s %s",
																bookBean.getBookId(), bookBean.getBookName(),
																bookBean.getBookAuthor(),
																bookBean.getCategory(),
																bookBean.getPublisher()));
														/*
														 * System.out.println(
														 * "-----------------------------------------------");
														 * System.out.println("Book_Id is-->" + bookBean.getBookId());
														 * System.out.println("Book_Name is-->" +
														 * bookBean.getBookName()); System.out.println(
														 * "Book_Author is-->" + bookBean.getBookAuthor());
														 * System.out.println( "Book_PublisherName is-->" +
														 * bookBean.getPublisher()); System.out.println(
														 * "Book_Category is-->" + bookBean.getCategory());
														 */
														// System.out.println("No_Of_Copies
														// are-->"+bookBean.getCopies());
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
										case 6:
											do {
												try {
													System.out.println("Search the book by the title Name:");
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

											List<BookBean> bId = service1.searchBookByTitle(name);
											System.out.println(String.format("%-10s %-25s %-25s %-20s %s",
													"Book-Id", "Book-Name", "Author", "Category",
													"Publisher"));
											for (BookBean bookBean : bId) {
												if (bookBean != null) {
													System.out.println(String.format(
															"%-10s %-25s %-25s %-20s %s",
															bookBean.getBookId(), bookBean.getBookName(),
															bookBean.getBookAuthor(),
															bookBean.getCategory(),
															bookBean.getPublisher()));
													/*
													 * System.out
													 * .println("-----------------------------------------------");
													 * System.out.println("Book_Id is-->" + bookBean.getBookId());
													 * System.out.println("Book_Name is-->" + bookBean.getBookName());
													 * System.out.println("Book_Author is-->" +
													 * bookBean.getBookAuthor()); System.out.println(
													 * "Book_PublisherName is-->" + bookBean.getPublisher());
													 * System.out.println("Book_Category is-->" +
													 * bookBean.getCategory());
													 */
												} else {
													System.out
															.println("-----------------------------------------------");
													System.out.println("No books are available with this title.");
												}
											}
											break;

										case 7:
											try {
												List<BookBean> info = service1.getBooksInfo();
												System.out.println(String.format("%-10s %-25s %-25s %-20s %s",
														"Book-Id", "Book-Name", "Author", "Category",
														"Publisher"));
												for (BookBean bookBean : info) {

													if (bookBean != null) {
														System.out.println(String.format(
																"%-10s %-25s %-25s %-20s %s",
																bookBean.getBookId(), bookBean.getBookName(),
																bookBean.getBookAuthor(),
																bookBean.getCategory(),
																bookBean.getPublisher()));
														/*
														 * System.out.println(
														 * "-----------------------------------------------");
														 * System.out.println("Book_Id is-->" + bookBean.getBookId());
														 * System.out.println("Book_Name is-->" +
														 * bookBean.getBookName()); System.out.println(
														 * "Book_Author is-->" + bookBean.getBookAuthor());
														 * System.out.println( "Book_PublisherName is-->" +
														 * bookBean.getPublisher()); System.out.println(
														 * "Book_Category is-->" + bookBean.getCategory());
														 */
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
										case 8:
											System.out.println("Users are:");
											try {
												List<User> users = service1.showUsers();
												System.out.println(
														String.format("%-10s %-15s %-15s %-15s %-10s %-10s %s",
																"UserId", "FirstName", "LastName", "Email",
																"Password", "Mobile", "Role"));
												for (User bean : users) {
													if (bean != null) {
														System.out.println(String.format(
																"%-10s %-15s %-15s %-15s %-10s %-10s %s",
																bean.getUserId(), bean.getFirstName(),
																bean.getLastName(), bean.getEmail(),
																bean.getPassword(), bean.getMobile(),
																bean.getRole()));
														/*
														 * System.out.println(
														 * "-----------------------------------------------");
														 * System.out.println("User_Id is-->" + Bean.getUserId());
														 * System.out.println("First_Name is-->" + Bean.getFirstName());
														 * System.out.println("Last_Name is-->" + Bean.getLastName());
														 * System.out.println("Email_Id is-->" + Bean.getEmail());
														 * System.out.println("Password is-->" + Bean.getPassword());
														 * System.out.println("Mobile_No is-->" + Bean.getMobile());
														 * System.out.println("User's_Role is-->" + Bean.getRole());
														 */
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

										case 9:
											System.out.println("Enter the User Id");
											int user_Id = scanner.nextInt();

											try {
												List<BookIssue> uid = service1.bookHistoryDetails(user_Id);
												for (BookIssue issueDetails : uid) {
													if (issueDetails != null) {
														System.out.println(
																"-----------------------------------------------");
														System.out.println(
																"No of books Borrowed :" + issueDetails.getUserId());
													} else {
														System.out.println(
																"-----------------------------------------------");
														System.out.println("Respective user hasn't borrowed any books");
													}
												}
											} catch (LMSException e) {
												System.err.println(e.getMessage());
											}
											break;

										case 10:
											System.out.println(" Requests received are:");
											try {
												List<BookRequest> requests = service1.showRequests();
												/*
												 * System.out.println(String.format("%10s %-10s %-10s %-25s %s", "id",
												 * "User_Id", "Book_Id", "User_Email", "BookName"));
												 */
												for (BookRequest requestBean : requests) {
													if (requestBean != null) {
														System.out.println(
																"-----------------------------------------------");
														System.out.println("User_Id is-->" + requestBean.getUserId());
														System.out
																.println("User_Name is-->" + requestBean.getFullName());
														System.out.println("Book_Id is-->" + requestBean.getBookId());
														System.out
																.println("BookName is-->" + requestBean.getBookName());
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
												List<BookIssue> issuedBooks = service1.showIssuedBooks();
												for (BookIssue issueBean : issuedBooks) {
													if (issueBean != null) {
														System.out.println(
																"-----------------------------------------------");
														System.out.println("Book_Id is-->" + issueBean.getBookId());
														System.out.println("User_Id is-->" + issueBean.getUserId());
														System.out
																.println("Issue_Date is-->" + issueBean.getIssueDate());
														System.out.println(
																"Return_Date is-->" + issueBean.getReturnDate());
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
											do {
												try {
													System.out.println("Enter the Book Id");
													id = scanner.nextInt();
													validation.validatedId(id);
													flag = true;
												} catch (InputMismatchException e) {
													System.err.println("Id should contain only digits");
													flag = false;
													scanner.next();
												} catch (LMSException e) {
													System.err.println(e.getMessage());
													flag = false;
												}
											} while (!flag);
											do {
												try {
													System.out.println("Enter bookName to be updtaed");
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

											BookBean bean2 = new BookBean();
											bean2.setBookId(id);
											bean2.setBookName(name);
											try {
												boolean updated = service1.updateBook(bean2);
												if (updated) {
													System.out
															.println("-----------------------------------------------");
													System.out.println("Book is updated");
												} else {
													System.out
															.println("-----------------------------------------------");
													System.err.println("Invalid Id");
												}
											} catch (LMSException e) {
												System.err.println(e.getMessage());
											}
											break;

										case 13:
											do {
												try {
													System.out.println("Enter Admin email Id");
													email1 = scanner.next();
													validation.validatedEmail(email1);
													flag = true;
												} catch (LMSException e) {
													System.err.println(e.getMessage());
													flag = false;
												}
											} while (!flag);
											System.out.println("Enter the Old password");
											String old_Password = scanner.next();
											System.out.println("Enter the new password");
											String new_Password = scanner.next();
											String user_Role = loginInfo.getRole();
											try {
												boolean updated1 = service1.updatePassword(email1, old_Password,
														new_Password, user_Role);
												if (updated1) {
													System.out
															.println("-----------------------------------------------");
													System.out.println("Password is updated");
												} else {
													System.out
															.println("-----------------------------------------------");
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
												boolean requested = service1.request(reqBookId, reqUserId);
												try {
													if (requested != false) {
														System.out.println(
																"-----------------------------------------------");
														System.out.println("BookID" + reqBookId + " is Requested");
													} else {
														System.out.println(
																"-----------------------------------------------");
														System.out.println("Book is not Requested");
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
														List<BookBorrow> borrowedBookList = service1
																.borrowedBook(user_Id);
														for (BookBorrow bookBean : borrowedBookList) {

															if (bookBean != null) {
																System.out.println(
																		"-----------------------------------------------");
																System.out.println(
																		"User_Id is-->" + bookBean.getUserId());
																System.out.println(
																		"Book_Id is-->" + bookBean.getBookId());
																System.out.println(
																		"Email Id is-->" + bookBean.getEmail());
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
															"Book-Id", "Book-Name", "Author", "Category",
															"Publisher"));

													for (BookBean bookBean : bookauthor) {

														if (bookBean != null) {
															System.out.println(String.format(
																	"%-10s %-25s %-25s %-20s %s",
																	bookBean.getBookId(), bookBean.getBookName(),
																	bookBean.getBookAuthor(),
																	bookBean.getCategory(),
																	bookBean.getPublisher()));
															/*
															 * System.out.println(
															 * "-----------------------------------------------");
															 * System.out.println("Book_Id is-->" +
															 * bookBean.getBookId()); System.out.println(
															 * "Book_Name is-->" + bookBean.getBookName());
															 * System.out.println( "Book_Author is-->" +
															 * bookBean.getBookAuthor());
															 * System.out.println("Book_PublisherName is-->" +
															 * bookBean.getPublisher()); System.out.println(
															 * "Book_Category is-->" + bookBean.getCategory());
															 */
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
														System.out.println("Search the book by the title Name:");
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
															"Book-Id", "Book-Name", "Author", "Category",
															"Publisher"));
													for (BookBean bookBean : booktitle) {
														if (bookBean != null) {
															System.out.println(String.format(
																	"%-10s %-25s %-25s %-20s %s",
																	bookBean.getBookId(), bookBean.getBookName(),
																	bookBean.getBookAuthor(),
																	bookBean.getCategory(),
																	bookBean.getPublisher()));
															/*
															 * System.out.println(
															 * "-----------------------------------------------");
															 * System.out.println("Book_Id is-->" +
															 * bookBean.getBookId()); System.out.println(
															 * "Book_Name is-->" + bookBean.getBookName());
															 * System.out.println( "Book_Author is-->" +
															 * bookBean.getBookAuthor());
															 * System.out.println("Book_PublisherName is-->" +
															 * bookBean.getPublisher()); System.out.println(
															 * "Book_Category is-->" + bookBean.getCategory());
															 */
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
												do {
													try {
														System.out.println("Search the book by the Book_ID :");
														id = scanner.nextInt();
														validation.validatedId(id);
														flag = true;
													} catch (InputMismatchException e) {
														System.err.println("Id should contain only digits");
														flag = false;
														scanner.next();
													} catch (LMSException e) {
														System.err.println(e.getMessage());
														flag = false;
													}
												} while (!flag);
												try {
													List<BookBean> bId = service1.searchBookById(id);
													System.out.println(String.format("%-10s %-25s %-25s %-20s %s",
															"Book-Id", "Book-Name", "Author", "Category",
															"Publisher"));
													for (BookBean bookBean : bId) {
														if (bookBean != null) {
															System.out.println(String.format(
																	"%-10s %-25s %-25s %-20s %s",
																	bookBean.getBookId(), bookBean.getBookName(),
																	bookBean.getBookAuthor(),
																	bookBean.getCategory(),
																	bookBean.getPublisher()));
															/*
															 * System.out.println(
															 * "-----------------------------------------------");
															 * System.out.println("Book_Id is-->" +
															 * bookBean.getBookId()); System.out.println(
															 * "Book_Name is-->" + bookBean.getBookName());
															 * System.out.println( "Book_Author is-->" +
															 * bookBean.getBookAuthor());
															 * System.out.println("Book_PublisherName is-->" +
															 * bookBean.getPublisher()); System.out.println(
															 * "Book_Category is-->" + bookBean.getCategory());
															 */
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
													for (BookBean bookBean : info) {

														if (bookBean != null) {
															System.out.println(
																	"-----------------------------------------------");
															System.out.println("Book_Id is-->" + bookBean.getBookId());
															System.out.println(
																	"Book_Name is-->" + bookBean.getBookName());
															System.out.println(
																	"Book_Author is-->" + bookBean.getBookAuthor());
															System.out.println("Book_PublisherName is-->"
																	+ bookBean.getPublisher());
															System.out.println(
																	"Book_Category is-->" + bookBean.getCategory());
															// System.out.println("No_Of_Copies
															// are-->"+bookBean.getCopies());
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
								System.err.println("Invalid Credentials");
								System.err.println("Try logging in again,Press 2 to login");
							}
							break;

						case 3:
							System.out.println("EXIT");
							System.exit(0);

						default:
							break;
						}
					} catch (InputMismatchException ex) {
						System.err.println("Choice must be in digits");
						scanner.nextLine();
					}
				} while (true);
			}
		} while (loginStatus);
	}

}
