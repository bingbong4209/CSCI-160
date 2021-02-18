/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

/**
 *
 * @author User
 */
public class Cat {
    private String name;
    private int numberOfMiceCaught;
    private boolean isSecretlyPlottingToKillYou;
    
    //Default Constructor
    public Cat() 
    {
        name = "Gerard";
        numberOfMiceCaught = 0;
        isSecretlyPlottingToKillYou = false;
        
    }
    
    //Secondary Constructor
    public Cat(String name, int numberOfMiceCaught, boolean isSecretlyPlottingToKillYou)
    {
        this.name = name;
        this.numberOfMiceCaught = numberOfMiceCaught;
        this.isSecretlyPlottingToKillYou = isSecretlyPlottingToKillYou;   
    }
    
    //Change the name of the cat
    public void setName(String name)
    {
        this.name = name;
    }
    
    //Get the name of the cat
    public String getName()
    {
        return name;
    }
    
    //Set the number of mice caught
    public void setNumberOfMiceCaught(int numberOfMiceCaught)
    {
        this.numberOfMiceCaught = numberOfMiceCaught;
    }
    
    //Get the number of mice caught
    public int getNumberOfMiceCaught()
    {
        return numberOfMiceCaught;
    }
    
    //Set the cat's desire to kill you
    public void setIsSecretlyPlottingToKillYou(boolean isSecretlyPlottingToKillYou)
    {
        this.isSecretlyPlottingToKillYou = isSecretlyPlottingToKillYou;
    }
    
    //Get the cat's desire to kill you
    public boolean getIsSecretlyPlottingToKillYou()
    {
        return isSecretlyPlottingToKillYou;
    }
    //Override toString to display outputs
    @Override
    public String toString() 
    {
       return name + "has caught " + numberOfMiceCaught + 
       " and is secretly plotting to kill you is " + isSecretlyPlottingToKillYou;
       
    }
          
    
}
