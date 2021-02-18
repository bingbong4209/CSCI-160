/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import GameEntities.Camel;
import GameEntities.Rider;
import static HelperClasses.DescriptionHelper.getStatus;
import HelperClasses.MenuHelper;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Calvin
 */
public class Game {

    //processRest Variables
    double goodRest = 8, badRest = 3;
    //processSearchForWater Variables
    double goodHydration = 8, badHydration = 3;
    //processSearchForFood Variables    
    double goodGathering = 3, badGathering = 1;
    //Energy Variables
    double hardWork = -6, regularWork = -4, lightWork = -2;
    //default parameter values
    double hungy = -2, thisty = -3, tired = -3;
    //the camel has higher hunger, energy, and thirst, so he needs a modifier for any changes
    double camelMod = 2.5;

    double difficulty;
    Camel camel;
    Rider rider;
    boolean camelCanTravel;
    boolean riderIsDead;
    boolean selectionFailed;
    int distanceTraveled, pursuerDistance, pursuerToRider = 50, currentDay;
    String[] timeOfDayArray = {"Morning", "Afternoon", "Evening", "Night"};
    String[] weatherArray = {"Sandstorm", "Raining", "Cloudy", "Warm", "Extremely Hot"};
    String[] locationArray = {"Oasis", "Ruins", "River Bank", "Desert Plains", "Desert Hills"};
    int weatherInt, locationInt, timeOfDayInt;
    String weather, location, timeOfDay;
    Random rand = new Random();
    Scanner scan = new Scanner(System.in);

    public Game(double difficulty, Camel camel, Rider rider) {
        this.difficulty = difficulty;
        this.camel = camel;
        this.rider = rider;
        weatherInt = rand.nextInt(weatherArray.length);
        locationInt = rand.nextInt(locationArray.length);
    }

    public double getDifficulty() {
        return difficulty;
    }

    private boolean checkCamelCanTravel() {
        if (camel.getThirst() < 5 || camel.getHunger() < 5 || camel.getEnergy() < 5) {
            camelCanTravel = false;
        } else {
            camelCanTravel = true;
            System.out.println(getStatus(camel));
        }
        return camelCanTravel;
    }

    private boolean checkRiderIsDead() {
        if (rider.getThirst() < 1 || rider.getHunger() < 1 || rider.getEnergy() < 1) {
            riderIsDead = true;
        } else {
            riderIsDead = false;
        }
        return riderIsDead;
    }

    private void getNewLocation() {
        if (selectionFailed == false) {
            locationInt = rand.nextInt(15);
            if (locationInt < 2) {
                location = "Oasis";
            } else if (locationInt < 4) {
                location = "Ruins";
            } else if (locationInt < 6) {
                location = "River Bank";
            } else if (locationInt < 12) {
                location = "Desert Plains";
            } else if (locationInt < 15) {
                location = "Desert Hills";
            }
        }
    }

    private void getNewWeather() {
        weatherInt = rand.nextInt(10);
        if (selectionFailed == false) {
            if (weatherInt < 1) {
                weather = "Sandstorm";
            } else if (weatherInt < 2) {
                weather = "Raining";
            } else if (weatherInt < 6) {
                weather = "Warm";
            } else if ((weatherInt < 10 && "Evening".equals(timeOfDay)) || (weatherInt < 10 && "Night".equals(timeOfDay))) {
                weather = "Warm";
            } else if ((weatherInt < 10 && "Afternoon".equals(timeOfDay)) || (weatherInt < 10 && "Morning".equals(timeOfDay))) {
                weather = "Extremely Hot";
            }
        }
    }

    private void getNewTimeOfDay() {

        if (null != timeOfDay && selectionFailed == false) {
            switch (timeOfDay) {
                case "Morning":
                    timeOfDay = "Afternoon";
                    break;
                case "Afternoon":
                    timeOfDay = "Evening";
                    break;
                case "Evening":
                    timeOfDay = "Night";
                    break;
                case "Night":
                    timeOfDay = "Morning";
                    currentDay += 1;
                    break;
                default:
                    break;
            }
        } else if (selectionFailed == true) {
            timeOfDay = timeOfDay;
        } else if (null == timeOfDay) {
            timeOfDay = "Morning";
        }

    }

    private String getPursuerDistanceDescription() {
        String outputDistance = "";

        if (selectionFailed == false) {
            if (pursuerToRider <= 7) {
                outputDistance = "The pursuers are within a day of you\n";
            } else if (pursuerToRider >= 7 && pursuerToRider <= 14) {
                outputDistance = "The pursuers are a day behind you\n";
            } else if (pursuerToRider > 14) {
                outputDistance = "The pursuers are more than a day behind you\n";
            }
        }
        return outputDistance;
    }

    private void processPursuers() {
        if (selectionFailed == false) {
            pursuerDistance = rand.nextInt(16 - 5 + 1) + 5;
            if ("Extremely Hot".equals(weather) || "Sandstorm".equals(weather)) {
                pursuerDistance -= 2;
            } else if ("Desert Plains".equals(location) || "Desert Hills".equals(weather)) {
                pursuerDistance -= 1;
            } else {
            }
            pursuerToRider -= pursuerDistance;
        }
    }

