/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Calvin
 */
public class Parrot extends Bird {

    ArrayList<String> words = new ArrayList<>();

    public Parrot() {
        super("Polly", 2010, Color.GREEN);
        words.add(name);
    }

    public void addWord(String word) {
        words.add(word);
    }

    public String listWordsKnown() {
        String listOfWords = "";
        for (String word : words) {
            listOfWords += word + "; ";
        }

        return listOfWords;
    }

    @Override
    public String toString() {
        return name + ", " + getBirthYear() + ", " + getFeatherColor() + ", " + listWordsKnown();
    }
}
