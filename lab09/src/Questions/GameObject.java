/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author Calvin
 */
public abstract class GameObject implements Drawable{
    protected int xPosition;
    protected int yPosition;
    protected Color gameObjectColor;
    
    public abstract void draw(Graphics g);
    
    public abstract Rectangle getBounds();
    
    public void setXPosition(int xPosition) {
        this.xPosition += xPosition;
    }
    
    public void setYPosition(int yPosition) {
        this.yPosition += yPosition;
    }
    
    public void setGameObjectColor(Color color) {
        color = gameObjectColor;
    }
    
    public int getXPosition() {
        return xPosition;
    }
    
    public int getYPosition() {
        return yPosition;
    }
    
    public Color getGameObjectColor() {
        return gameObjectColor;
    }
}
