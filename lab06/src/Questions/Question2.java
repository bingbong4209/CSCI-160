/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questions;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;


/**
 *
 * @author (Your Name Here)
 */
public class Question2 
{
    /*  In this exercise you will use if and else statements to write some code that simulates a gambler
        who makes various wagers. 
        As part of your solution, you will use the following parameters that are passed in to the method:
            A double variable with the identifier money that indicates how much money the gambler has.
            A double variable with the identifier wager that indicates how much money is being wagered in a particular bet.
            A Boolean variable with the identifier outcome that indicates if the gambler wins (true) or loses (false)
    
        1) In some cases the gambler is unable to fix the outcome of the wager ahead of time and must rely on luck.
           Use an if statement to check if outcome has a value (whether or not it is null)
            If it does not have a value, you will need to assign it one by instantiating a Random object 
            and using one of its methods.
    
        2) Use an if/else statement to determine if the gambler has won the wager (outcome is true) 
            If the gambler has won the wager, add the wager to amount of money the gambler has and
            Call the println method and print the following: 
            "I've won a $wager wager and now have $money!" 
                where $wager and $money are the values of the wager and how much money the gambler now has respectively.
                
            If the gambler has lost the wager, subtract the wager from the amount of money the gambler has and
            Call the println method and print the following: 
            "I've lost a $wager wager and now have $money!"
                where $wager and $money are the values of the wager and how much money the gambler now has respectively.
    
        3) Because our gambler is a person of refinement, it would be uncouth not to have properly formatted output
            You should create a currency instance of the NumberFormat class (US Locale) and use that to format any currency amounts
    
        4) Occasionally our gambler might bite off more than they can chew and run out of money. 
           Use an if statement to check if the gambler still has any money.
            If the gambler has no money left, call the println method and print the following: 
            "Drats! I've gone bust."
    
    */
    public static Object[] question2(double money, double wager, Boolean outcome)
    {
        // Your code goes here:
        Random rand = new Random();
        if (outcome == null) {
            outcome = rand.nextBoolean();
        } else {
        }
        
        if(outcome == true) {
            money = money + wager;
            System.out.println("I've won a " + NumberFormat.getCurrencyInstance(Locale.US).format(wager) + 
                    " wager and now have " + NumberFormat.getCurrencyInstance(Locale.US).format(money)+ "!");
        } else {
            money = money - wager;
            System.out.println("I've lost a " +  NumberFormat.getCurrencyInstance(Locale.US).format(wager) + 
                    " wager and now have " + NumberFormat.getCurrencyInstance(Locale.US).format(money) + "!");
        }
        
        if(money <= 0) {
            System.out.println("Drats! I've gone bust.");
        }
        
        
        

        // Necessary for unit test. Do not remove!
        return new Object[] {money, outcome};
    }
    
    public static void main(String[] args)
    {
        // Example input to test method
        question2(100, 50, true);
    }
}