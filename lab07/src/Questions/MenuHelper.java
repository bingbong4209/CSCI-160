/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class MenuHelper {

    public static int displayMenu(String message, int min, int max) {
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        int selected = 0;

        while (!(selected > min && selected < max)) {
            while (!scan.hasNextInt()) {
                System.out.println("Please enter a valid integer in the given range");
                scan.nextLine();
            }
            System.out.println("Please enter a valid integer in the given range");

            selected = scan.nextInt();

            if (selected >= min && selected <= max) {
                break;
            }
        }

        return selected;

    }

    public static void main(String[] args) {
        int mainCourse = displayMenu("Please choose a main course: \n"
                + "1)Chicken \n"
                + "2)Beef \n"
                + "3)Pork \n"
                + "Please enter a selection 1-3: ", 1, 3);
        int side = displayMenu("Please choose a side:\n"
                + " 1)Baked Potato \n"
                + " 2)Soup \n"
                + " 3)Salad \n"
                + " 4)Vegetables \n"
                + "Please enter a selection: ", 1, 4);
        int side2 = displayMenu("Please choose a side:\n"
                + " 1)Baked Potato \n"
                + " 2)Soup \n"
                + " 3)Salad \n"
                + " 4)Vegetables \n"
                + "Please enter a selection: ", 1, 4);
        System.out.println("You selected options " + mainCourse + ", " + side + ", " + side2 + " for your choices.");
    }
}
