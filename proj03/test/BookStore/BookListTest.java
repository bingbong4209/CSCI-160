/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookStore;

import java.util.Scanner;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Calvin
 */
public class BookListTest {

    @Test
    public void testAdd() {
        BookList list = new BookList();
        Book testBook = new Book("Test", "Test", 12.99, 9000, true);
        list.add(testBook);
        boolean expected = true;
        boolean actual = false;
        for (int i = 0; i < list.getSize(); i++) {
            if (list.getBook(i).equals(testBook)) {
                actual = true;
            }
        }
        assertEquals(expected, actual);
    }

    @Test
    public void testRemove() {
        BookList list = new BookList();
        Book testBook = new Book("Test", "Test", 12.99, 9000, true);
        list.add(testBook);
        list.remove(testBook);
        boolean expected = true;
        boolean actual = false;
        if (list.size == 1) {
            actual = true;
        }

        assertEquals(expected, actual);
    }

    @Test
    public void testGetBook() {
        BookList list = new BookList();
        Book testBook = new Book("Test", "Test", 12.99, 9000, true);
        list.add(testBook);
        Book expected = testBook;
        Book actual = list.getBook(0);

        assertEquals(expected, actual);
    }

    @Test
    public void testGetBookOutOfBounds() {
        BookList list = new BookList();
        Book testBook = new Book("Test", "Test", 12.99, 9000, true);
        list.add(testBook);
        Book actual = list.getBook(10);

        assertEquals(null, actual);
    }

    @Test
    public void testTrimToSize() {
        BookList list = new BookList();
        list.add(new Book("Test", "Test", 12.99, 9000, true));
        list.add(new Book("Test", "Test", 12.99, 9000, true));
        list.add(new Book("Test", "Test", 12.99, 9000, true));
        list.add(new Book("Test", "Test", 12.99, 9000, true));
        list.add(new Book("Test", "Test", 12.99, 9000, true));
        list.add(new Book("Test", "Test", 12.99, 9000, true));
        list.add(new Book("Test", "Test", 12.99, 9000, true));
        int expected = 7;
        list.trimToSize();
        int actual = list.getSize();

        assertEquals(expected, actual);
    }

    @Test
    public void testEnsureCapacity() {
        BookList list = new BookList();
        list.add(new Book("Test", "Test", 12.99, 9000, true));
        int expected = 1;
        int actual = list.getSize();

        assertEquals(expected, actual);
    }

    @Test
    public void testSortList() {
        BookList list = new BookList();
        boolean expected = true;
        list.sortList();
        boolean actual = false;
        if (list.getBook(0).getTitle().equals("Advanced HTML")) {
            actual = true;
        }

        assertEquals(expected, actual);
    }

    @Test
    public void testDisplayList() {
        BookList list = new BookList();
        Scanner scan = new Scanner(System.in);
        int j = 0;
        list.displayList();
        for (int i = 0; i < list.getSize(); i++) {
            if (scan.hasNextLine()) {
                j++;
            }

        }
        int expected = list.getSize();
        int actual = j;

        assertEquals(expected, actual);
    }

}
