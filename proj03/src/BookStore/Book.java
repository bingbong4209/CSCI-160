package BookStore;

public class Book {

    String title;
    String author;
    double price;
    double min = 57.00;
    int isbn;
    boolean isHardCover;

    public Book() {
        title = "";
        author = "";
        price = 0.0;
        isHardCover = true;
        isbn = 102;
    }

    public Book(String title, String author, double price, int isbn, boolean isHardCover) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
        this.isHardCover = isHardCover;
    }

    public String getTitle() {
        return title;
    }

    @Deprecated
    public String getAuther() {
        return author;
    }
    
    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
    
    public int getISBN() {
        return isbn;
    }

    //Redundant method, not needed
    @Deprecated
    public double getCost() {
        return price;
    }

    public String toString() {
        return ("Title: " + title + "\t"
                + "Author: " + author + "\t"
                + "Price: " + price + "\t" 
                + "ISBN: " + isbn + "\t"
                + "Hard Cover: " + isHardCover);

    }

}
