package edu.mu.library;

public class Library {
	private Book[] books;
	private int count;
	
	public Library() {
		books = new Book[5];
		count = 0;
	}
	
	public boolean addBook(Book book) {
		if (count > 4) {
			return false;
		}
		else {
			books[count] = book;
			count++;
			return true;
		}
	}
	
	public boolean removeBook(Book book) {
		for (int i = 0; i < count; i++) {
			if (books[i].equals(book)) {
				for (int j = i; j < count - 1; j++) {
					books[j] = books[j+1];
				}
				count--;
				books[count] = null;
				return true;
			}
		}
		return false;
	}
	
	public Book searchByISBN(String ISBN) {
		for (int i = 0; i < count; i++) {
			if (books[i].getISBN().equals(ISBN)) {
				return books[i];
			}
		}
		System.out.println("Test");
		return null;
	}
	
	public void displayBooks() {
		if (count == 0) {
			System.out.println("No books to print");
		}
		else {
			for (int i = 0; i < count; i++) {
				System.out.println(books[i].toString());
			}
		}
	}
}