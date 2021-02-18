/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelperClasses;

import java.util.Scanner;

/**
 *
 * @author Calvin
 */
public class MenuHelper {

    private MenuHelper() {

    }

    public static int displayMenu(String message, int min, int max) {
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        int selected = 0;

        while (!(selected > min && selected < max)) {
            while (!scan.hasNextInt()) {
                System.out.println("Please enter a valid integer in the given range");
                scan.nextLine();
            }

            selected = scan.nextInt();

            if (selected >= min && selected <= max) {
                break;
            } else {
                System.out.println("Please enter a valid integer in the given range");

            }
        }

        return selected;

    }

    public static String getInput(String prompt) {
        Scanner scan = new Scanner(System.in);
        System.out.println(prompt);
        String answer = scan.nextLine();
        return answer;
    }
}
