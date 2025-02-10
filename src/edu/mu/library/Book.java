package edu.mu.library;


public class Book {
	
	private String title;
	private String author;
	private String ISBN;
	private double price;
	
	/**
	 * This is the default constructor for the Book object.
	 * There are no parameters supported for this constructor.
	 */
	public Book() {
		this.title = "Unknown";
		this.author = "Unknown";
		this.ISBN = "Unknown";
		this.price = 0.0;
	}
	
	/**
	 * This is a parameterized constructor, that will allow you to create a
	 * Book object given the following parameters:
	 * @param title
	 * @param author
	 * @param ISBN
	 * @param price
	 */
	public Book(String title, String author, String ISBN, double price) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
	}
	
	
	/* Getters and setters */

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
