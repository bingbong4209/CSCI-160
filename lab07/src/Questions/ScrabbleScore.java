/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

/**
 *
 * @author User
 */
public class ScrabbleScore {

    public static int calculateScore(String word) {

       
        //reset score
        int score = 0;

        for (int i = 0; i < word.length(); i++) {
             //Do all the work up here so that the if loops look nicer
        boolean blank = word.toLowerCase().charAt(i) == ' ';
        boolean onePoint = word.toLowerCase().charAt(i) == 'a' || word.toLowerCase().charAt(i) == 'e' || word.toLowerCase().charAt(i) == 'i'
                || word.toLowerCase().charAt(i) == 'o' || word.toLowerCase().charAt(i) == 'u' || word.toLowerCase().charAt(i) == 'l'
                || word.toLowerCase().charAt(i) == 'n'
                || word.toLowerCase().charAt(i) == 'r' || word.toLowerCase().charAt(i) == 's' || word.toLowerCase().charAt(i) == 't';
        boolean twoPoints = word.toLowerCase().charAt(i) == 'd' || word.toLowerCase().charAt(i) == 'g';
        boolean threePoints = word.toLowerCase().charAt(i) == 'b' || word.toLowerCase().charAt(i) == 'c' || word.toLowerCase().charAt(i) == 'm'
                || word.toLowerCase().charAt(i) == 'p';
        boolean fourPoints = word.toLowerCase().charAt(i) == 'f' || word.toLowerCase().charAt(i) == 'h' || word.toLowerCase().charAt(i) == 'v'
                || word.toLowerCase().charAt(i) == 'w' || word.toLowerCase().charAt(i) == 'y';
        boolean fivePoints = word.toLowerCase().charAt(i) == 'k';
        boolean eightPoints = word.toLowerCase().charAt(i) == 'j' || word.toLowerCase().charAt(i) == 'x';
        boolean tenPoints = word.toLowerCase().charAt(i) == 'q' || word.toLowerCase().charAt(i) == 'z';
            if (onePoint == true) {
                score += 1;
            } else if (twoPoints == true) {
                score += 2;
            } else if (threePoints == true) {
                score += 3;
            } else if (fourPoints == true) {
                score += 4;
            } else if (fivePoints == true) {
                score += 5;
            } else if (eightPoints == true) {
                score += 8;
            } else if (tenPoints == true) {
                score += 10;
            } else if (blank == true) {
                score += 0;
            } else {
                return -1;
            }
        }

        if (word.isEmpty()) {
            score = -1;
        }

        return score;
    }
}
