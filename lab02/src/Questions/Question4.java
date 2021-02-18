package Questions;


import ProvidedClasses.Student;
import java.util.*;
/**
 *
 * @author (Calvin Stepan)
 */
public class Question4 
{
    
    public static Student method()
    {
        /* For this portion of the assignment you will be working with the Scanner class to read in user input. 
         *  You will also be using the println method to prompt the user to enter certain values.
         * 
         * Note: At the bottom of the code block is a line of code that is necessary for  
         *  the unit test to function. Ensure that you do not accidentally remove or modify it.          
         * 
         * When you are finished, you can run the unit tests located in the Question4Test.java
         *  file to verify the correctness of your solution.
         * 
         * Note: This class also contains a main method that will allow you to test your solution manually. 
         */
 
        /* 1) Create an instance of the Scanner class and associate it with the System.in data source.
         *      You may choose any identifier you like for your object reference.
         *      Note: You may need to import the Scanner class!
         */
 
        /* 2) Use the println method (System.out.println()) to prompt the user to enter a Student's name.
         */

        /* 3) Declare a String variable (with identifier of your choosing) and assign it the value 
         *      returned by calling the nextLine method on your Scanner object reference.
         */

        /* 4) Use the println method to prompt the user to enter an ID for the student. 
         */

        /* 5) Declare a variable of type int and assign it the value returned by calling the 
         *      nextInt method on the Scanner object reference. 
         */
 
        /* 6) Use the println method to prompt the user to enter 3 exam scores separated by a space. 
         */
 
        /* 7) Declare three int variables and assign each the value returned by calling the 
         *      nextInt method on the Scanner object reference.
         */
 
        /* 8) Declare a variable of type Student with the identifier myStudent and assign it the value 
         *      of a Student object using the values stored in the variables read in in parts 3, 5, and 7 as arguments. 
         */

        /* Note: You may want to select "Run File" in addition to "Test File" to manually run your code and see the results for yourself. 
         */
        
        // Your code here:
       
        Scanner testScan = new Scanner(System.in);
        System.out.println("Please enter a student's name");
        String testLine = testScan.nextLine();
        System.out.println("Please enter an ID for the student");
        int scanNum = testScan.nextInt();
        System.out.println("Enter 3 exam Scores separated by a space");
        int scanNum2 = testScan.nextInt();
        int scanNum3 = testScan.nextInt();
        int scanNum4 = testScan.nextInt();
        Student myStudent = new Student(testLine, scanNum, scanNum2, scanNum3, scanNum4);
        
        
        
        
        
        // Necessary for Unit Test. Do not remove or modify!
        // If there is a compiler error with the following line, it is likely because you have mispelled an identifier. 
        return myStudent;  
    }
    
    // Main method that allows you to run your code.
    // It is not necessary to modify this code. 
    public static void main(String[] args) 
    {
        Student createdStudent = method(); 
        
        System.out.println(createdStudent);
    }
}
