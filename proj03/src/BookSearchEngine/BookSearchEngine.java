package BookSearchEngine;

import BookStore.Book;
import BookStore.Book;
import BookStore.BookList;
import BookStore.BookStore;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BookSearchEngine {

    static BookStore bs = new BookStore();

    public static void main(String[] args) {

        int option = 0;
        System.out.println("------Welcome to the Corner Bookstore------");

        while (option != 10) {

            System.out.println("Please make a menu selection:");
            System.out.println("1 - List Books.");
            System.out.println("2 - List Books Alphabetically");
            System.out.println("3 - Lookup Book Author.");
            System.out.println("4 - Lookup Price.");
            System.out.println("5 - Search By Author.");
            System.out.println("6 - Search By Cost.");
            System.out.println("7 - Search By Book title.");
            System.out.println("8 - Find Cheapest Book.");
            System.out.println("9 - Search By ISBN");
            System.out.println("10 - Quit.");

            String s = JOptionPane.showInputDialog("Please make a selection.");
            option = Integer.parseInt(s);
            if (option == 1) {
                System.out.println("\n" + bs.toString());
            } else if (option == 2) {
                bs.library.sortList();
                System.out.println("\n" + bs.toString());
            } else if (option == 3) {
                s = JOptionPane.showInputDialog("Please enter a Book Title.");
                String s1 = bs.lookUpAuthor(s);
                System.out.println("\nThe Author for " + s + " is " + s1 + "\n");
            } else if (option == 4) {
                s = JOptionPane.showInputDialog("Please enter a Book title");
                double d = bs.lookUpPrice(s);
                System.out.println("\nThe Price for " + s + " is " + d + "\n");
            } else if (option == 5) {
                s = JOptionPane.showInputDialog("Please enter an author:");
                BookList list1 = bs.searchForAuthor(s);
                System.out.println("\nList of books by the author is: ");
                for (int i = 0; i < list1.getSize(); i++) {
                    System.out.println(list1.getBook(i));
                }
            } else if (option == 6) {
                s = JOptionPane.showInputDialog("Please enter a minimum cost.");
                BookList list2 = bs.searchForPrice(s);
                System.out.println("\nList of books below $" + s + ":");
                for (int i = 0; i < list2.getSize(); i++) {
                    System.out.println(list2.getBook(i));
                }
                System.out.println("\n");
            } else if (option == 7) {
                s = JOptionPane.showInputDialog("Please enter a keyword:");
                BookList list3 = bs.searchForTitle(s);
                System.out.println("\nList of Books matching '" + s + "':\n");
                for (int i = 0; i < list3.getSize(); i++) {
                    System.out.println(list3.getBook(i));
                }
                System.out.println("\n");
            } else if (option == 8) {
                System.out.println("\nCheapest Book:" + "\n"
                        + bs.getLowestPriceBook() + "\n");
            } else if (option == 9) {
                s = JOptionPane.showInputDialog("Please enter an ISBN.");
                Book book = bs.searchByISBN(s);
                System.out.println("\nThe Book with the matching ISBN: \n"
                        + book + "\n");
            } else if (option < 1 || option > 10) {
                System.out.println("\nPlease enter an integer between 1 and 9\n");
            }

        }
        System.out.println("Thank you for using our program.");

    }
}
