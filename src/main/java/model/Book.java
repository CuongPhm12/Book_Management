package model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Book {
	@Id
	@GeneratedValue
	private int book_id;

	public Publisher getPublisher() {
		return publisher;
	}

	public Book(int book_id, Author author, Publisher publisher, String title, String publishing_year, long price,
			Set<Category> categoryList, Set<User> userList) {
		super();
		this.book_id = book_id;
		this.author = author;
		this.publisher = publisher;
		this.title = title;
		this.publishing_year = publishing_year;
		this.price = price;
		this.categoryList = categoryList;
		this.userList = userList;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public Set<Category> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(Set<Category> categoryList) {
		this.categoryList = categoryList;
	}

	public Set<User> getUserList() {
		return userList;
	}

	public void setUserList(Set<User> userList) {
		this.userList = userList;
	}

	@ManyToOne
	@JoinColumn(name = "author_id")
	private Author author;
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Publisher publisher;
	private String title;
	private String publishing_year;
	private long price;
	@ManyToMany(mappedBy = "bookList", cascade = CascadeType.ALL)
	private Set<Category> categoryList = new HashSet<Category>();
	@ManyToMany(mappedBy = "bookList", cascade = CascadeType.ALL)
	private Set<User> userList = new HashSet<User>();

	public Book(int book_id, Author author, String title, String publishing_year, long price) {
		this.book_id = book_id;
		this.author = author;
		this.title = title;
		this.publishing_year = publishing_year;
		this.price = price;
	}

	public Book() {
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublishing_year() {
		return publishing_year;
	}

	public void setPublishing_year(String publishing_year) {
		this.publishing_year = publishing_year;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [book_id=" + book_id + ", author=" + author + ", title=" + title + ", publishing_year="
				+ publishing_year + ", price=" + price + "]";
	}

}
