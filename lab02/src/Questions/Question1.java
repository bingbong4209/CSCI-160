/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import ProvidedClasses.Person;

/**
 *
 * @author (Calvin Stepan)
 */
public class Question1 
{

    /* For this portion of the assignment you will be instantiating objects of the Person class
     *  and using the various constructor methods of that class. 
     */
    
    /* 1) Declare a variable of type Person with the identifier defaultPerson and assign to it a reference 
     *  to a Person object created using the default constructor method of the Person class.
     */
 
    /* 2) Declare a variable of type Person with the identifier namedPerson and assign to it a reference 
     *  to a Person object created using the constructor method of the Person class that takes 
     *  a single String as an argument. You may use any String of your choosing so long as it is not 
     *  the empty String. 
     */
 
    /* 3) Declare a variable of type Person with the identifier agedPerson and assign to it a reference
     *  to a Person object created using the constructor method of the Person class that takes
     *  a single int as an argument. You may use any int value of your choosing so long as it is positive.
     */
 
    /* 4) Declare a variable of type Person with the identifier fullyCustom and assign to it a reference
     *  to a Person object created using the constructor method of the Person class that takes a String
     *  and an int as arguments. You may use any values of your choosing so long as the String is not 
     *  the empty String and the int is a positive number. 
     */
    
     // Your code here:
    
    Person defaultPerson = new Person();
    Person namedPerson = new Person("Jimmy");
    Person agedPerson = new Person(75);
    Person fullyCustom = new Person("Carl", 45);
    
    
    
    
    
}
