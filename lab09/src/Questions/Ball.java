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
public class Ball extends GameObject implements Moveable{

    private int diameter;
    private int xVelocity;
    private int yVelocity;

    public Ball(int xPosition, int yPosition, int diameter, Color color) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.diameter = diameter;
        xVelocity = 25;
        yVelocity = 25;
    }
    
    @Override
    public void draw(Graphics g) {
        g.fillOval(xPosition, yPosition, diameter, diameter);
    }
    
    @Override
    public Rectangle getBounds() {
        Rectangle rect = new Rectangle(xPosition, yPosition, diameter, diameter);
        return rect;
    }
    
    @Override
    public void move() {
        setXPosition(xVelocity);
        setYPosition(yVelocity);
    }
    
}
