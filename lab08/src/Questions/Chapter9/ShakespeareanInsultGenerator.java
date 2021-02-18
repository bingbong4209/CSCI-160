/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions.Chapter9;

import java.util.Random;

/**
 *
 * @author Calvin
 */
public class ShakespeareanInsultGenerator {

    public static String generateShakespeareanInsult() {

        //Declare all the insults up front
        String[][] insults = {{"bawdy", "craven", "dankish", "frothy", "lumpish", "pribbling", "surly", "villainous"},
        {"beef-witted", "clay-brained", "dizy-eyed", "flap-mouthed", "ill-nurtured", "motley-minded", "sheep-biting", "tickle-brained"},
        {"bugbear", "clotpole", "harpy", "lout", "miscreant", "molwarp", "puttock", "wagtail"}};

        Random rand = new Random();
        //intialize 3 random insult objects to take one insult from each row and concatenate them into one insult
        String randomInsult = insults[0][rand.nextInt(8)];
        String randomInsult2 = insults[1][rand.nextInt(8)];
        String randomInsult3 = insults[2][rand.nextInt(8)];
        
        return randomInsult + " " + randomInsult2 + " " + randomInsult3;
    }

}
