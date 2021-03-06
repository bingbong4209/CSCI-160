package Questions.Chapter8;

/**
 *
 * @author (Calvin)
 */
import Questions.Chapter8.ArrayUtilities;

public class Question1 {

    /*  For this portion of the assignment, you will be declaring and instantiating several different arrays.
        You may use any identifier you would like, but they should be meaningful given the context of the problem.
    
        1) Create an array of type int that will be used to store the scores of a student's five assignments.
           You do not need to modify the values of this array after it is instantiated. 
        2) Create an array of type String that will be used to store the names of ten people.
            a) Assign the value "Jill" to the element index position three (3) of the array. 
            b) Assign the value of "Jack" to the ninth (9th) element of the array. 
        3) Create an array of type double that will be used to store the tip amounts earned by a waiter
            a) Explicitly assign the array the following values (in this order) during instantiation:
                * 7.34
                * 4.72
                * 9.32
                * 8.25
        4) Create an array of type boolean that will store responses to a true/false question for 17 people
           An interesting pattern occured with the results where every third person responded true and all others false.
            a) Write a for loop that assigns every third element in the array the value true.
        5) The waiter from part 3 just had a few last minute customers stop. 
            a) Create a new array that has room for an additional two tips.
            b) Copy the values of the first four elements from the array created in step 2 into this array
            c) Assign a value of 1.05 for the tip left by the fifth customer.
            d) Assign a value of 27.32 for the tip left by the last customer.
    
        You may have noticed that the return type for this method is an Object array.
        Return an Object array that includes as elements each of the five arrays you created above. 
        The elements of the array should be placed in the order in which they are created based on the above instructions. 
     */
    public static Object[] Question1() {
        int[] scores = new int[5];
        String[] names = new String[10];
        names[3] = "Jill";
        names[8] = "Jack";
        double[] tips = {7.34, 4.72, 9.32, 8.25};
        boolean[] responses = new boolean[17];
        for (int i = 2; i < responses.length - 1; i += 3) {
            responses[i] = true;
        }
        double[] newTips = new double[6];
        newTips[4] = 1.05;
        newTips[5] = 27.32;
        for (int i = 0; i < tips.length - 1; i++) {
            newTips[i] = tips[i];
        }
        Object[] total = {scores, names, tips, responses, newTips};
        return total;
    }
}
