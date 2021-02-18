package Questions.Files;

import ProvidedClasses.Student;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author (Your Name Here)
 */
public class Question6 {

    /* For this part of the assignment you will need to write some code that will parse a human-readable formatted text file.
       
        You can use the Scanner class to read the file (Chapter 11.5) 
       
        The file has the following format:
            Name,ID,GPA,Course1,Course2,...,courseN
        
            Name    - A String type representing a student's name
            ID      - An int type representing a student's ID number
            GPA     - A double type representing a student's GPA
            Course  - A String type representing a course the student is enrolled in.
       
        Note that there may be multiple courses. 
        Files may contain multiple lines following this format. 
       
        Your code should perform the following actions:
       
        1) Open the file specified by the parameter fileName for reading.
            * If the file cannot be found, return an empty ArrayList containing no students.
        2) Parse the file until you run out of input.
        3) For every line of the file, construct a new Student object and add it to an ArrayList that you will return later.
            * The Student constructor is of takes the following arguments (String, int, double, String[]) in that order.
            * If the file does not follow the specified format above, throw a new InputMismatchExcpetion with the message "Input file is malformed."
                * Note: You may need to catch an exception of this type first before throwing your own. 
            * Note: You may want to use the split method as part of your solution as it is easier than other approaches. 
        4) Return the ArrayList of Students. 
     */
    public static ArrayList<Student> parseStudentFile(String fileName) {
        ArrayList<Student> studentList = new ArrayList<>();
        try {
            Scanner scan = new Scanner(new File(fileName));

            while (scan.hasNext()) {
                String name = scan.nextLine();
                int id = scan.nextInt();
                double gpa = scan.nextDouble();
                String[] courses = {scan.nextLine(), scan.nextLine(), scan.nextLine()};
                studentList.add(new Student(name, id, gpa, courses));
            }
            scan.close();

        } catch (FileNotFoundException fnfe) {
            ArrayList<Student> emptyList = new ArrayList<>();
            return emptyList;
        } catch (InputMismatchException imme) {
            throw new InputMismatchException("Input file is malformed.");

        }
        return studentList;
    }

    public static void main(String[] args) {
        for (Student s : parseStudentFile("files/question6/list1.txt")) {
            System.out.println(s.toString());
        }
    }

}
