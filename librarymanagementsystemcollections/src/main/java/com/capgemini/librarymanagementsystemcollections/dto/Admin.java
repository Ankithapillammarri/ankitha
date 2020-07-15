package com.capgemini.librarymanagementsystemcollections.dto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Admin implements Serializable {
	private int adminId = 1;
	private String adminName = "Ankitha";
	private String emailId = "ankitha@gmail.com";
	private String password = "Anki@1234";

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
