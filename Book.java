package miniproject;

public class Book {
		 private String name;
		 private Author author;
		 private double price;
		 private int qtyInStock;

		 // Parameterized Constructor
		 public Book(String name, Author author, double price, int qtyInStock) {
		     this.name = name;
		     this.author = author;
		     this.price = price;
		     this.qtyInStock = qtyInStock;
		 }

		 // Getters and Setters
		 public String getName() {
		     return name;
		 }

		 public Author getAuthor() {
		     return author;
		 }

		 public double getPrice() {
		     return price;
		 }

		 public int getQtyInStock() {
		     return qtyInStock;
		 }

		 public void setName(String name) {
		     this.name = name;
		 }

		 public void setAuthor(Author author) {
		     this.author = author;
		 }

		 public void setPrice(double price) {
		     this.price = price;
		 }

		 public void setQtyInStock(int qtyInStock) {
		     this.qtyInStock = qtyInStock;
		 }

		 // Method to display book details
		 public String toString() {
		     return "Book Name: " + name + "\n" +
		            "Price: " + price + "\n" +
		            "Quantity in Stock: " + qtyInStock + "\n" +
		            author.toString();
		 }

}
