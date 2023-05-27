package model;

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
public class Category {
	@Id
	@GeneratedValue
	private int category_id;
	private String description;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Category_Book", joinColumns = { @JoinColumn(name = "category_id") }, inverseJoinColumns = {
			@JoinColumn(name = "book_id") })
	private Set<Book> bookList = new HashSet<Book>();

	public Category(int category_id, String description) {
		super();
		this.category_id = category_id;
		this.description = description;
	}

	public Category() {
		super();
	}

}
