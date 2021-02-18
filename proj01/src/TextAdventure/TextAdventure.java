/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextAdventure;

/**
 *
 * @author User
 */
public class TextAdventure {

    public static void main(String[] args) {
                        
        Item masterBall = new Item("Master Ball", "Poke Ball that can catch any Pokemon without fail.");
        Item maxRevive = new Item("Max Revive", "Fully revives a Pokemon.");
        Item fullRestore = new Item("Full Restore", "Fully restores a Pokemon's health and cures all status conditions on the Pokemon.");
        Item lavaCookie = new Item("Lava Cookie", "Burns a Pokemon who eats it.");
        Item flashlight = new Item("Flashlight", "Blinds anyone or anything that looks at the light.");
        Item waterBottle = new Item("Water Bottle", "douses target Pokemon with water");
        Item pokeFlute = new Item("Poke Flute", "Wakes up certain Pokemon when played, puts others to sleep.");
        Item spellTag = new Item("Spell Tag", "puts a curse on target Pokemon");
        Item everstone = new Item("Everstone", "Causes the target Pokemon to never evolve until it is taken away.");
        Item quickClaw = new Item("Quick Claw", "Gives the Pokemon holding it the first strike in battle.");
                
        Creature kyogre = new Creature("Kyogre", "A legendary whale, Kyogre is a force to be reckoned with", "You defeated Kyogre \nYou got $2500 for winning", pokeFlute);
        Creature groudon = new Creature("Groudon", "A legendary ground type, Groudon holds the red orb in Pokemon Ruby", "You defeated Groudon \nYou got $2500 for winning", quickClaw);
        Creature arceus = new Creature("Arceus", "Considered to be mythical, Arceus holds great power in the Pokemon world", "You defeated Arceus \nYou got $2500 for winning", flashlight);
        Creature mewtwo = new Creature("Mewtwo", "Created in a lab, Mewtwo is the ultimate lab rat", "You defeated Mewtwo \nYou got $2500 for winning", lavaCookie);
        Creature rayquaza = new Creature("Rayquaza", "This flying dragon created peace between Kyogre and Groudon", "You defeated Rayquaza \nYou got $2500 for winning", everstone);
        Creature machamp = new Creature("Machamp", "A four-armed beast, Machamp is a master of every martial art known to man.", "You defeated Machamp \nYou got $2500 for winning", waterBottle);
        Creature conkeldurr = new Creature("Conkeldurr", "An ogre with two concrete cylinders, Conkeldurr exudes immense strength through intimidation.", "You defeated Conkeldurr, \nYou got $2500 for winning", spellTag);
        
        Exit brunoToLance = new Exit("Door", "A simple wooden door, matching the dojo feel of the interior", "You exit through the door, feeling good about having one win under your belt.");
            Exit lanceToAaron = new Exit("Warp", "A small hole in the clouds that may be large enough to fit through", "You dive headfirst into the clouds, only to land in a patch of tall grass. \n"
                    + "You stand up and brush off the dust from your clothes. You may need to un warp.");
            Exit aaronToLance = new Exit("Un Warp", "It seems like the hole in the clouds is still there, just in case.", "Rewinding time, you shoot back up the hole and onto the platform.");
        Exit lanceToWill = new Exit("Double Doors", "Cloud Doors. They look as though you can pass directly through them.", "You push the doors open to find that they disappear as you touch them.");
        Exit willToKoga = new Exit("Curtain", "A red velvet curtain. Rips are visible from misuse but the distinct red still looks glamorous.", "You part the curtain to find a dark hallway with an elevator on the other side.");
        Exit kogaToSidney = new Exit("Elevator", "You have no clue where it is at it's pitch black in the hallway", "You find your way to the elevator, press the button to ascend, and enter the elevator. Soft piano music plays in the background as you continue upward and onward.");
        Exit sidneyToDrake = new Exit("Millenium Falcon", "The hull is damaged and internal parts float around it. The ship is in serious need of repairs.", "After reading the manual for the Falcon as a child, you memorized how to fix any issues it could ever have. \n"
                + "You fly it to the nearest planet, Hoth, to see if you can escape the Elite 10. You crash land at the base of Mt. Silver next to an old protected village.");
            Exit sidneyToMarshal = new Exit("Hubble", "A destroyed US telescope thing, there is no way it works.", "You read the manual for the Hubble telescope as a preschooler and helped NASA design it, which allows you to make lightning repairs to it. \n"
                    + "You decide to fly to Mustafar, hoping you can hide to escape the Elite 10. If you need to Un Hubble, just say the word.");
            Exit marshalToSidney = new Exit("Un Hubble", "The Hubble is still there waiting for you just in case.", "The Hubble takes you back, dumps you into space, into the elevator, and breaks.");
        Exit drakeToAaron = new Exit("Tunnel", "Seems to be a solid aluminum tunnel going almost straight down. Hopefully it doesn't collapse when you take it!!", "You slide feet first down the tunnel. After going down for what seems like an eternity, you exit the tunnel and fall on your face.");        
        Exit aaronToFlint = new Exit("Jeep", "The Jeep seems to be in working order", "You snatch the keys from the center console and speed off into the sunset. Mt. Silver sounds like a good place to go!");
        Exit flintToMarshal = new Exit("Lavaboard", "There are visible cracks, but it looks like it's been reinforced to surf lava.", "You decide to shred the gnar on this lavaboard. \n"
                + "You ride it down the mountain on top of piping hot lava as you do sick tricks like a pro. You swing into a sheltered town at the bottom of the volcano looking for Marshal, your next target.");
        Exit marshalToGrimsley = new Exit("Appa", "A flying bison. He is currently asleep, so it is best to leave him be.", "After your victory, you yell 'Appa, yip yip'. For some reason, this motivates the white creature to stand up and let you on its back. \n"
                + "You then proceed to ride into the night to search for the every-evasive Grimsley.");
        Exit grimsleyToWin = new Exit("Lose", "Looks real loser-ish", "You push your way through the loser doors like a loser. Chicken!!");
         Exit grimsleyToBruno = new Exit("Win", "Looks real winner-ish", "You push your way through the winner doors like a true winner. Great job, gamer.");
            Exit grimsleyToLance = new Exit("Left", " LOOKS LIKE A WINNER CHIEF!", "DUDE THAT WAS SO EASY I CAN'T BELIEVE YOU JUST DID THAT!");
            Exit grimsleyToKoga = new Exit("Right", "DIDN'T KNOW YOU WANTED TO LOSE SO BAD", "IMAGINE ACTUALLY TAKING THIS EXIT OH MAN!");
                        
        Room brunosRoom = new Room("Bruno", "You begin your journey with Bruno. \n"
                + "the walls are lined with bamboo plants, samurai swords, and trophies of his. \n"
                + "You assume this must be his dojo", waterBottle, machamp, brunoToLance);
        Room lancesRoom = new Room("Lance", "You step into Lance's Arena and notice the menacing dragon paintings lining all 4 walls. \n"
                + "Everywhere you step is padded by clouds, making it seem as though you are among them yourself. \n"
                + "It seems as though this room is vacant, but not for long. \n"
                + "What happens if you were to speedily warp through the clouds, you wonder.", everstone, lanceToWill, lanceToAaron);
        Room willsRoom = new Room("Will", "You enter Will's Stage. there is seating for an audience, a curtain, and a stage, as if a performance will be put on at some point. \n"
                + "The seats look worn by sunlight.", lavaCookie, mewtwo, willToKoga);
        Room kogasRoom = new Room("Koga", " As you walk down the hallway, the light at the end goes out, disorienting you. \n"
                + "You are left alone in the pitch black of the hallway, or so you thought. Koga seems to be playing tricks on you.", flashlight, arceus, kogaToSidney);
        Room sidneysRoom = new Room("Sidney", "You exit the elevator to find yourself in space. Sidney enjoys watching his contestants suffer, especially in the vacuum of space. \n"
                + "You begin to float away from the space elevator and into nothing. \n"
                + "There are remains of the US space telescope, millenium falcon, and computer floating around you.", spellTag, rayquaza, sidneyToDrake, sidneyToMarshal);
        Room drakesRoom = new Room("Drake", "As you enter Hoth, you are greeted by snow. Drake likes to keep his Pokemon cold, but your fingers are frozen after moments outside, leaving you wondering how anyone survives. \n"
                + "The planet looks vacant, assuming the rebel scum has been cleaned out. \n"
                + "There seems to be a tunnel off in the distance but you can't be sure.", quickClaw, drakeToAaron);       
        Room aaronsRoom = new Room("Aaron", "You look around and find you're in the African Veldt with nothing but burned vegetation as far as you can see and Aaron's Jeep. \n"
                + "It seems most of his bug-type Pokemon have been burned or are mising. Something rather massive must have done this.", pokeFlute, groudon, aaronToFlint, aaronToLance);        
        Room flintsRoom = new Room("Flint", "You arrive at the peak of Mt. Silver, where you find an volcano in front of you. Flint is no where to be found, which is unusual. \n"
                + "Nobody seems to be here, except for the modified surfboard lying next to the mouth. \n"
                + "It seems like the trip up here was a waste. Your Jeep is also out of gas.", fullRestore, flintToMarshal);       
        Room marshalsRoom = new Room("Marshal", "In the center of the town you find a dusty circular arena. old lines worn by sunlight and time are present, but barely. \n"
                + "You sense a challenger as you step into the arena.", maxRevive, conkeldurr, marshalToGrimsley, marshalToSidney);
        Room grimsleysRoom = new Room("Grimsley", "After long hours of traveling on Appa's back, you find the final destination platforms. Appa is exhausted and collapses onto the lowermost platform. \n"
                + "Towering to your left and right are 2 more platforms, and in front of you is an odd sphere of moving water with a faint outline of a creature.", masterBall, kyogre, grimsleyToWin, grimsleyToBruno, grimsleyToLance, grimsleyToKoga);       
        Room winnersRoom = new Room("Winner's Room", "On the other side of the loser doors, you see Heaven. Looks like you won, chief. This is for real!!");
        
        brunoToLance.setDestination(lancesRoom);
        lanceToWill.setDestination(willsRoom);
           lanceToAaron.setDestination(aaronsRoom);
           aaronToLance.setDestination(lancesRoom);
        willToKoga.setDestination(kogasRoom);
        kogaToSidney.setDestination(sidneysRoom);
        sidneyToDrake.setDestination(drakesRoom);
            sidneyToMarshal.setDestination(marshalsRoom);
            marshalToSidney.setDestination(sidneysRoom);
        drakeToAaron.setDestination(aaronsRoom);
        aaronToFlint.setDestination(flintsRoom); 
        flintToMarshal.setDestination(marshalsRoom);
        marshalToGrimsley.setDestination(grimsleysRoom);
        grimsleyToWin.setDestination(winnersRoom);
         grimsleyToBruno.setDestination(brunosRoom);
            grimsleyToLance.setDestination(lancesRoom);
            grimsleyToKoga.setDestination(kogasRoom);
            
        brunoToLance.setCreatureBlocks(true);
        willToKoga.setCreatureBlocks(true);
        kogaToSidney.setCreatureBlocks(true);
        sidneyToDrake.setCreatureBlocks(true);
        aaronToFlint.setCreatureBlocks(true);
        marshalToGrimsley.setCreatureBlocks(true);
        grimsleyToBruno.setCreatureBlocks(true);
        
        Player ash = new Player("Ash", "A fierce trainer from the Kanto region, Ash's flame burns bright to those around him");
        World kantoRegion = new World(brunosRoom, winnersRoom);
        Game calvin = new Game(kantoRegion, ash);
        calvin.setStartText("Welcome to the world of Pokemon, a world of endless opportunities. \n"
        + "You have been training for the past 18 years for the opportunity to fight the Elite 10, the 10 best Pokemon Trainers across all the regions. \n"
        + "Here are some ground rules to get you started on the right foot: \n"        
        + "1) You must defeat each member of the Elite 10 before advancing to the next one \n"
        + "2) Once you leave a room, you cannot go back to it. Do what you want with this information \n"
        + "3) Items will help you on your journey through the Elite 10 \n"
        + "4) Have fun!!");
        calvin.setVictoryText("Congratulations, you just defeated the Elite 10!! Your great accomplishment will seal your name in the history books!");
        calvin.start();
        
    }
}
