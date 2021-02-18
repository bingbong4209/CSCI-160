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
public class Beam extends MovingGameObject {
    
    int width;
    int height;

    public Beam(int xPosition, int yPosition, int xVelocity, int yVelocity, int width, int height, Color color) {
        super(xPosition, yPosition, xVelocity, yVelocity, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle(xPosition, yPosition, width, height);
    }
    
    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(xPosition, yPosition, width, height);
    }
    
    @Override
    public void move() {
        xPosition += xVelocity;
        yPosition -= yVelocity;
    }
    
}
