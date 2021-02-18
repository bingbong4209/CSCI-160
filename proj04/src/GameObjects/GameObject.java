/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameObjects;

import Interfaces.Drawable;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author Calvin
 */
public abstract class GameObject implements Drawable {

    int xPosition;
    int yPosition;
    Color color;
    boolean isColliding = false;

    public GameObject(int xPosition, int yPosition, Color color) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.color = color;
    }

    public abstract Rectangle getBounds();

    public int getXPosition() {
        return xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }

    public Color getColor() {
        return color;
    }

    public void setXPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public void setYPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public void setCoordinates(int xPosition, int yPosition) {
        this.xPosition += xPosition;
        this.yPosition += yPosition;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    //work on later
    public boolean isColliding(GameObject other) {
        return getBounds().intersects(other.getBounds());
    }

    //work on later
    @Override
    public void draw(Graphics g) {

    }
}
