/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.util.Random;

/**
 *
 * @author Calvin
 */
public class Magic8Ball {
    


    public static String askQuestion(String newQuestion) {
              Random rand = new Random();
              int randomInt = rand.nextInt(5) + 1;
        
        if(newQuestion.toLowerCase().startsWith("who") && randomInt == 1) {
            return "My mother";
        } else if(newQuestion.toLowerCase().startsWith("who") && randomInt == 2) {
            return "That was your friend, boss";
        } else if(newQuestion.toLowerCase().startsWith("who") && randomInt == 3) {
            return "They are remarkable!";
        } else if(newQuestion.toLowerCase().startsWith("who") && randomInt == 4) {
            return "Mr. Katzenmyer does";
        } else if(newQuestion.toLowerCase().startsWith("who") && randomInt == 5) {
            return "Joe Biden";
        } else {
        }
        
        if(newQuestion.toLowerCase().startsWith("what") && randomInt == 1) {
            return "The number 42";
        } else if(newQuestion.toLowerCase().startsWith("what") && randomInt == 2) {
            return "I promise it is broccoli";
        } else if(newQuestion.toLowerCase().startsWith("what") && randomInt == 3) {
            return "An old math topic";
        } else if(newQuestion.toLowerCase().startsWith("what") && randomInt == 4) {
            return "A highly complex device meant \nto perform operations per second";
        } else if(newQuestion.toLowerCase().startsWith("what") && randomInt == 5) {
            return "It is no more than a \nfigment of your imagination";
        } else if(newQuestion.toLowerCase().startsWith("what") != true && randomInt == 1){
            return "The election should be \ninteresting";
        }
        
        if(newQuestion.toLowerCase().startsWith("where") && randomInt == 1) {
            return "to the left of you";
        } else if(newQuestion.toLowerCase().startsWith("where") && randomInt == 2) {
            return "look for the light \nat the end of the tunnel";
        } else if(newQuestion.toLowerCase().startsWith("where") && randomInt == 3) {
            return "Somewhere in the world";
        } else if(newQuestion.toLowerCase().startsWith("where") && randomInt == 4) {
            return "I cannot determine the \nexact coordinates at this time";
        } else if(newQuestion.toLowerCase().startsWith("where") && randomInt == 5) {
            return "The White House of course!";
        } else if(newQuestion.toLowerCase().startsWith("where") != true && randomInt == 2) {
            return "Take it back now yall";
        } else {
        }
        
        if(newQuestion.toLowerCase().startsWith("when") && randomInt == 1) {
            return "Tomorrow, I promise you";
        } else if(newQuestion.toLowerCase().startsWith("when") && randomInt == 2) {
            return "Most likely next year\n assuming the virus has subsided";
        } else if(newQuestion.toLowerCase().startsWith("when") && randomInt == 3) {
            return "It could be a week, month,\n or year for all I know";
        } else if(newQuestion.toLowerCase().startsWith("when") && randomInt == 4) {
            return "Usually after the \nfirst of the year";
        } else if(newQuestion.toLowerCase().startsWith("when") && randomInt == 5) {
            return "It depends on the \nsituation at hand";
        } else if (newQuestion.toLowerCase().startsWith("why") != true && randomInt == 3) {
            return "I would hope so";
        } else {
        }
        
        if(newQuestion.toLowerCase().startsWith("why") && randomInt == 1) {
            return "That is up to you, \nI cannot help you decide fate";
        } else if(newQuestion.toLowerCase().startsWith("why") && randomInt == 2) {
            return "Because the economy \nhas never been better";
        } else if(newQuestion.toLowerCase().startsWith("why") && randomInt == 3) {
            return "You did not fulfill the \nrequirements, that is why";
        } else if(newQuestion.toLowerCase().startsWith("why") && randomInt == 4) {
            return "to get to the other side!";
        } else if(newQuestion.toLowerCase().startsWith("why") && randomInt == 5) {
            return "Mother nature created \nthem that way";
        } else if (newQuestion.toLowerCase().startsWith("why") != true && randomInt == 4) {
            return "The spirits are telling \nme you are wrong";
        } else {
        }
        
        if(newQuestion.toLowerCase().startsWith("how") && randomInt == 1) {
            return "They watch your every move";
        } else if(newQuestion.toLowerCase().startsWith("how") && randomInt == 2) {
            return "It may be a lot of work \nup front, but down the roadit gets better";
        } else if(newQuestion.toLowerCase().startsWith("how") && randomInt == 3) {
            return "That is not something you \nwant to do my friend, trust me";
        } else if(newQuestion.toLowerCase().startsWith("how") && randomInt == 4) {
            return "Fairly decent actually";
        } else if(newQuestion.toLowerCase().startsWith("how") && randomInt == 5) {
            return "The predictions are correct";
        } else if(newQuestion.toLowerCase().startsWith("how") != true && randomInt == 5){
            return "As time passes, \n"
                    + "situations improve my friend";
        } else {
        }
        return "User error, please ask again";
    }
}
