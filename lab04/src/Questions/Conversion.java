/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

/**
 *
 * @author User
 */
public class Conversion {
        int temp;
        int meters;
        int inches;
        double doubleTemp;
        double doubleMeters;
        double doubleInches;
        
     private Conversion()
    {

    }
     
     public static int celsiusToFahrenheit(int temp)
     {
         return (int)(((9.0/5) * temp) + 32);
     }
     
     public static int fahrenheitToCelsius(int temp)
     {
         return (int)((temp - 32) / (9.0/5));
     }
     
     public static int metersToInches(int meters)
     {
         return (int)(meters * 39.37008);
     }
     
     public static int inchesToMeters(int inches)
     {
         return (int)(inches * .0254);
     }
     
     public static double celsiusToFahrenheit(double doubleTemp)
     {
         return (1.8 * doubleTemp) + 32.0;         
     }
     
     public static double fahrenheitToCelsius(double doubleTemp)
     {
         return ((doubleTemp - 32.0) / 1.8);
     }
     
     public static double metersToInches(double doubleMeters)
     {
         return doubleMeters * 39.37008;
     }
     
     public static double inchesToMeters(double doubleInches)
     {
         return doubleInches * .0254;
     }
}
