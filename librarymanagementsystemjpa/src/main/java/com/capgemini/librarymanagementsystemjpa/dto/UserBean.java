package com.capgemini.librarymanagementsystemjpa.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "users")
@SequenceGenerator(name = "seq4", initialValue = 100001, allocationSize = 100)
@SuppressWarnings("serial")
public class UserBean implements Serializable {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq4")
	private int userId;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String email;
	@Column
	private String password;
	@Column
	private long mobile;
	@Column
	private String role;
}