    public void processRest() {
        if ("Morning".equals(timeOfDay)) {
            System.out.println("You cannot sleep now, for it is too bright out.\n");
            selectionFailed = true;
        } else if ("Night".equals(timeOfDay) || rider.getEnergy() <= 5) {
            System.out.println("You decide to rest for the remainder of the night undisturbed.\n");
            rider.adjustEnergy(goodRest);
            camel.adjustEnergy(goodRest * 3);
            selectionFailed = false;
        } else if ("Sandstorm".equals(weather) || "Raining".equals(weather)) {
            System.out.println("You decide to rest for the remainder of the night. "
                    + "\nThe rain makes it harder to sleep, but you still get some water for yourself and " + camel.getName() + "\n");
            rider.adjustEnergy(badRest);
            camel.adjustThirst(badRest * camelMod);
            selectionFailed = false;
        } else if (rider.getHunger() <= 5) {
            System.out.println("You decide to rest for the remainder of the night. \n"
                    + "\nYour stomach grumbles as you try to fall asleep, hampering your beauty rest.\n");
            rider.adjustEnergy(badRest);
            rider.adjustHunger(hungy * difficulty);
            camel.adjustEnergy(badRest);
            selectionFailed = false;
        } else if (rider.getThirst() <= 5) {
            System.out.println("You decide to rest for the remainder of the night. \n"
                    + "\nYour stomach grumbles as you try to fall asleep, hampering your beauty rest.\n");
            rider.adjustEnergy(badRest);
            rider.adjustThirst(thisty * difficulty);
            camel.adjustEnergy(badRest);
            selectionFailed = false;
        } else if ("Afternoon".equals(timeOfDay) || "Evening".equals(timeOfDay)) {
            System.out.println("You take a nap to re-energize");
            selectionFailed = false;
            rider.adjustEnergy(goodRest);
            rider.adjustHunger(badGathering);
            camel.adjustEnergy(goodRest * camelMod);
        }
    }

    public void processFoodSearch() {

        if ("Sandstorm".equals(weather) || "Raining".equals(weather)) {
            System.out.println("Fighting the bad weather takes all your energy, but you manage to find some food\n");
            rider.adjustHunger(badGathering);
            camel.adjustHunger(badGathering * camelMod);
            rider.adjustEnergy(regularWork * difficulty);
            selectionFailed = false;
        } else if ("Morning".equals(timeOfDay) || "Afternoon".equals(timeOfDay) || "Ruins".equals(location) || "River Bank".equals(location) || "Oasis".equals(location)) {
            System.out.println("You find food in abundance and with relative ease. You should be good for some time now\n");
            rider.adjustHunger(goodGathering);
            camel.adjustHunger(goodGathering * 3);
            rider.adjustEnergy(lightWork * difficulty);
            selectionFailed = false;
        } else if ("Evening".equals(timeOfDay) || "Night".equals(timeOfDay) || "Desert Hills".equals(location) || "Desert Plains".equals(location)) {
            System.out.println("You struggle to scrounge up food, but manage to find some scraps left over by those who came before you\n");
            rider.adjustHunger(badGathering);
            camel.adjustHunger(badGathering * camelMod);
            rider.adjustEnergy(regularWork * difficulty);
            selectionFailed = false;
        } else if ("Extremely Hot".equals(weather)) {
            System.out.println("The hot weather takes nearly everything out of you as you search for food. You come back with barely enough food to cover the work you did to get it\n");
            rider.adjustHunger(badGathering);
            camel.adjustHunger(badGathering * 5);
            rider.adjustEnergy(hardWork * difficulty);
            selectionFailed = false;
        } else {
            System.out.println("You manage to find some food\n");
            rider.adjustHunger(goodGathering);
            camel.adjustHunger(goodGathering + 4);
            selectionFailed = false;
        }

    }

    public void processWaterSearch() {

        if ("River Bank".equals(location) || "Oasis".equals(location)) {
            System.out.println("You find an abundance of water all around you and have no problem rehydrating as does your camel\n");
            rider.adjustThirst(goodHydration);
            camel.adjustThirst(goodHydration * 4);
            rider.adjustEnergy(badRest + 1);
            camel.adjustEnergy(badRest + 3);
            selectionFailed = false;
        } else if ("Desert Hills".equals(location) || "Desert Plains".equals(location)) {
            System.out.println("You struggle to find water and have barely enough to top off your canteen. As for your camel, there is none left over :(\n");
            rider.adjustThirst(badHydration);
            camel.adjustThirst(badHydration * camelMod);
            rider.adjustEnergy(1);
            camel.adjustEnergy(1);
            selectionFailed = false;
        } else {
            System.out.println("You find some water");
            rider.adjustThirst(goodHydration - 2);
            camel.adjustThirst(goodHydration * camelMod);
            selectionFailed = false;
        }

    }

