package com.web;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Registration {
	@NotNull
	@Size(min = 5, max = 15)
	private String firstName;
	@NotNull
	@Size(min = 5, max = 15)
	private String lastName;
	@NotNull
	@Size(min = 10, max = 30)
	private String email;
	@Size(min = 6, max = 15)
	private String password;

	public Registration() {

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
