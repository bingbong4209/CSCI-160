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
public class MyLife {
    
    int numberOfAssignments;
    boolean isAlright;
    int friendCount;
    
    public MyLife()
    {
        numberOfAssignments = 10;
        isAlright = false;
        friendCount = 5;
    }
    
    public MyLife(int numberOfAssignments, boolean isAlright, int friendCount)
    {
        this.numberOfAssignments = numberOfAssignments;
        this.isAlright = isAlright;
        this.friendCount = friendCount;
    }
    
    public void setNumberOfAssignments(int numberOfAssignments)
    {
        this.numberOfAssignments = numberOfAssignments;
    }
    
    public int getNumberOfAssignments()
    {
        return numberOfAssignments;
    }
    
    public void setMentalState(boolean isAlright)
    {
        this.isAlright = isAlright;
    }
    
    public boolean getMentalState()
    {
        return isAlright;
    }
    
    public void setFriendCount(int friendCount)
    {
        this.friendCount = friendCount;
    }
    
    public int getFriendCount()
    {
        return friendCount;
    }
    
    @Override
    public String toString()
    {
        if(isAlright == true)
        {
            return "Calvin has " + numberOfAssignments + " assignments, " + friendCount + " friends, and is doing okay this week :)"; 
        } 
        else
        {
            return "Calvin has " + numberOfAssignments + " assignments, " + friendCount + " friends, and is not doing okay this week :("; 
        }
    }
}
