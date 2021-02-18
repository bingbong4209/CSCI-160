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
public class World {
    
    Room startingRoom;
    Room endingRoom;
    
    public World(Room startingRoom, Room endingRoom)
    {
        this.startingRoom = startingRoom;
        this.endingRoom = endingRoom;
    }
    
    public Room getStartingRoom()
    {
        return startingRoom;
    }
    
    public Room getEndingRoom()
    {
        return endingRoom;
    }
}
