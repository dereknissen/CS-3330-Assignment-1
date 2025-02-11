package edu.mu.library;

public class Main {

	public static void main(String[] args) {
		/* Create a Library object and add 3 books to it */
		Library library1 = new Library();
		
		Book book1 = new Book();
		book1.setTitle("How to Succeed");
		book1.setAuthor("Derek Nissen");
		book1.setISBN("123-4853285");
		book1.setPrice(10.99);
		
		Book book2 = new Book();
		book2.setTitle("Ways towards Winning");
		book2.setAuthor("Tanner Kuchar");
		book2.setISBN("908-7651234");
		book2.setPrice(2.34);
		
		Book book3 = new Book();
		book3.setTitle("Flourish and Thrive");
		book3.setAuthor("Carter Cox");
		book3.setISBN("567-4832901");
		book3.setPrice(13.85);
		
		System.out.println("Adding books...");
		library1.addBook(book1);
		library1.addBook(book2);
		library1.addBook(book3);
		System.out.println("Books added succesfully.\n");
		
		
		/* Search for a book by ISBN and display the result */
		
		System.out.println("Book found: " + library1.searchByISBN("908-7651234").toString() + "\n");
		
		/* Display all books in the library remove one and then display them again */
		library1.displayBooks();
		
		System.out.println("Removing book: " + book3.toString() + "\n");
		library1.removeBook(book3);
		
		library1.displayBooks();
		
		/* Remove a book that does not exist*/
		Book book4 = new Book();
		library1.removeBook(book4);
	}

}