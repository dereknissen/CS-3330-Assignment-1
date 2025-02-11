package edu.mu.library;

public class Library {
	private Book[] books;
	private int count;
	
	/**
	 * Default constructor for Library object
	 */
	public Library() {
		books = new Book[5];
		count = 0;
	}
	
	/**
	 * This method adds a book to the library. The book must be passed as a parameter.
	 * Returns false if the library is already full of books. Otherwise, returns true if the
	 * book was successfully added.
	 * @param book
	 * @return
	 */
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
	
	/**
	 * This method removes a book from the library. The book must be passed as a parameter.
	 * Returns false if the book does not exist in the library. Otherwise, returns true if the
	 * removal was successful.
	 * @param book
	 * @return
	 */
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
	
	/**
	 * This method searches for a book in the library given an ISBN. The ISBN must be passed as a String parameter.
	 * Returns null if the book was not found. Otherwise, it returns the book object.
	 * @param ISBN
	 * @return
	 */
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
	
	/**
	 * This method displays all of the books in the library in a readable format.
	 * If there are no books in the library, it will print: "No books to print."
	 */
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