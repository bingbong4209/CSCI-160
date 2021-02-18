/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import ProvidedClasses.Animal;
import java.awt.Color;

/**
 *
 * @author Calvin
 */
public class Bird extends Animal {
    
    protected Color featherColor;
    
    public Bird() {
        featherColor = Color.CYAN;
    }
    
    public Bird(String name, int birthYear, Color featherColor) {
        super(name, birthYear);
        this.featherColor = featherColor;
    }
    
    public Color getFeatherColor() {
        return featherColor;
    }
    
    @Override
    public String toString() {
        return this.name + ", " + getBirthYear() + ", "+ featherColor;
    }
}
