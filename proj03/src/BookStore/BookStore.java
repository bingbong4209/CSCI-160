package BookStore;

import BookStore.Book;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class BookStore {

    int Book[];
    public BookList library;

    public BookStore() {
        library = new BookList();
        library.add(new Book("Java Servlets", "Brown", 75.99, 1234, false));
        library.add(new Book("Advanced HTML", "Green", 56.99, 5678, true));
        library.add(new Book("Advanced Java", "Green", 65.99, 91011, true));
        library.add(new Book("Intro to Flash", "James", 34.49, 121314, false));
        library.add(new Book("Intro to HTML", "James", 29.49, 15161, true));
        library.add(new Book("Intro to Java", "James", 56.99, 192030, false));
        library.trimToSize();
    }

    public BookStore(ArrayList<Book> library) {
        library = library;
    }

    public BookStore(BookList[] library) {
        library = library;
    }

    public BookStore(String name, BookList library) {
        name = name;
        library = library;
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < library.getSize(); i++) {
            result = result + library.getBook(i) + "\n";
        }
        return result;
    }

    public String lookUpAuthor(String searchString) {
        String searchResult = "";
        for (int i = 0; i < library.getSize(); i++) {
            if (searchString.toLowerCase().equals(library.getBook(i).getTitle().toLowerCase())) {
                searchResult = library.getBook(i).getAuthor();
            }
        }
        if (searchResult.equals("")) {
            searchResult = "Could not find book";
        }
        return searchResult;

    }

    public double lookUpPrice(String searchString) {
        double searchResult = 0;
        for (int i = 0; i < library.getSize(); i++) {
            if (searchString.toLowerCase().equals(library.getBook(i).getTitle().toLowerCase())) {
                searchResult = library.getBook(i).getPrice();
            }
        }
        if (searchResult == 0.0) {
            return Double.NaN;

        } else {
            return searchResult;
        }

    }

    public BookList searchForTitle(String searchString) {
        BookList searchResult = new BookList();
        for (int i = 0; i < library.getSize(); i++) {
            if (library.getBook(i).getTitle().toLowerCase().contains(searchString.toLowerCase())) {
                searchResult.add(library.getBook(i));
            }
        }
        searchResult.trimToSize();
        return searchResult;
    }

    public BookList searchForAuthor(String author) {
        BookList searchResult = new BookList();
        for (int i = 0; i < library.getSize(); i++) {
            if (author.toLowerCase().equals(library.getBook(i).getAuthor().toLowerCase())) {
                searchResult.add(library.getBook(i));
            }
        }
        searchResult.trimToSize();
        return searchResult;
    }

    public BookList searchForPrice(String searchString) {
        BookList searchResult = new BookList();
        double min = Double.parseDouble(searchString);
        for (int i = 0; i < library.getSize(); i++) {
            if (library.getBook(i).getPrice() < min) {
                searchResult.add(library.getBook(i));
            }
        }
        searchResult.trimToSize();
        return searchResult;

    }

    public Book getLowestPriceBook() {
        Book min = new Book("Hello World", "Adam", 100.00, 102, true);
        for (int i = 0; i < library.getSize(); i++) {
            if (library.getBook(i).getPrice() < min.getPrice()) {
                min = library.getBook(i);
            }
        }
        if (min.equals(new Book("Hello World", "Adam", 100.00, 102, true))) {
            return null;
        } else {
            return min;
        }
    }

    //-------------------------fix this later, just a placeholder for now
    public Book searchByISBN(String ISBN) {
        Book book = new Book("Hey Dave", "Dave", 123.00, 100000, false);
        int isbn = Integer.parseInt(ISBN);
        for (int i = 0; i < library.getSize(); i++) {
            if (library.getBook(i).getISBN() == isbn) {
                book = library.getBook(i);
            }
        }
        if (book.getISBN() == 100000) {
            return null;
        } else {
            return book;
        }
    }

    //-------------------------Deprecated methods below
    @Deprecated
    public String loopupAuther(String searchString) {
        String searchResult = "";
        for (Book currentBook : library) {
            if (searchString == (currentBook.getTitle())) {
                searchResult = currentBook.getAuther();
            }
        }
        return "Could Not Find Book.";
    }

    @Deprecated
    public BookList searchForAuther(String searchString) {
        BookList searchResult = new BookList();
        for (Book currentBook : library) {
            if ((currentBook.getAuther()) == (searchString)) {
                searchResult.add(currentBook);
            }
        }
        searchResult.trimToSize();
        return searchResult;
    }
}
