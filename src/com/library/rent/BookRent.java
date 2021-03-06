package com.library.rent;

public class BookRent {

	private int num;
	private String title;
	private String authors;
	private String publisher;
	private String isbn;
	private String thumbnail;
	private String rent;
	private String rentdate;
	
	
	public BookRent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public BookRent(int num,String title, String authors, String publisher, String isbn, String thumbnail, String rent, String rentdate) {
		super();
		this.num = num;
		this.title = title;
		this.authors = authors;
		this.publisher = publisher;
		this.isbn = isbn;
		this.thumbnail = thumbnail;
		this.rent = rent;
		this.rentdate = rentdate;
	}
	
	
	
	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthors() {
		return authors;
	}
	public void setAuthors(String authors) {
		this.authors = authors;
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
	public String getRent() {
		return rent;
	}
	public void setRent(String rent) {
		this.rent = rent;
	}


	public String getRentdate() {
		return rentdate;
	}


	public void setRentdate(String rentdate) {
		this.rentdate = rentdate;
	}
	
	
	
	
	
}
