/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MyUnitTests;

import Questions.ScrabbleScore;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author araderma
 */
public class ScrabbleScoreTest {
    
    public ScrabbleScoreTest() {
    }
    
    //testing all caps to see if it treats things the same as lower case
    @Test
    public void testCalculateScoreCaps() {
        String input = "ANDREW";
        int expected = 10;
        int actual = ScrabbleScore.calculateScore(input);
        assertEquals(expected, actual);
    }
    
    //testing a, e, i, b, d, h, and z to ensure we have the right math
    @Test
    public void testCalculateScoreZebediah() {
        String input = "Zebediah";
        int expected = 23;
        int actual = ScrabbleScore.calculateScore(input);
        assertEquals(expected, actual);
    }
    
    //testing to see if it will counts spaces in the total
    @Test
    public void testCalculateScoreSpaces() {
        String input = " Oui ";
        int expected = 3;
        int actual = ScrabbleScore.calculateScore(input);
        assertEquals(expected, actual);
    }
    
    //testing k and w to check values. the other ones have already been tested
    @Test
    public void testCalculateScoreKwanzA() {
        String input = "KwanzA";
        int expected = 23;
        int actual = ScrabbleScore.calculateScore(input);
        assertEquals(expected, actual);
    }
    
    //testing to see what it does when given numbers with letters.
    @Test
    public void testCalculateScoreNumbersAndLetters() {
        String input = "123_johnny";
        int expected = -1;
        int actual = ScrabbleScore.calculateScore(input);
        assertEquals(expected, actual);
    }
    
    //testing to get -1 for an input that is purely invalid
    @Test
    public void testCalculateScoreNumbers() {
        String input = "-9071";
        int expected = -1;
        int actual = ScrabbleScore.calculateScore(input);
        assertEquals(expected, actual);
    }
    
    //this tests all the letters in lowercase to check all values as well as handling lower case letters
    @Test
    public void testCalculateScoreAllValues() {
        String input = "aeioulnrstdgbcmpfhvwykjxqz";
        int expected = 87;
        int actual = ScrabbleScore.calculateScore(input);
        assertEquals(expected, actual);
    }

    
    
}
