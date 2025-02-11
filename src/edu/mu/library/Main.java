package edu.mu.library;

public class Main {

	public static void main(String[] args) {
		Library library1 = new Library();
		
		Book book1 = new Book();
		book1.setTitle("How to Succeed");
		book1.setAuthor("Derek Nissen");
		book1.setISBN("1234853285");
		book1.setPrice(10.99);
		
		Book book2 = new Book();
		book2.setTitle("Ways towards Winning");
		book2.setAuthor("Tanner Kuchar");
		book2.setISBN("9087651234");
		book2.setPrice(2.34);
		
		Book book3 = new Book();
		book3.setTitle("Flourish and Thrive");
		book3.setAuthor("Carter Cox");
		book3.setISBN("5674832901");
		book3.setPrice(13.85);
		
		library1.addBook(book1);
		library1.addBook(book2);
		library1.addBook(book3);
		
		System.out.println("Searching for book with ISBN: 9087651234");
		/*System.out.println("Book found: " + toString.(library1.searchByISBN("9087651234")));
		
		library1.removeBook(book3);
		library1.removeBook(book4); */
		
		System.out.println(book1.toString());
	}

}