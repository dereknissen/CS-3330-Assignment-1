package edu.mu.library;

public class Library {
	private Book[] books;
	private int count;
	
	public Library() {
		books = new Book[5];
		count = 0;
	}
	
	public boolean addBook(Book book) {
		if (count > 5) {
			return false;
		}
		else {
			books[count] = book;
			count++;
			return true;
		}
	}
}