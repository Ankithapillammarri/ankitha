package com.capgemini.librarymanagementsystemcollections.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.librarymanagementsystemcollections.exception.LMSException;

public class Validation {

	public boolean validateId(int id) throws LMSException {
		String idRegEx = "[0-9]{1}[0-9]{5}";
		boolean result = false;
		if (Pattern.matches(idRegEx, String.valueOf(id))) {
			result = true;
		} else {
			throw new LMSException("Id should contains exactly 6 digits");
		}
		return result;
	}

	public boolean validateName(String name) throws LMSException {
		String nameRegEx = "^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$";
		boolean result = false;
		Pattern pattern = Pattern.compile(nameRegEx);
		Matcher matcher = pattern.matcher(name);
		if (matcher.matches()) {
			result = true;
		} else {
			throw new LMSException("Name should contains only Alphabets");
		}
		return result;
	}

	public boolean validateEmail(String emailId) throws LMSException {
		String emailRegEx = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		boolean result = false;
		Pattern pattern = Pattern.compile(emailRegEx);
		Matcher matcher = pattern.matcher(emailId);
		if (matcher.matches()) {
			result = true;
		} else {
			throw new LMSException("Enter proper email which should contain @ and extensions(.com,.in,.org)");
		}
		return result;
	}

	public boolean validatePassword(String password) throws LMSException {
		String passwordRegEx = "((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{8,40})";
		boolean result = false;
		if (Pattern.matches(passwordRegEx, String.valueOf(password))) {
			result = true;
		} else {
			throw new LMSException(
					"Password should contain atleast 8 characters , one uppercase , one lowercase and one symbol");
		}
		return result;
	}
}
