/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;
import java.awt.Color;

/**
 *
 * @author User
 */
public class Dog {
    private String name;
    private int numberOfTricks;
    private Color colorOfFur;
    
    //Default Constructor Method
    public Dog() {
        name = "Gerard";
        numberOfTricks = 0;
        colorOfFur = Color.darkGray;
    }
    
    //Secondary Constructor Method
    public Dog(String name, int numberOfTricks, Color colorOfFur) {
        this.name = name;
        this.numberOfTricks = numberOfTricks;
        this.colorOfFur = colorOfFur;
    }    
    
    
    public String getName() {
     return name;   
    }
    
    public int getNumberOfTricks() {
        return numberOfTricks;
    }
   
    public Color getColorOfFur() {
        return colorOfFur;
    }
    
    public void setNumberOfTricks(int numberOfTricks) {
        this.numberOfTricks = numberOfTricks;
    }
    
    @Override
    public String toString() {
        return "Name: "+ name + "; Number of Known Tricks: " + numberOfTricks + "; Fur Color: " + colorOfFur;
    }
}
