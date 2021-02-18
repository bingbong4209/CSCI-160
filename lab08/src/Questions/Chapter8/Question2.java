/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions.Chapter8;

/**
 *
 * @author (Calvin)
 */
public class Question2 {

    public static Object[] Question2(double[] input) {
        /**
         * For this part of the assignment you will be doing simple array
         * processing on an array of type double with the identifier input that
         * is being passed as a parameter to this method.
         *
         * You should calculate and return the following values as elements of
         * an array of type Object in the following order:
         *
         * 1) An int value representing the count (number of elements in the
         * input array) 2) A double value representing the sum (total of
         * elements in the input array) 3) A double value representing the value
         * of the smallest element in the input array *Note: If there are no
         * elements, return the special value Double.NaN 4) A double value
         * representing the value of the largest element in the input array
         * *Note: If there are no elements, return the special value Double.NaN
         */

        // Process the array called input here
        int count = input.length;
        double sum = 0.0;
        
        //by adding the value of the input at i to the sum, I can sum up all the elements in the array
        for (int i = 0; i < input.length; i++) {
            sum += input[i];
        }
        double min = 0.0;
        double max = 0.0;

        //This checks to see if the array is empty, and how to assign the max and min values if that is the case.
        if (input.length - 1 < 0) {
            min = Double.NaN;
            max = Double.NaN;
        }

        //This loop updates the max and min values based on the elements in the array, where by the end the max and min should be the max and min values of the array, respectively
        for (int i = 0; i < input.length; i++) {

            if (input[i] < min) {
                min = input[i];
            } else if (input[i] > max) {
                max = input[i];
            }
        }

        // Create your Object[] storing the count, sum, min, and max here and return it
        Object[] total = {count, sum, min, max};
        return total;
    }

}
