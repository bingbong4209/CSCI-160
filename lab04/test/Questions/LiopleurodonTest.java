/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questions;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author araderma
 */
public class LiopleurodonTest
{

    @Test
    public void testIsMagicalMutatorMethod()
    {
        // Create an instance of the class
        Liopleurodon testObject = new Liopleurodon();
        
        // Predetermine the expected result assuming the method works
        boolean expected = false; 
        
        // Call the method that performs the operation we want to test
        testObject.setIsMagical(false);
        
        // Get the actual result by using an accessor method
        boolean actual = testObject.isIsMagical();
        
        // Use an assert method to check if the results match
        assertEquals(expected, actual);
        
        // Note: Full version of this method call would be of the form:
        //
        //      org.junit.Assert.assertEquals(expected, actual);
        //
        // However, we have imported the static methods of the package org.junit.Assert 
        //  so that part of the method call in this case  
    }
    public void testNameMutatorMethod()
    {
        Liopleurodon testObject = new Liopleurodon();
        
        String expected = "Harold";
        
        testObject.setName("Harold");
        
        String actual = testObject.getName();
        
        assertEquals(expected, actual);
    }
    
     public void testOccupationMutatorMethod()
    {
        Liopleurodon testObject = new Liopleurodon();
        
        String expected = "Welder";
        
        testObject.setName("Welder");
        
        String actual = testObject.getName();
        
        assertEquals(expected, actual);
    }
    
      public void testLocationMutatorMethod()
    {
        Liopleurodon testObject = new Liopleurodon();
        
        String expected = "Austria";
        
        testObject.setName("Austria");
        
        String actual = testObject.getName();
        
        assertEquals(expected, actual);
    }
}
