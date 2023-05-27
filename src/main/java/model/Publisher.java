package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Publisher {
	@Id
	@GeneratedValue
	private int publisher_id;
	private String pubName;
	private String pubPhone;
	private String pubAddress;
	private String pubEmail;

	public Publisher(int publisher_id, String pubName, String pubPhone, String pubAddress, String pubEmail) {
		super();
		this.publisher_id = publisher_id;
		this.pubName = pubName;
		this.pubPhone = pubPhone;
		this.pubAddress = pubAddress;
		this.pubEmail = pubEmail;
	}

	public Publisher() {
		super();
	}

	public int getPublisher_id() {
		return publisher_id;
	}

	public void setPublisher_id(int publisher_id) {
		this.publisher_id = publisher_id;
	}

	public String getPubName() {
		return pubName;
	}

	public void setPubName(String pubName) {
		this.pubName = pubName;
	}

	public String getPubPhone() {
		return pubPhone;
	}

	public void setPubPhone(String pubPhone) {
		this.pubPhone = pubPhone;
	}

	public String getPubAddress() {
		return pubAddress;
	}

	public void setPubAddress(String pubAddress) {
		this.pubAddress = pubAddress;
	}

	public String getPubEmail() {
		return pubEmail;
	}

	public void setPubEmail(String pubEmail) {
		this.pubEmail = pubEmail;
	}

}
