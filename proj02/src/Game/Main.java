/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import Game.Game;
import GameEntities.Camel;
import GameEntities.Rider;

/**
 *
 * @author Calvin
 */
public class Main {

    public static void main(String[] args) {
        
        System.out.println("Welcome to Cowboy Escapade, the journey to escape the pursuers in the desert!!\n"
                + "-Your goal is to reach 200 miles before the pursuers can catch you\n"
                + "-You will have a camel to transport you across the desert, and will have to watch your thirst, hunger, and energy levels\n"
                + "-Those dictate what you can and cannot do and will help you survive\n");
        Rider rider = GameSetup.setupRider();
        Camel camel = GameSetup.setupCamel();
        Game game = GameSetup.setupGame();
        
        System.out.println("Your rider's name is " + rider.getName() + ", your camel's name is " + camel.getName() + " and your difficulty is " + game.getDifficulty() + "\nAway you go!!\n");
        game.start();

    }
}
