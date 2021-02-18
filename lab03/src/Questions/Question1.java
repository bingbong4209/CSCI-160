package Questions;

import ProvidedClasses.Student;
import ProvidedClasses.Teacher;

/**
 *
 * @author (Your Name Here)
 */
public class Question1 
{
    public static Object[] question1()
    {
        /**
         * For this portion of the assignment you will be creating several instances of different
         *  user-defined Java classes that interact with each other.
	 * Note: The unit tests for this file cannot be run until all steps have been completed.
         * 
         * 1) Declare a Teacher variable (object reference) with the identifier teacher1 and  
         *      assign it to reference a Teacher object you instantiate using the constructor that 
         *      takes a String and an int as arguments. You can choose any valid values for these arguments.
         */
        
        /** 2) Declare a Teacher variable (object reference) with the identifier teacher2 and 
         *      assign it to  reference a Teacher object you instantiate using the constructor that 
         *      takes a String and an int as arguments. You should use the EXACT SAME values as 
         *      you used as arguments in the last step. 
         */
        
        /** 3) Declare a Student variable (object reference) with the identifier student1 and  
         *      assign it to reference a Student object you instantiate using the constructor that 
         *      takes a String, an int, and a Teacher as arguments. You can choose any values for the 
         *      first two arguments. The third argument should be the Teacher you created in part 1.
         */
        
        /** 4) Declare a Student variable (object reference) with the identifier student2 and  
         *      assign it to reference a Student object you instantiate using the constructor that 
         *      takes a String, an int, and a Teacher as arguments. You can choose any values for the 
         *      first two arguments. The third argument should be the Teacher you created in part 1.
         */
        
        /** 5) Declare a Student variable (object reference) with the identifier student3 and  
         *      assign it to reference a Student object you instantiate using the constructor that 
         *      takes a String, an int, and a Teacher as arguments. You can choose any values for the 
         *      first two arguments. The third argument should be the Teacher you created in part 2.
         */
        
        /** 6) Call the getTeacher method on the student1 object reference and set the name of  
         *      that Teacher to something else. 
         *      Note: You can chain the method calls to do this together, or you can store the result
         *       of the getTeacher method in a new object reference first. 
         */
        
        /** 7) Call the getTeacher method on the student3 object reference and set the ID of 
         *      that Teacher to something else. 
         *      Note: You can chain the method calls to do this together, or you can store the result
         *       of the getTeacher method in a new object reference first. 
         */
        
        /** Once you have completed these steps you should run this file (i.e., right-click Question1 and select Run File)
         *   to view the output and consider the results. 
         * 
         * Your code should be placed immediately below these instructions or between the block comments
         */
        
        Teacher teacher1 = new Teacher("Mr. Anderson", 1234567);
        Teacher teacher2 = new Teacher("Mr. Anderson", 1234567);
        Student student1 = new Student("Carl Wheezer", 1313131, teacher1);
        Student student2 = new Student("Jimmy's Mom", 5634891, teacher1);
        Student student3 = new Student("Ferb", 938571, teacher2);
        student1.getTeacher().setName("Mrs. Neutron");
        student3.getTeacher().setID(456123);
        

         
         
         
        // Necessary for Unit Tests. Do not delete.
        return new Object[] {teacher1, teacher2, student1, student2, student3}; 
    }
    
    public static void main(String[] args)
    {
        System.out.println("student1: " + question1()[2]);
        System.out.println("student2: " + question1()[3]);
        System.out.println("student3: " + question1()[4]);
        System.out.println("teacher1: " + question1()[0]);
        System.out.println("teacher2: " + question1()[1]);
    }
}
