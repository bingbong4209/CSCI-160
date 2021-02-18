/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import GameEntities.Camel;
import GameEntities.Rider;
import java.util.Scanner;
import HelperClasses.MenuHelper;

/**
 *
 * @author Calvin
 */
public class GameSetup {

    static Game game;
    static Camel camel;
    static Rider rider;

    private GameSetup() {

    }

    public static Rider setupRider() {
        int selected = MenuHelper.displayMenu("Please choose a name for your rider: \n1(jerome)\n2(harold)\n3(fernando)", 1, 3);
        String newName = "";
        if(selected == 1) {
            newName = "Jerome";
        } else if(selected == 2) {
            newName = "Harold";
        } else {
            newName = "Fernando";
        }
        rider = new Rider(newName);
        return rider;
    }

    public static Camel setupCamel() {
        int selected = MenuHelper.displayMenu("Please choose a name for your camel: \n1(billy)\n2(bob)\n3(joe)", 1, 3);
        String newName = "";
        if(selected == 1) {
            newName = "Billy";
        } else if(selected == 2) {
            newName = "Bob";
        } else {
            newName = "Joe";
        }
        camel = new Camel(newName);
        return camel;
    }

    public static Game setupGame() {
        int selected = MenuHelper.displayMenu("Please choose a difficulty for your escapade: \n1(Easy)\n2(Medium)\n3(Hard)", 1, 3);

        game = new Game(selected, camel, rider);
        return game;

    }

}
