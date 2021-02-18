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
public class BigDan {
    
    private String location;
    private int hoursWorking;
    private int numberOfDadJokes;
    
    public BigDan()
    {
        location = "home";
        hoursWorking = 40;
        numberOfDadJokes = 25; 
    }
    
    public BigDan(String location, int hoursWorking, int numberOfDadJokes)
    {
        this.location = location;
        this.hoursWorking = hoursWorking;
        this.numberOfDadJokes = numberOfDadJokes; 
    }
    
    public void setLocation(String location)
    {
        this.location = location;
    }
    
    public String getLocation()
    {
        return location;
    }
    
    public void setHoursWorking(int hoursWorking)
    {
        this.hoursWorking = hoursWorking;
    }
    
    public int getHoursWorking()
    {
        return hoursWorking;
    }
    
    public void setNumberOfDadJokes(int numberOfDadJokes)
    {
        this.numberOfDadJokes = numberOfDadJokes;
    }
    
    public int getNumberOfDadJokes()
    {
        return numberOfDadJokes;
    }
    
    @Override
    public String toString()
    {
        return "Big Dan is currently in " + location
        + " and is working " + hoursWorking +
        " hours per week and has " + numberOfDadJokes + " dad jokes in his arsenal";
    }
}

