package model;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class User {
	@Id
	@GeneratedValue
	private int user_id;
	private String userName;
	private String password;
	private Date birthday;
	private String fullName;
	private String email;
	private String phoneNumber;
	private long budget;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "User_Book", joinColumns = { @JoinColumn(name = "user_id") }, inverseJoinColumns = {
			@JoinColumn(name = "book_id") })
	private Set<Book> bookList = new HashSet<Book>();

	public User(int user_id, String userName, String password, Date birthday, String fullName, String email,
			String phoneNumber, long budget, Set<Book> bookList) {
		super();
		this.user_id = user_id;
		this.userName = userName;
		this.password = password;
		this.birthday = birthday;
		this.fullName = fullName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.budget = budget;
		this.bookList = bookList;
	}

	public User() {
		super();
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public long getBudget() {
		return budget;
	}

	public void setBudget(long budget) {
		this.budget = budget;
	}

	public Set<Book> getBookList() {
		return bookList;
	}

	public void setBookList(Set<Book> bookList) {
		this.bookList = bookList;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", userName=" + userName + ", password=" + password + ", birthday="
				+ birthday + ", fullName=" + fullName + ", email=" + email + ", phoneNumber=" + phoneNumber
				+ ", budget=" + budget + ", bookList=" + bookList + "]";
	}

}
