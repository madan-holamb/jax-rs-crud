package org.madan.Messenger.model;

import java.util.Date;

import jakarta.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Messages {

	private long id;
	private String message;
	private Date createDate;
	private String author;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Messages(long id, String message, Date createDate, String author) {
		super();
		this.id = id;
		this.message = message;
		this.createDate = createDate;
		this.author = author;
	}
	public Messages() {
		super();
	}
	
	
	
	
}
