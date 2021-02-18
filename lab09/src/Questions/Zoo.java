/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import ProvidedClasses.Animal;
import java.util.ArrayList;

/**
 *
 * @author Calvin
 */
public class Zoo {
    
    private ArrayList<Animal> zooAnimals = new ArrayList<>();
    public Zoo() {
    }
    
    public void addAnimal(Animal animal) {
        zooAnimals.add(animal);
    }
    
    public String listAnimals() {
        String listOfAnimals = "";
        
        for(Animal s: zooAnimals) {
            listOfAnimals += s + "\n";
        }

        return listOfAnimals;
    }
}
