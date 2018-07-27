package com.gokulgardens.domain;

public class User {

	// Declaring all the fields of User Class.

	private int userId;
	private String userName;
	private String userPassword;
	private String userRights;
	
	//Constructor without any fields
	
	public User() {
	}

	// Constructor without Id


	public User(String userName, String userPassword, String userRights) {
		this.userName = userName;
		this.userPassword = userPassword;
		this.userRights = userRights;
	}

	// Constructor using Id

	public User(int userId, String userName, String userPassword, String userRights) {
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userRights = userRights;
	}

	// Declaring getters and setters for all the fields of User Class.
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserRights() {
		return userRights;
	}

	public void setUserRights(String userRights) {
		this.userRights = userRights;
	}

}
