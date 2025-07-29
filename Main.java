package miniproject;

public class Main {

		 public static void main(String[] args) {
		     // Create Author Object
		     Author author = new Author("J.K. Rowling", "jkrowling@example.com", 'F');

		     // Create Book Object
		     Book book = new Book("Harry Potter", author, 499.99, 100);

		     // Print Book Details
		     System.out.println(book.toString());
		 }
		}


