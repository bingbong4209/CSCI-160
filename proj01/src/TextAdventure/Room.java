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
public class Room {
    
    String name, description;
    Creature creature;
    Item item;
    Exit exit1, exit2, exit3, exit4, secretExit, secretExit2;
    
    //Winner's Room
     public Room(String name, String description)
    {
        this.name = name;
        this.description = description;
    }
    
    //No creatures
    public Room(String name, String description, Item item, Exit exit1)
    {
        this.name = name;
        this.description = description;
        this.item = item;
        this.exit1 = exit1;
    }
    
    //1 exit, 1secret exit, no creatures
    public Room(String name, String description, Item item, Exit exit1, Exit secretExit)
    {
        this.name = name;
        this.description = description;
        this.item = item;
        this.exit1 = exit1;
        this.secretExit = secretExit;
    }
    
    //1 exit, no secret exit
    public Room(String name, String description, Item item, Creature creature, Exit exit1)
    {
        this.name = name;
        this.description = description;
        this.item = item;
        this.creature = creature;
        this.exit1 = exit1;
    }
    
    //1 exits, 1 secret exit
    public Room(String name, String description, Item item, Creature creature, Exit exit1, Exit secretExit)
    {
        this.name = name;
        this.description = description;
        this.item = item;
        this.creature = creature;
        this.exit1 = exit1;
        this.secretExit = secretExit;
    }
    
    //1 exit, 2 secret exits
    public Room(String name, String description, Item item, Creature creature, Exit exit1, Exit secretExit, Exit secretExit2)
    {
        this.name = name;
        this.description = description;
        this.item = item;
        this.creature = creature;
        this.exit1 = exit1;
        this.secretExit = secretExit;
        this.secretExit2 = secretExit2;        
    }
    
    
    //3 exits, 1 secret exit
    public Room(String name, String description, Item item, Creature creature, Exit exit1, Exit exit2, Exit exit3, Exit secretExit)
    {
        this.name = name;
        this.description = description;
        this.item = item;
        this.creature = creature;
        this.exit1 = exit1;
        this.exit2 = exit2;
        this.exit3 = exit3;
        this.secretExit = secretExit;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public Exit getExit1()
    {
        return exit1;
        
    }
    
    public Exit getExit2()
    {
        return exit2;
        
    }
    
    public Exit getExit3()
    {
        return exit3;
        
    }
    
    public Exit getExit4()
    {
        return exit4;
        
    }
    
    public Exit getSecretExit()
    {
        return secretExit;
    }
    
    public Exit getSecretExit2()
    {
        return secretExit2;
    }
    
    public Item getItem()
    {
        return item;
    }
    
    public Creature getCreature()
    {
        return creature;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    public void setExit1(Exit exit1)
    {
        this.exit1 = exit1;
    }
    
    public void setExit2(Exit exit2)
    {
        this.exit2 = exit2;
    }
     
    public void setExit3(Exit exit3)
    {
        this.exit3 = exit3;
    }
      
    public void setExit4(Exit exit4)
    {
        this.exit4 = exit4;
    }
       
    public void setSecretExit(Exit secretExit)
    {
        this.secretExit = secretExit;
    }
    
    public void setSecretExit2(Exit secretExit2)
    {
        this.secretExit2 = secretExit2;
    }
    
    public void setItem(Item item)
    {
        this.item = item;
    }
    
    public void setCreature(Creature creature)
    {
        this.creature = creature;
    }
}
