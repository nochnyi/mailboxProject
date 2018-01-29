package com.company.Users;

public class User {
	private String userName;
	private String login;
	private String password;
	private String email;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof User)) return false;

		User user = (User) o;

		if (userName != null ? !userName.equals(user.userName) : user.userName != null) return false;
		if (login != null ? !login.equals(user.login) : user.login != null) return false;
		if (password != null ? !password.equals(user.password) : user.password != null) return false;
		return email != null ? email.equals(user.email) : user.email == null;
	}

	public String getUserName() {
		return userName;
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		int result = userName != null ? userName.hashCode() : 0;
		result = 31 * result + (login != null ? login.hashCode() : 0);
		result = 31 * result + (password != null ? password.hashCode() : 0);
		result = 31 * result + (email != null ? email.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "com.company.Pages.Users.User{" +
				"userName='" + userName + '\'' +
				", login='" + login + '\'' +
				", password='" + password + '\'' +
				", email='" + email + '\'' +
				'}';
	}

	public User(String userName, String login, String password, String email) {
		this.userName = userName;
		this.login = login;
		this.password = password;
		this.email = email;
	}
}
