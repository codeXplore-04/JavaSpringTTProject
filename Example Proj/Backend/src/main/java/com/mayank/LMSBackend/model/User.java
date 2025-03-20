package com.mayank.LMSBackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer id;
	@Column(unique=true)
	public String email;
	public String password;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + "]";
	}
	
}
