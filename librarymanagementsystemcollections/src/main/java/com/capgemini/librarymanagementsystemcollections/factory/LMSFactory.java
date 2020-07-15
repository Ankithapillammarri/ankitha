package com.capgemini.librarymanagementsystemcollections.factory;

import com.capgemini.librarymanagementsystemcollections.dao.AdminDAO;
import com.capgemini.librarymanagementsystemcollections.dao.AdminDAOImplement;
import com.capgemini.librarymanagementsystemcollections.dao.StudentDAO;
import com.capgemini.librarymanagementsystemcollections.dao.StudentDAOImplement;
import com.capgemini.librarymanagementsystemcollections.service.AdminService;
import com.capgemini.librarymanagementsystemcollections.service.AdminServiceImplement;
import com.capgemini.librarymanagementsystemcollections.service.StudentService;
import com.capgemini.librarymanagementsystemcollections.service.StudentServiceImplement;

public class LMSFactory {

	public static AdminDAO getAdminDAO() {
		return new AdminDAOImplement();
	}

	public static AdminService getAdminService() {
		return new AdminServiceImplement();

	}

	public static StudentDAO getStudentDAO() {
		return new StudentDAOImplement();
	}

	public static StudentService getStudentService() {
		return new StudentServiceImplement();
	}
}
