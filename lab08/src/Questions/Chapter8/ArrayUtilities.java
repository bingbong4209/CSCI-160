/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions.Chapter8;

/**
 *
 * @author Calvin
 */
public class ArrayUtilities {

    private ArrayUtilities() {

    }

    /**
     *
     * @param array1
     * @param array2
     * @return Whether or not both arrays are equal to one another
     */
    public static boolean arraysAreEqual(int[] array1, int[] array2) {
        boolean isEqual = true;
        if (array1.length != array2.length) {
            isEqual = false;
        } else {
            for (int i = 0; i < array1.length && isEqual; i++) {
                if (Math.abs(array1[i] - array2[i]) > .001) {
                    isEqual = false;
                }
            }
        }

        return isEqual;
    }

    /**
     *
     * @param array
     * @param factor
     * @return The array resized by the factor (multiplied by it)
     */
    public static int[] resizeArray(int[] array, int factor) {
        int[] resizedArray = new int[factor];
        for (int i = 0; i < array.length; i++) {
            resizedArray[i] = array[i];
        }
        array = resizedArray;
        resizedArray = null;
        return array;
    }

    /**
     *
     * @param array
     * @return The array resized by a factor of 2 (multiplied by 2)
     */
    public static int[] resizeArray(int[] array) {
        int[] resizedArray = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            resizedArray[i] = array[i];
        }
        array = resizedArray;
        resizedArray = null;
        return array;
    }

    /**
     *
     * @param array
     * @return a copy of the specified array
     */
    public static int[] copyArray(int[] array) {
        int[] copiedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copiedArray[i] = array[i];
        }
        return copiedArray;
    }

}
