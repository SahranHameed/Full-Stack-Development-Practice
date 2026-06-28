// 1. ENCAPSULATION — Book Class
//    extends LibraryItem  → Abstraction
//    implements Borrowable → Interface

public class Book extends LibraryItem implements Borrowable {

    // Private fields — Encapsulation
    private int bookId;
    private String title;
    private String author;
    private double price;

    // Constructor
    Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getters
    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Override — Abstraction + Polymorphism
    @Override
    public void displayInfo() {
        System.out.println("Book ID   : " + bookId);
        System.out.println("Title     : " + title);
        System.out.println("Author    : " + author);
        System.out.println("Price     : Rs." + price);
    }

    // Interface implementation
    @Override
    public void borrowItem() {
        System.out.println("Book \"" + title + "\" has been borrowed.");
    }

    @Override
    public void returnItem() {
        System.out.println("Book \"" + title + "\" has been returned.");
    }
}
