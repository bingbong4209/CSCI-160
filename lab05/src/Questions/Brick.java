/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.awt.*;

/**
 *
 * @author User
 */
public class Brick {
    
    int xPosition, yPosition, width, height;
    Color color;
    
    public Brick(int xPosition, int yPosition, int width, int height, Color color)
    {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.width = width;
        this.height = height;
        this.color = color;
    }
    
    public void draw(Graphics g)
    {
       g.setColor(color);
       g.fillRect(xPosition, yPosition, width, height);
    }
    
    public int getXPosition()
    {
        return xPosition;
    }
    
    public int getYPosition()
    {
        return yPosition;
    }
    
    public int getWidth()
    {
        return width;
    }
    
    public int getHeight()
    {
        return height;
    }
    
    public Color getColor()
    {
        return color;
    }
    
    public void setXPosition(int xPosition)
    {
        this.xPosition = xPosition;
    }
    
    public void setYPosition(int yPosition)
    {
        this.yPosition = yPosition;
    }
    
    public void setWidth(int width)
    {
        this.width = width;
    }
    
    public void setHeight(int height)
    {
        this.height = height;
    }
    
    public void setColor(Color color)
    {
        this.color = color;
    }
}