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
	
	/**
	 * This is a copy constructor that will allow you to create a 
	 * Book object given an original Book object.
	 * @param original
	 */
	public Book(Book original) {
		
		/* If the original book does not exist, cancel copy. */
		if (original == null) {
			System.out.println("Fatal error.");
			System.exit(0);
		}
		
		this.title = original.title;
		this.author = original.author;
		this.ISBN = original.ISBN;
		this.price = original.price;
	}
	
	/** 
	 * This method compares another book to the currently accessed Book object through the
	 * ISBN. Returns true if the books are equivalent, otherwise false.
	 * 
	 * @param other
	 * @return
	 */
	public boolean equals(Book other) {
		if (this.ISBN == other.ISBN) {
			return true;
		} else {
			return false;
		}
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
