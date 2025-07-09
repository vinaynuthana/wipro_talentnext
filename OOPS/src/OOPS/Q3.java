package OOPS;
class Author {
    String name;
    String email;
    char gender;

    // Constructor
    Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getname() {
    	return name;
    }
    public String getemail() {
    	return email;
    }
    public char getgender() {
    	return gender;
    }
    public void setname(String name) {
    	this.name=name;
    }
    public void setemail(String email) {
    	this.email=email;
    }
    public void setgender(char gender) {
    	this.gender=gender;
    }
}

class Book {
    String name;
    Author author;
    double price;
    int qtyInStock;

    // Constructor
    Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
    public String getname() {
    	return name;
    }
    public Author getauthor() {
    	return author;
    }
    public double getprice() {
    	return price;
    }
    public int getqtyInStock() {
    	return qtyInStock;
    }
    public void setname(String name) {
    	this.name=name;
    }
    public void setauthor(Author author) {
    	this.author=author;
    }
    public void setprice(double price) {
    	this.price=price;
    }
    public void setqtyInStock(int qtyInStock) {
    	this.qtyInStock=qtyInStock;
    }
}

public class Q3{
    public static void main(String[] args) {
        // Create an author
        Author author = new Author("APJ Abdul Kalam", "apj@example.com", 'M');

        // Create a book
        Book book = new Book("Wings of Fire", author, 250.50, 10);

        // Print details
        System.out.println("Book Name: " + book.name);
        System.out.println("Price: " + book.price);
        System.out.println("Quantity in Stock: " + book.qtyInStock);
        System.out.println("Author Name: " + book.author.name);
        System.out.println("Author Email: " + book.author.email);
        System.out.println("Author Gender: " + book.author.gender);
    }
}
