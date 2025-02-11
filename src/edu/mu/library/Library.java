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
		System.out.println("Book does not exist.");
		return false;
	}
	
	public Book searchByISBN(String ISBN) {
		System.out.println("Searching for book with ISBN: " + ISBN);
		for (int i = 0; i < count; i++) {
			if (books[i].getISBN().equals(ISBN)) {
				return books[i];
			}
		}
		System.out.println("Book not found.");
		return null;
	}
	
	public void displayBooks() {
		if (count == 0) {
			System.out.println("No books to print.\n");
		}
		else {
			System.out.println("All books in the library: ");
			for (int i = 0; i < count; i++) {
				System.out.println((i+1) + ". " + books[i].toString());
			}
			System.out.println();
		}
	}
}