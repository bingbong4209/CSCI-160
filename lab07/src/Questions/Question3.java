package Questions;

import java.util.Scanner;


/**
 *
 * @author (Your Name Here)
 */
public class Question3 
{
     /* For this exercise, you will be writing a simple program that calculates 
         basic statistics for a list of user entered numbers
    
        1) Declare and instantiate a Scanner object to read in user input. 
         
        2) Declare three variables minimum, maximum, and average that will keep 
            track of the minimum, maximum, and average values for the user entered input. 
            
        3) Write a for loop that will read in exactly 10 integer values entered by the user. 
    
        4) Make sure that your program is type safe and will not crash if a user enters bad data.
    
        5) Store the largest value entered by the user inside of the variable maximum
    
        6) Store the smallest value entered by the user inside of the variable minimum
    
        7) Store the average of all values entered by the user inside of the variable average
 
        This program contains a main method that can be used to manually test your code by right-clicking Question3.java
        and selecting "Run File"   

    */  
    public static Object[] question3()
    {
        // Your code goes here
       Scanner scan = new Scanner(System.in);
        int minimum = Integer.MAX_VALUE, maximum = Integer.MIN_VALUE, newInt;
        double average = 0.0;
        String garbage;
        
        for (int i=0; i<10; i++) {
            System.out.println("Please enter " + (10 - i) + " more number(s).");
             
            while(!scan.hasNextInt()) {
            System.out.println("Error! Invalid number. Try again.");
            garbage = scan.nextLine(); 
            }
                newInt = scan.nextInt();
             
           if(newInt < minimum) {
                minimum = newInt;
            }
           if(newInt > maximum) {
                maximum = newInt;
            } 
            average += newInt;   
        }
         
        average = average/10;


        // Necessary for Unit Test
        return new Object[] {minimum, maximum, average}; 
    }
    
    public static void main(String[] args) 
    {
        Object[] o = question3();
        
        System.out.println("Minimum: " + (int)o[0]);
        System.out.println("Maximum: " + (int)o[1]);
        
        double average; 
        try 
        {
            average = (double)o[2];
        } catch (Exception e) 
        {
            average = (double)((int)o[2]);
        }
        
        System.out.println("Average: " + average);
    }
    
}
