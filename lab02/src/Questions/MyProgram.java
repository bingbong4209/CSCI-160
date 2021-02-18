/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class MyProgram {

    public static void main(String[] args) {
                 
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a name for a Student");
    String studentName = scan.nextLine();
    Random rand = new Random();
    int examScore1 = 56;
    int examScore2 = 69;
    int examScore3 = 99;
    System.out.println("Name: " + studentName + "\n ID: " + (rand.nextInt(99999 - 1 + 1) + 1) + " \n Exam Scores: " + examScore1 + ", " + examScore2 + ", " + examScore3);
    }
}
