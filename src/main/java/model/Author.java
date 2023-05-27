package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Author {
	@Id
	@GeneratedValue
	private int author_id;
	private String fullName;

	public Author(int author_id, String fullName) {
		super();
		this.author_id = author_id;
		this.fullName = fullName;
	}

	public Author() {
		super();
	}

	public int getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Override
	public String toString() {
		return "Author [author_id=" + author_id + ", fullName=" + fullName + "]";
	}

}
