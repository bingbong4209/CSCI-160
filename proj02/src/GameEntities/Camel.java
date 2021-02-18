/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameEntities;

import java.util.Random;

/**
 *
 * @author Calvin
 */
public class Camel {
    String name;
    double hunger;
    double value;
    double energy;
    double thirst;
    Random rand = new Random();
    
    public Camel(String name) {
        this.name = name;
        hunger = 35;
        thirst = 50;
        energy = 25;
    }
    
    public Camel(String name, double thirst, double hunger, double energy) {
        this.name = name;
        this.thirst = thirst;
        this.hunger = hunger;
        this.energy = energy;
    }
    
    public double getThirst() {
        return thirst;
    }
    
    public void adjustThirst(double value) {
        thirst += value;
    }
    
    public double getEnergy() {
        return energy;
    }
    
    public void adjustEnergy(double value) {
        energy += value;
    }
    
    public double getHunger() {
        return hunger;
    }
    
    public void adjustHunger(double value){
        hunger += value;
    }
    
    public String getName() {
        return name;
    }
}
