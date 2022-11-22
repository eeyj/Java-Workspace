package com.kh.chap01_oneVsmany.model.vo;

public class Book {
	/*
	 * 1. 필드부 
	 * -title : String 
	 * -author : String 
	 * -price : int 
	 * -publisher : String
	 * 
	 * 2. 생성자부 
	 * +Book() 
	 * +Book(매개변수 4개)
	 * 
	 * 3. 메소드부 
	 * + getter/setter 
	 * + information():String
	 * 
	 */

	private String title;
	private String author;
	private int price;
	private String publisher;

	public Book() {

	}

	public Book(String title, String author, int price, String publisher) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}

	public void setTitle(String title) {
		this.title = title;

	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPrice() {
		return price;
	}

	public String getPublisher() {
		return publisher;
	}

	public String information() {
		return title + ", " + author + ", " + price + ", " + publisher;
	}

}
