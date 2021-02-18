/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookStore;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Calvin
 */
public class BookstoreTest {

    //Valid Case
    @Test
    public void testLookUpExistingAuthor() {
        BookStore store = new BookStore();
        String title = "Java Servlets"; 
        String expected = "Brown";
        String actual =  store.lookUpAuthor(title);
                
        assertEquals(expected, actual);
    }

    //Invalid Case
    @Test
    public void testLookUpNonExistentAuthor() {
        BookStore store = new BookStore();
        String title = "The Giving Tree"; 
        String expected = "Could not find book";
        String actual =  store.lookUpAuthor(title);
                
        assertEquals(expected, actual);
    }

    @Test
    public void testLookUpExistingPrice() {
        BookStore store = new BookStore();
        String title = "Java Servlets"; 
        double expected = 75.99;
        double actual =  store.lookUpPrice(title);
                
        assertEquals(expected, actual, 0.0);
    }
    
    @Test
    public void testLookUpNonExsitentPrice() {
        BookStore store = new BookStore();
        String title = "The Giving Tree"; 
        double expected = Double.NaN;
        double actual =  store.lookUpPrice(title);
                
        assertEquals(expected, actual, 0.0);
    }
    
    @Test
    public void testSearchForValidTitle() {
        BookStore store = new BookStore();
        String keyword = "Intro";
        int expected = 3;
        int actual =  store.searchForTitle(keyword).getSize();
                
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSearchForLowerCaseTitle() {
        BookStore store = new BookStore();
        String keyword = "Intro";
        int expected = 3;
        int actual =  store.searchForTitle(keyword).getSize();
                
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSearchForInvalidTitle() {
        BookStore store = new BookStore();
        String keyword = "Dababy";
        int expected = 0;
        int actual =  store.searchForTitle(keyword).getSize();
                
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSearchForExistingAuthor() {
        BookStore store = new BookStore();
        String author = "Brown"; 
        int expected = 1;
        int actual =  store.searchForAuthor(author).getSize();
                
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSearchForNonexistentAuthor() {
        BookStore store = new BookStore();
        String author = "Red"; 
        int expected = 0;
        int actual =  store.searchForAuthor(author).getSize();
                
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSearchForExistingPrice() {
        BookStore store = new BookStore();
        String price = "30"; 
        int expected = 1;
        int actual =  store.searchForPrice(price).getSize();
                
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSearchForNonExistentPrice() {
        BookStore store = new BookStore();
        String price = "10"; 
        int expected = 0;
        int actual =  store.searchForPrice(price).getSize();
                
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetLowestPriceBook() {
        BookStore store = new BookStore();
        Book expected = store.library.getBook(4);
        Book actual =  store.getLowestPriceBook();
                
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSearchByValidISN() {
        BookStore store = new BookStore();
        String isbn = "1234"; 
        Book expected = store.library.getBook(0);
        Book actual =  store.searchByISBN(isbn);
                
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSearchByNonExistentISBN() {
        BookStore store = new BookStore();
        String isbn = "112"; 
        Book expected = null;
        Book actual =  store.searchByISBN(isbn);
                
        assertEquals(expected, actual);
    }
}