    public void processTravelCarefully() {

        if ("Sandstorm".equals(weather) || "Raining".equals(weather)) {
            System.out.println("You tread carefully and it pays off!\n");
            rider.adjustThirst(goodHydration);
            camel.adjustThirst(goodHydration * 4);
            rider.adjustEnergy(lightWork * difficulty);
            camel.adjustEnergy(hardWork * camelMod + difficulty);
            rider.adjustHunger(hungy);
            camel.adjustHunger(hungy * camelMod * difficulty);
            distanceTraveled += 15 / difficulty;
            selectionFailed = false;
        } else if (checkCamelCanTravel() == false) {
            System.out.println("Sorry buckaroo, but you can't travel until " + camel.getName() + " is feeling better :(");
            selectionFailed = true;
        } else {
            System.out.println("Your choice to tread carefully conserves energy, but may allow the pursuers to catch you\n");
            rider.adjustThirst(goodHydration);
            camel.adjustThirst(goodHydration * 4);
            rider.adjustEnergy(lightWork * difficulty);
            camel.adjustEnergy(hardWork * difficulty);
            rider.adjustHunger(hungy * difficulty);
            camel.adjustHunger(hungy * camelMod * difficulty);
            distanceTraveled += 8 - difficulty;
            selectionFailed = false;
        }
    }

    public void processTravelRegularly() {
        if (checkCamelCanTravel() == false) {
            System.out.println("Sorry buckaroo, but you can't travel until " + camel.getName() + " is feeling better :(");
            selectionFailed = true;
        } else {
            System.out.println("You travel regularly\n");
            rider.adjustThirst(thisty);
            camel.adjustThirst(thisty * 4);
            rider.adjustEnergy(tired);
            camel.adjustEnergy(tired * 3);
            rider.adjustHunger(hungy);
            camel.adjustHunger(hungy * camelMod);
            distanceTraveled += 15 / difficulty;
            selectionFailed = false;
        }
    }

    public void processRideAllOut() {

        if ("Sandstorm".equals(weather) || "Raining".equals(weather)) {
            System.out.println("You speed through the adverse weather, but at a cost to your energy, hunger, and thirst\n");
            rider.adjustThirst(thisty * difficulty);
            camel.adjustThirst(thisty * difficulty);
            rider.adjustEnergy(tired * 3);
            camel.adjustEnergy(tired * 4);
            rider.adjustHunger(hungy * 2);
            camel.adjustHunger(hungy * 4);
            distanceTraveled += 30 / difficulty;
            selectionFailed = false;
        } else if (checkCamelCanTravel() == false) {
            System.out.println("Sorry buckaroo, but you can't travel until " + camel.getName() + " is feeling better :(");
            selectionFailed = true;
        } else {
            System.out.println("You speed through the ride and gain some ground on those pesky pursuers\n");
            rider.adjustThirst(thisty * 2);
            camel.adjustThirst(thisty * 6);
            rider.adjustEnergy(tired * 2);
            camel.adjustEnergy(tired * 3);
            rider.adjustHunger(hungy);
            camel.adjustHunger(hungy * 3);
            distanceTraveled += 25 / difficulty;
            selectionFailed = false;
        }
    }

    public void outputTurnInformation() {
        System.out.println("Day: " + currentDay + "   Time: " + timeOfDay
                + "   Miles Traveled: " + distanceTraveled + " miles" + "\nLocation: "
                + location + "   Weather: " + weather + "   Rider Status: "
                + getStatus(rider) + "   Camel Status: "
                + getStatus(camel));

    }

    public void processTurn() {

        System.out.println(getPursuerDistanceDescription());

        int selected = MenuHelper.displayMenu("What shall you do today? \n1) Rest \n2) Search for Food"
                + "\n3) Search for Water \n4) Travel Carefully \n5) Travel Regularly"
                + "\n6) Ride Hard \nPlease enter a selection 1-6: ", 1, 6);

        switch (selected) {
            case 1:
                processRest();
                break;
            case 2:
                processFoodSearch();
                break;
            case 3:
                processWaterSearch();
                break;
            case 4:
                processTravelCarefully();
                break;
            case 5:
                processTravelRegularly();
                break;
            case 6:
                processRideAllOut();
                break;
            default:
                break;
        }

    }

    public void printGameStats() {
        if (distanceTraveled > 200) {
            System.out.println("It took you " + currentDay + " days to go " + distanceTraveled + " miles");
        } else {
            System.out.println("You made it " + currentDay + " days and " + distanceTraveled + " miles before you lost");
        }
    }

    /**
     * This is the start method, where everything is instantiated before the
     * game begins.
     */
    public void start() {
        while (distanceTraveled < 200 && pursuerToRider > 0 && checkRiderIsDead() == false) {
            //Advance to the next part of the day, new location and weather
            getNewTimeOfDay();
            getNewLocation();
            getNewWeather();

            //output all the turn info so the player can make the next decision
            outputTurnInformation();
            processPursuers();
            processTurn();
        }
        if (distanceTraveled > 200) {
            System.out.println("Well done soldier");
        } else if (pursuerToRider <= 0) {
            System.out.println("Those pesky pursuers caught up to you and took all your lunch money. Looks like you lost pal :/");
            printGameStats();
        } else if (checkRiderIsDead() == true) {
            System.out.println("You died.\nYou lose");
            printGameStats();
        }
    }

}
