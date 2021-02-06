package com.library.apply;

public class Book2 {

	private String title;
	private String authorss;
	private String publisher;
	private String isbn;
	private String thumbnail;
	
	public Book2() {
	
	}
	
	public Book2(String title, String publisher, String isbn, String thumbnail, String authorss) {
		super();
		this.title = title;
		this.publisher = publisher;
		this.isbn = isbn;
		this.thumbnail = thumbnail;
		this.authorss = authorss;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getAuthorss() {
		return authorss;
	}
	public void setAuthorss(String authorss) {
		this.authorss = authorss;
	}
	
	
	
}
