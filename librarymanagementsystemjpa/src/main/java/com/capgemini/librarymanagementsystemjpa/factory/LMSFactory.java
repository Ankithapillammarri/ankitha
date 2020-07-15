package com.capgemini.librarymanagementsystemjpa.factory;

import com.capgemini.librarymanagementsystemjpa.dao.UsersDAO;
import com.capgemini.librarymanagementsystemjpa.dao.UsersDAOImplement;
import com.capgemini.librarymanagementsystemjpa.service.UsersService;
import com.capgemini.librarymanagementsystemjpa.service.UsersServiceImplement;

public class LMSFactory {
	public static UsersDAO getUsersDao() {
		return new UsersDAOImplement();
	}
	public static UsersService getUsersService() {
		return new UsersServiceImplement();
	}
}
