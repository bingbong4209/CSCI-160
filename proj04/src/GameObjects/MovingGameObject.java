/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameObjects;

import Interfaces.Moveable;
import java.awt.Color;

/**
 *
 * @author Calvin
 */
public abstract class MovingGameObject extends GameObject implements Moveable{
    
    int xVelocity;
    int yVelocity;
    
    public MovingGameObject(int xPosition, int yPosition, int xVelocity, int yVelocity, Color color) {
        super(xPosition, yPosition, color);
        this.xVelocity = xVelocity;
        this.yVelocity = yVelocity;
        
    }
    
    public int getXVelocity() {
        return xVelocity;
    }
    
    public int getYVelocity() {
        return yVelocity;
    }
    
    public void setXVelocity(int xVelocity) {
        this.xVelocity = xVelocity;
    }
    
    public void setYVelocity(int yVelocity) {
        this.yVelocity = yVelocity;
    }
    
    public void setYPosition(int yPosition) {
        this.yPosition = yPosition;
    }
    
}
