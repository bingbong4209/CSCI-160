/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelperClasses;

import GameEntities.Camel;
import GameEntities.Rider;

/**
 *
 * @author Calvin
 */
public class DescriptionHelper {

    private DescriptionHelper() {

    }

    public static String getThirstDescription(Camel camel) {
        String thirstDescription;
        if (camel.getThirst() >= 40) {
            thirstDescription = "Not Thirsty";
        } else if (camel.getThirst() >= 30) {
            thirstDescription = "Slightly Parched";
        } else if (camel.getThirst() >= 20) {
            thirstDescription = "Thirsty";
        } else if (camel.getThirst() >= 10) {
            thirstDescription = "Dehydrated";
        } else if (camel.getThirst() >= 5) {
            thirstDescription = "Severely Dehydrated";
        } else if (camel.getThirst() >= 1) {
            thirstDescription = "Heat Exhausted";
        } else {
            thirstDescription = "Dead";
        }
        return thirstDescription;
    }

    public static String getThirstDescription(Rider rider) {
        String thirstDescription;
        if (rider.getThirst() >= 14) {
            thirstDescription = "Not Thirsty";
        } else if (rider.getThirst() >= 11) {
            thirstDescription = "Slightly Parched";
        } else if (rider.getThirst() >= 8) {
            thirstDescription = "Thirsty";
        } else if (rider.getThirst() >= 5) {
            thirstDescription = "Severely Dehydrated";
        } else if (rider.getThirst() >= 1) {
            thirstDescription = "Heat Exhausted";
        } else {
            thirstDescription = "Dead";
        }
        return thirstDescription;
    }

    public static String getHungerDescription(Camel camel) {
        String hungerDescription;
        if (camel.getHunger() >= 30) {
            hungerDescription = "Full";
        } else if (camel.getHunger() >= 20) {
            hungerDescription = "Slightly Hungry";
        } else if (camel.getHunger() >= 10) {
            hungerDescription = "Hungry";
        } else if (camel.getHunger() >= 5) {
            hungerDescription = "Starving";
        } else if (camel.getHunger() >= 1) {
            hungerDescription = "Dying of Starvation";
        } else {
            hungerDescription = "Dead";
        }
        return hungerDescription;
    }

    public static String getHungerDescription(Rider rider) {
        String hungerDescription;
        if (rider.getHunger() >= 11) {
            hungerDescription = "Full";
        } else if (rider.getHunger() >= 9) {
            hungerDescription = "Slightly Hungry";
        } else if (rider.getHunger() >= 6) {
            hungerDescription = "Hungry";
        } else if (rider.getHunger() >= 3) {
            hungerDescription = "Starving";
        } else if (rider.getHunger() >= 1) {
            hungerDescription = "Dying of Starvation";
        } else {
            hungerDescription = "Dead";
        }
        return hungerDescription;
    }

    public static String getEnergyDescription(Camel camel) {
        String energyDescription;
        if (camel.getEnergy() >= 20) {
            energyDescription = "Energetic";
        } else if (camel.getEnergy() >= 15) {
            energyDescription = "Slightly Winded";
        } else if (camel.getEnergy() >= 10) {
            energyDescription = "Out of Breath";
        } else if (camel.getEnergy() >= 5) {
            energyDescription = "Tired";
        } else if (camel.getEnergy() >= 1) {
            energyDescription = "Drained";
        } else {
            energyDescription = "Immobile";
        }
        return energyDescription;
    }

    public static String getEnergyDescription(Rider rider) {
        String energyDescription;
        if (rider.getEnergy() >= 12) {
            energyDescription = "Energetic";
        } else if (rider.getEnergy() >= 9) {
            energyDescription = "Slightly Winded";
        } else if (rider.getEnergy() >= 6) {
            energyDescription = "Out of Breath";
        } else if (rider.getEnergy() >= 3) {
            energyDescription = "Tired";
        } else if (rider.getEnergy() >= 1) {
            energyDescription = "Drained";
        } else {
            energyDescription = "Immobile";
        }
        return energyDescription;
    }
    //-----------------------------------------------------------------------------------------------------------Finished

    public static String getStatus(Camel camel) {
        return camel.getName() + " is " + getThirstDescription(camel) + ", " + getHungerDescription(camel) + ", and " + getEnergyDescription(camel);
    }

    public static String getStatus(Rider rider) {
        return rider.getName() + " is " + getThirstDescription(rider) + ", " + getHungerDescription(rider) + ", and " + getEnergyDescription(rider);
    }
}
