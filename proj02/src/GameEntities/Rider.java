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
public class Rider {
    String name;
    double thirst;
    double value;
    double energy;
    double hunger;
    Random rand = new Random();
    
    public Rider(String name) {
        this.name = name;
        thirst = 15;
        hunger = 12;
        energy = 14;
    }
    
    public Rider(String name, int thirst, int hunger, int energy) {
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
