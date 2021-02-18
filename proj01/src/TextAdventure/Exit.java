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
public class Exit {
    
    String name, description, transitionText;
    Room destination;
    boolean creatureBlocks;
    Item item;
    
    public Exit(String name, String description, String transitionText)
    {
        this.name = name;
        this.description = description;
        this.transitionText = transitionText;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public String getTransition()
    {
        return transitionText;
    }
    
    public Room getDestination()
    {
        return destination;
    }
    
    public Item getRequiredItem()
    {
        return item;
    }
    
    public boolean getCreatureBlocks()
    {
        return creatureBlocks;
    }
    
    public void setDestination(Room destination)
    {
        this.destination = destination;
    }
    
    public void setRequiredItem(Item item)
    {
        this.item = item;
    }
    
    public void setCreatureBlocks(boolean creatureBlocks)
    {
        this.creatureBlocks = creatureBlocks;
    }
}
