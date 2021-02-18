package Questions;

import java.util.Random;



/**
 *
 * @author (Calvin Stepan)
 */
public class Question6 
{
    /* For this portion of the assignment you will be working with the Random class 
     *  and generating random numbers. 
     * 
     * When you are finished, you can run the unit tests located in the Question6Test.java
     *  file to verify the correctness of your solution.
     * 
     * Note: The unit tests use a Monte Carlo style simulation to test the correctness of a solution. 
     *  In is unlikely, but there is a small chance for the tests to fail with the correct input. 
     *  This is unlikely with high probability. 
     */
 
    /* 1) Instantiate a new Random object (using the default constructor) and assign it to an 
     *      object reference of your choosing. 
     *      Note: You may need to import the Random class!
     */

    /* 2) Instantiate a new Random object (using the alternate constructor that takes a 
     *      single int as an argument and passing the int literal 1 as that argument)
     *      and assign it to an object reference of your choosing.
     *
     * Note: Pay careful attention to which object reference you are using to call methods on in the 
     *  following steps. 
     */
 
    /* 3) Declare an int variable with the identifier num1 and use the object reference you created in Part 1
     *      to generate a random number between 0 and 20 inclusive and assign it to num1.
     */
 
    /* 4) Declare an int variable with the identifier num2 and use the object reference you created in Part 1
     *      to generate a random number between 17 and 33 inclusive and assign it to num2. 
     */
 
    /* 5) Declare an int variable with the identifier num3 and use the object reference you created in Part 1
     *      to generate a random number between -15 and 15 inclusive and assign it to num3.
     */
 
    /* 6) Declare an int variable with the identifier num4 and use the object reference you created in Part 2 
     *      to generate a random number between 0 and 100 inclusive and assign it to num4. 
     */
 
    /* 7) Declare an int variable with the identifier num5 and use the object reference you created in Part 2
     *      to generate a random number between 1 and 100000 inclusive and assign it to num5.   
     */
 
    /* Note: When running the unit tests, you may want to look at the values stored in each of the variables
     *  and run the tests multiple times to see how they change. 
     */
    
    // Your code here: 
    
    Random wut = new Random();
    Random huh = new Random(1);
    int num1 = wut.nextInt(21);
    int num2 = wut.nextInt(33 - 17 + 1) + 17;
    int num3 = wut.nextInt(15 + 15 + 1) - 15;
    int num4 = huh.nextInt(101);
    int num5 = huh.nextInt(100000 - 1 + 1) + 1;
    
    
    
    
    
    
      
}
