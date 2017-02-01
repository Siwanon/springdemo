package com.springdemo.model;

import org.springframework.data.annotation.Id;

public class User {
	
	@Id
	private String id;
    private String firstname; 
    private String lastname; 
    private String email;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [id=").append(id).append(", firstname=").append(firstname)
		.append(", lastname=").append(lastname).append(", email=").append(email).append("]");
		return builder.toString();
	}
    
	
    
}
