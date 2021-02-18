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
public class Creature {
    String name, description, defeatedText;
    Item itemToDestroy;
    
    public Creature(String name, String description, String defeatedText, Item itemToDestroy)
    {
        this.name = name;
        this.description = description;
        this.defeatedText = defeatedText;
        this.itemToDestroy = itemToDestroy;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public String getDefeatedText()
    {
        return defeatedText;
    }
    
    public Item getItemToDestroy()
    {
        return itemToDestroy;
    }
    
    public void setItemToDestroy(Item itemToDestroy)
    {
        this.itemToDestroy = itemToDestroy;
    }
}
