/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameObjects;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author Calvin
 */
public class Bullet extends MovingGameObject{

    int diameter;
    
    public Bullet(int xPosition, int yPosition, int diameter, Color color) {
        super(xPosition, yPosition, 0, 0, color);
        this.diameter = diameter;
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle(xPosition, yPosition, 10, 10);
    }
    
    //draw ship
    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(xPosition, yPosition, diameter, diameter);
    }
    
    public int getDiameter() {
        return diameter;
    }    
    
    @Override
    public void move() {
        yPosition += yVelocity;
    }
    
}
