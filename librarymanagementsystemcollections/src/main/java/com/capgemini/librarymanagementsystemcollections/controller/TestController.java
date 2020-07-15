package com.capgemini.librarymanagementsystemcollections.controller;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.capgemini.librarymanagementsystemcollections.dto.BookInfo;
import com.capgemini.librarymanagementsystemcollections.dto.RequestInfo;
import com.capgemini.librarymanagementsystemcollections.dto.Student;
import com.capgemini.librarymanagementsystemcollections.exception.LMSException;
import com.capgemini.librarymanagementsystemcollections.factory.LMSFactory;
import com.capgemini.librarymanagementsystemcollections.service.AdminService;
import com.capgemini.librarymanagementsystemcollections.service.StudentService;
import com.capgemini.librarymanagementsystemcollections.validation.Validation;

public class TestController {
	public static void main(String[] args) {
		AdminService service = LMSFactory.getAdminService();
		StudentService service1 = LMSFactory.getStudentService();
		try (Scanner sc = new Scanner(System.in);) {

			Student student = new Student();
			BookInfo bookInfo = new BookInfo();
			Validation validation = new Validation();

			boolean flag = false;

			int choice = 0;
			int check = 0;
			int studentChoice = 0;
			int studentId = 0;
			int bookId = 0;

			String emailId = null;
			String password = null;
			String name = null;

			Double price = 0.0;

			do {

				try {
					System.out.println("============*WElCOME TO LIBRARY MANAGEMENT SYSTEM*============");
					System.out.println("Press 1 for Admin Login");
					System.out.println("Press 2 for Student Login");
					System.out.println("Enter your choice");
					System.out.println("===========================");
					choice = sc.nextInt();
					flag = true;
				} catch (InputMismatchException e) {
					System.err.println("Choice must be in digits");
					flag = false;
					sc.next();
				}

				switch (choice) {
				case 1:
					System.out.println("========================");
					do {
						try {
							System.out.println("Enter Admin email Id");
							emailId = sc.next();
							validation.validateEmail(emailId);
							flag = true;
						} catch (LMSException e) {
							System.err.println(e.getMessage());
							flag = false;
						}
					} while (!flag);
					do {
						try {
							System.out.println("Enter Admin password");
							password = sc.next();
							validation.validatePassword(password);
							flag = true;
						} catch (LMSException e) {
							System.err.println(e.getMessage());
							flag = false;
						}
					} while (!flag);

					try {
						service.auth(emailId, password);
						System.out.println("Admin Logged in successfully");
						do {
							System.out.println("Press 1 to Register");
							System.out.println("Press 2 to Search Book");
							System.out.println("Press 3 to Add Book");
							System.out.println("Press 4 to Remove Book");
							System.out.println("Press 5 to Show Books");
							System.out.println("Press 6 to Issue Book");
							System.out.println("Press 7 to Show Students");
							System.out.println("Press 8 to Show Requests");
							System.out.println("Press 9 to Receive Returned Books");
							System.out.println("Press 0 to Exit");
							do {

								try {
									System.out.println("Enter your choice");
									check = sc.nextInt();
									flag = true;
								} catch (InputMismatchException e) {
									System.err.println("Enter only Digits");
									flag = false;
									sc.next();
								} catch (LMSException e) {
									System.err.println(e.getMessage());
									flag = false;
								}

							} while (!flag);

							switch (check) {
							case 1:
								System.out.println("Enter your Registration details");
								studentId = (int) (Math.random() * 1000);
								if (studentId <= 100) {
									studentId = studentId + 100;
								}
								System.out.println("StudentId " + studentId);

								do {
									try {
										System.out.println("Enter Student name");
										name = sc.next();
										validation.validateName(name);
										flag = true;
									} catch (InputMismatchException e) {
										System.err.println("Name should contain only alphabets");
										flag = false;
										sc.next();
									} catch (LMSException e) {
										System.err.println(e.getMessage());
										flag = false;
									}
								} while (!flag);
								do {
									try {
										System.out.println("Enter student Email Id");
										emailId = sc.next();
										validation.validateEmail(emailId);
										flag = true;
									} catch (LMSException e) {
										System.err.println(e.getMessage());
										flag = false;
									}
								} while (!flag);
								do {
									try {
										System.out.println("Enter password");
										password = sc.next();
										validation.validatePassword(password);
										flag = true;
									} catch (LMSException e) {
										System.err.println(e.getMessage());
										flag = false;
									}
								} while (!flag);

								Student student2 = new Student();
								student2.setId(studentId);
								student2.setName(name);
								student2.setEmail(emailId);
								student2.setPassword(password);
								boolean result = service.register(student2);

								if (result) {
									System.out.println("Registered");
								} else {
									System.out.println("Already exists");
								}
								break;
							case 2:
								System.out.println("Search a Book");
								do {

									try {
										System.out.println("Enter Book Id");
										bookId = sc.nextInt();
										validation.validateId(bookId);
										flag = true;
									} catch (InputMismatchException e) {
										System.err.println("Id should contain only digits");
										flag = false;
										sc.next();
									} catch (LMSException e) {
										System.err.println(e.getMessage());
										flag = false;
									}

								} while (!flag);

								try {
									BookInfo bookSearch = service.search(bookId);
									System.out.println("Book found");
									System.out.println("Book Id--------" + bookSearch.getBookId());
									System.out.println("Book Name-------" + bookSearch.getBookName());
									System.out.println("Book author-------" + bookSearch.getBookAuthor());
									// System.out.println("Book Publisher-------"+bookSearch.getPublisher());

								} catch (Exception e) {
									System.out.println("Book not found");
								}
								break;
							case 3:
								System.out.println("Add book");
								bookId = (int) (Math.random() * 1000);
								if (bookId <= 100) {
									bookId = bookId + 100;
								}
								System.out.println("Book Id : " + bookId);
								/*
								 * do { try { System.out.println("Enter book Id"); bookId = sc.nextInt();
								 * validation.validateId(bookId); flag = true; } catch (InputMismatchException
								 * e) { System.err.println("Id should contain only digits"); flag = false;
								 * sc.next(); } catch (LMSException e) { System.err.println(e.getMessage());
								 * flag = false; } } while (!flag);
								 */

								do {
									try {
										System.out.println("Enter book name");
										name = sc.next();
										validation.validateName(name);
										flag = true;
									} catch (InputMismatchException e) {
										System.err.println("Name should contain only Alphabets");
										flag = false;
										sc.next();
									} catch (LMSException e) {
										System.err.println(e.getMessage());
										flag = false;
									}
								} while (!flag);

								do {
									try {
										System.out.println("Enter book author");
										name = sc.next();
										validation.validateName(name);
										flag = true;
									} catch (InputMismatchException e) {
										System.err.println("Name should contain only Alphabets");
										flag = false;
										sc.next();
									} catch (LMSException e) {
										System.err.println(e.getMessage());
										flag = false;
									}
								} while (!flag);

								do {
									try {
										System.out.println("Enter book price");
										price = sc.nextDouble();
										flag = true;
									} catch (InputMismatchException e) {
										System.err.println("Price should contain only digits");
										flag = false;
										sc.next();
									}
								} while (!flag);

								BookInfo bookBean1 = new BookInfo();

								bookBean1.setBookId(bookId);
								bookBean1.setBookName(name);
								;
								bookBean1.setBookAuthor(name);
								bookBean1.setPrice(price);
								boolean added = service.addBook(bookBean1);
								System.out.println(added);

								if (added) {
									System.out.println("Book Added");
								} else {
									System.out.println("Already Exists");
								}

								break;
							case 4:
								do {
									try {
										System.out.println("Enter Id to Remove");
										bookId = sc.nextInt();
										validation.validateId(bookId);
										flag = true;
									} catch (InputMismatchException e) {
										System.err.println("Id should contain only digits");
										flag = false;
										sc.next();
									} catch (LMSException e) {
										System.err.println(e.getMessage());
										flag = false;
									}
								} while (!flag);

								bookInfo.setBookId(bookId);
								boolean removed = service.removeBook(bookInfo);
								if (removed) {
									System.out.println("Book Removed");
								} else {
									System.out.println("Book not found");
								}
								break;
							case 5:
								try {
									System.out.println("Books present in library are:");

									List<BookInfo> allBooks = service.showBooks();
									System.out.println(
											String.format("%-5s %-10s %-15s", "BOOKID", "BOOKNAME", "BOOKAUTHOR"));
									System.out.println("==========================================");
									for (BookInfo book1 : allBooks) {

										System.out.println(String.format("%-5s %-10s %-15s", book1.getBookId(),
												book1.getBookName(), book1.getBookAuthor()));
									}
								} catch (Exception e) {
									System.out.println("no books present in library");
								}
								break;
							case 6:
								Student student3 = new Student();
								BookInfo bookBean2 = new BookInfo();

								do {
									try {
										System.out.println("Enter Book Id :");
										bookId = sc.nextInt();
										validation.validateId(bookId);
										flag = true;
									} catch (InputMismatchException e) {
										System.err.println("ID Should Contains Only Digits");
										flag = false;
										sc.next();
									} catch (LMSException e) {
										System.err.println(e.getMessage());
										flag = false;
									}
								} while (!flag);

								do {
									try {
										System.out.println("Enter Student Id");
										studentId = sc.nextInt();
										validation.validateId(studentId);
										flag = true;
									} catch (InputMismatchException e) {
										System.err.println("ID Should Contains Only Digits");
										flag = false;
										sc.next();
									} catch (LMSException e) {
										System.err.println(e.getMessage());
										flag = false;
									}
								} while (!flag); // Scanner do while for Book Remove

								bookBean2.setBookId(bookId);
								student3.setId(studentId);

								try {
									boolean isIssued = service.issueBook(student3, bookInfo);
									if (isIssued) {
										System.out.println("Book Issued");
									} else {
										System.out.println("Book cannot be issued");
									}

								} catch (Exception e) {
									System.out.println("Invalid data request book cannot be issued");
								}
								break;
							case 7:
								try {
									System.out.println("Students in library are-----");

									List<Student> allstudents = service.showStudents();
									System.out.println(String.format("%-10s %-10s %-15s %-10s", "ID", "NAME", "EMAIL",
											"NO OF BOOKS BORROWED"));
									System.out.println("==========================================");
									for (Student student4 : allstudents) {
										System.out.println(String.format("%-10s %-10s %-15s %-10s", student4.getId(),
												student4.getName(), student4.getEmail(),
												student4.getNoOfBooksBorrowed()));
									}
								} catch (Exception e) {
									System.err.println("No Users Present in library");
								}
								break;
							case 8:
								try {
									System.out.println("requests for books are----");

									List<RequestInfo> requestInfo = service.showRequests();
									System.out.println(String.format(
											"%-10s %-10s %-15s %-10s %-15s %-19s %-20s %-20s %-20s", "BOOKID",
											"BOOKNAME", "STUDENTID", "STUDENTNAME", "BOOKISSUED", "BOOKRETURNED",
											"BOOKISSUED DATE", "EXPECTEDRETURNED DATE", "RETURNED DATE"));
									System.out.println("==========================================");

									for (RequestInfo info1 : requestInfo) {
										System.out.println(String.format(
												"%-10s %-10s %-15s %-10s %-15s %-19s %-20s %-20s %-20s",
												info1.getBookInfo().getBookId(), info1.getBookInfo().getBookName(),
												info1.getStudent().getId(), info1.getStudent().getName(),
												info1.isIssued(), info1.isReturned(), info1.getIssueDate(),
												info1.getExpectedReturnDate(), info1.getReturnDate()));

										/*
										 * System.out.println("=============================================");
										 * System.out.println("Book id-----"+info1.getBookInfo().getBookId());
										 * System.out.println("Book name----"+info1.getBookInfo().getBookName());
										 * System.out.println("Student id-----"+info1.getStudent().getId());
										 * System.out.println("Student name---"+info1.getStudent().getName());
										 * System.out.println("Book Issued ------" + info1.isIssued());
										 * System.out.println("Book Returned------" + info1.isReturned());
										 * System.out.println("Book IssuedDate-----" + info1.getIssueDate());
										 * System.out.println("Expected Returned Date--" +
										 * info1.getExpectedReturnDate()); System.out.println("Book ReturnedDate---" +
										 * info1.getReturnDate());
										 * System.out.println("=============================================");
										 */
									}
								} catch (Exception e) {
									System.out.println("no books present in library");
								}
								break;
							case 9:
								System.out.println("Receive Returned Book");
								System.out.println("=========================");
								do {
									try {
										System.out.println("Enter Student Id");
										studentId = sc.nextInt();
										validation.validateId(studentId);
										flag = true;
									} catch (InputMismatchException e) {
										System.err.println("ID Should Contains Only Digits");
										flag = false;
										sc.next();
									} catch (LMSException e) {
										System.err.println(e.getMessage());
										flag = false;
									}
								} while (!flag);

								do {
									try {
										System.out.println("Enter Book Id");
										bookId = sc.nextInt();
										validation.validateId(bookId);
										flag = true;
									} catch (InputMismatchException e) {
										System.err.println("ID Should Contains Only Digits");
										flag = false;
										sc.next();
									} catch (LMSException e) {
										System.err.println(e.getMessage());
										flag = false;
									}
								} while (!flag); // Scanner do while BookID for Book receive

								bookInfo.setBookId(bookId);
								student.setId(studentId);
								boolean isReceived = service.isBookReceieved(student, bookInfo);
								if (isReceived) {
									System.out.println(" Received Returned book");
								} else {
									System.out.println("Invalid returning Admin unable to receive");
								}
								break;
							case 0:
								break;
							default:
								System.err.println("Choice Should Be in Between 0 to 9");
								break;
							}
						} while (check != 0);

					} catch (Exception e) {
						System.err.println("Invalid Credentials");
					}

					break;
				case 2:
					System.out.println("====================");
					do {
						try {
							System.out.println("Enter Student Email Id");
							emailId = sc.next();
							validation.validateEmail(emailId);
							flag = true;
						} catch (LMSException e) {
							System.err.println(e.getMessage());
							flag = false;
						}
					} while (!flag);

					do {
						try {
							System.out.println("Enter Student password");
							password = sc.next();
							validation.validatePassword(password);
							flag = true;

						} catch (LMSException e) {
							System.err.println(e.getMessage());
							flag = false;
						}

					} while (!flag);
					try {
						service1.auth(emailId, password);
						System.out.println("Student Logged in Successfully");
						do {
							System.out.println("Press 1 to books present in Library");
							System.out.println("Press 2 to Search a book");
							System.out.println("Press 3 to Request a book");
							System.out.println("Press 4 to Return a book");
							System.out.println("Press 0 to Exit");
							System.out.println("Enter your choice");
							studentChoice = sc.nextInt();
							switch (studentChoice) {
							case 1:
								try {
									System.out.println("Books present in Library");
									System.out.println("===========================");

									List<BookInfo> allBooks = service.showBooks();
									System.out.println(
											String.format("%-5s %-10s %-15s", "BOOKID", "BOOKNAME", "BOOKAUTHOR"));
									System.out.println("==========================================");
									for (BookInfo book : allBooks) {
										System.out.println(String.format("%-5s %-10s %-15s", book.getBookId(),
												book.getBookName(), book.getBookAuthor()));

										/*
										 * System.out.println("Book Id---------"+book.getBookId());
										 * System.out.println("Book name----------"+book.getBookName());
										 * System.out.println("Book Author--------"+book.getBookAuthor());
										 * System.out.println("Book Price-------"+book.getPrice());
										 * System.out.println("==================================");
										 */
									}
								} catch (Exception e) {
									System.out.println("no books present in library");
								}
								break;
							case 2:
								System.out.println("Search a book");
								do {
									try {
										System.out.println("Enter book Id");
										bookId = sc.nextInt();
										validation.validateId(bookId);
										flag = true;
									} catch (InputMismatchException e) {
										System.err.println("ID Should Contains Only Digits");
										flag = false;
										sc.next();
									} catch (LMSException e) {
										System.err.println(e.getMessage());
										flag = false;
									}
								} while (!flag);
								try {
									BookInfo bookSearch = service.search(bookId);
									System.out.println("Book found");
									System.out.println("Book Id:-------------------- " + bookSearch.getBookId());
									System.out.println("Book Title:----------------- " + bookSearch.getBookName());
									System.out.println("Book Authour:--------------- " + bookSearch.getBookAuthor());
									System.out.println("Book Price:----------------- " + bookSearch.getPrice());

								} catch (Exception e) {
									System.out.println("Book not found");

								}
								break;
							case 3:
								System.out.println("Enter book Id");
								bookId = sc.nextInt();
								// BookInfo bookInfo1=new BookInfo();
								bookInfo.setBookId(bookId);

								System.out.println("Enter Student Id");
								studentId = sc.nextInt();
								// Student student2 = new Student();
								student.setId(studentId);

								try {
									RequestInfo requestInfo1 = service1.requestBook(student, bookInfo);
									System.out.println("Request placed to Admin");
									System.out.println("Student Id------" + requestInfo1.getStudent().getId());
									System.out.println("Student name-----" + requestInfo1.getStudent().getName());
									System.out.println("Book Id-------" + requestInfo1.getBookInfo().getBookId());
									System.out.println("Book name----" + requestInfo1.getBookInfo().getBookName());

								} catch (Exception e) {
									System.out.println("Enter valid data or Invalid Request");
								}
								break;
							case 4:
								System.out.println("Returning a book");
								System.out.println("---------------------");
								do {
									try {
										System.out.println("Enter book Id");
										bookId = sc.nextInt();
										validation.validateId(bookId);
										flag = true;
									} catch (InputMismatchException e) {
										System.err.println("ID Should Contains Only Digits");
										flag = false;
										sc.next();
									} catch (LMSException e) {
										System.err.println(e.getMessage());
										flag = false;
									}
								} while (!flag);
								do {

									try {
										System.out.println("Enter Student Id");
										studentId = sc.nextInt();
										validation.validateId(studentId);
										flag = true;
									} catch (InputMismatchException e) {
										System.err.println("ID Should Contains Only Digits");
										flag = false;
										sc.next();
									} catch (LMSException e) {
										System.err.println(e.getMessage());
										flag = false;
									}
								} while (!flag);
								Student stu = new Student();
								stu.setId(studentId);
								BookInfo bk = new BookInfo();
								bk.setBookId(bookId);
								try {
									RequestInfo request = service1.returnBook(stu, bk);
									System.out.println("Book returning to admin");
									System.out.println("Student Id-----" + request.getStudent().getId());
									System.out.println("Book Id------" + request.getBookInfo().getBookId());
									System.out.println("Is Returning--------" + request.isReturned());
									System.out.println("Returning date-----" + request.getReturnDate());
								} catch (Exception e) {
									System.out.println("Invalid Return");
								}
								break;
							default:
								break;
							}
						} while (studentChoice != 0);
					} catch (Exception e) {
						System.out.println("Student cannot login");
					}
					break;
				default:
					System.err.println("Choice should be in beween 1 and 2");
					break;
				}

			} while (true);
		}

	}

}
