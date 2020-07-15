package com.capgemini.librarymanagementsystemcollections.db;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.librarymanagementsystemcollections.dto.Admin;
import com.capgemini.librarymanagementsystemcollections.dto.BookInfo;
import com.capgemini.librarymanagementsystemcollections.dto.RequestInfo;
import com.capgemini.librarymanagementsystemcollections.dto.Student;

public class DataBase {
	public static final List<Student> STUDENT=new ArrayList<Student>();
	public static final List<Admin> ADMIN=new ArrayList<Admin>();
	public static final List<BookInfo> BOOK=new ArrayList<BookInfo>();
	
	public static final List<RequestInfo> REQUEST = new ArrayList<RequestInfo>();
}
