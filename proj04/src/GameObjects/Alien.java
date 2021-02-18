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
public class Alien extends MovingGameObject {

    int alienBounds = 2;
    int type;

    /**
     *
     * @param type A number between 1 and 3
     * @param xPosition
     * @param yPosition
     * @param xVelocity
     * @param yVelocity
     * @param color
     */
    public Alien(int type, int xPosition, int yPosition, int xVelocity, int yVelocity, Color color) {
        super(xPosition, yPosition, xVelocity, yVelocity, color);
        this.type = type;
    }

    @Override
    public void draw(Graphics g) {
        if (type == 1) {
            g.setColor(Color.YELLOW);
            g.fillRect(xPosition + 21, yPosition - 10, 3, 5);
            g.fillRect(xPosition + 15, yPosition - 5, 15, 10);
            //body
            g.fillRect(xPosition + 19, yPosition + 5, 7, 20);

            g.setColor(Color.RED);
            //eyes
            g.fillRect(xPosition + 15, yPosition - 5, 5, 5);
            g.fillRect(xPosition + 25, yPosition - 5, 5, 5);
            //stripes
            g.fillRect(xPosition + 19, yPosition + 10, 7, 5);
            g.fillRect(xPosition + 19, yPosition + 17, 7, 2);
            g.fillRect(xPosition + 19, yPosition + 21, 7, 3);

            g.setColor(color);
            //top left wing
            g.fillRect(xPosition + 4, yPosition - 15, 5, 10);
            g.fillRect(xPosition + 9, yPosition - 5, 5, 5);
            //top right wing
            g.fillRect(xPosition + 35, yPosition - 15, 5, 10);
            g.fillRect(xPosition + 30, yPosition - 5, 5, 5);
            //bottom left wing
            g.fillRect(xPosition + 10, yPosition + 5, 8, 8);
            g.fillRect(xPosition + 5, yPosition + 10, 8, 20);
            //bottom right wing
            g.fillRect(xPosition + 25, yPosition + 5, 8, 8);
            g.fillRect(xPosition + 30, yPosition + 10, 8, 20);
        } else if (type == 2) {
            //body
            g.setColor(Color.WHITE);
            g.fillRect(xPosition + 10, yPosition - 5, 25, 30);
            g.setColor(Color.BLUE);
            g.fillRect(xPosition + 15, yPosition + 10, 15, 5);
            g.fillRect(xPosition + 15, yPosition + 18, 15, 4);
            g.fillRect(xPosition + 15, yPosition + 25, 15, 5);
            g.fillRect(xPosition + 20, yPosition + 30, 5, 5);

            //eyes and antennae
            g.setColor(Color.RED);
            g.fillRect(xPosition + 15, yPosition - 5, 5, 5);
            g.fillRect(xPosition + 25, yPosition - 5, 5, 5);
            g.setColor(Color.BLUE);
            g.fillRect(xPosition + 15, yPosition - 10, 5, 5);
            g.fillRect(xPosition + 25, yPosition - 10, 5, 5);

            //left wing
            g.setColor(color);
            g.fillRect(xPosition, yPosition - 15, 5, 20);
            g.fillRect(xPosition, yPosition + 5, 15, 5);
            g.fillRect(xPosition + 10, yPosition + 10, 5, 15);
            g.fillRect(xPosition + 3, yPosition + 15, 7, 20);

            //right wing
            g.setColor(color);
            g.fillRect(xPosition + 40, yPosition - 15, 5, 20);
            g.fillRect(xPosition + 30, yPosition + 5, 15, 5);
            g.fillRect(xPosition + 30, yPosition + 10, 5, 15);
            g.fillRect(xPosition + 35, yPosition + 15, 7, 20);

        } else if (type == 3) {
            //body
            g.setColor(color);
            g.fillRect(xPosition + 15, yPosition - 5, 15, 20);
            //antennae
            g.fillRect(xPosition + 17, yPosition - 10, 3, 10);
            g.fillRect(xPosition + 25, yPosition - 10, 3, 10);
            //left ear
            g.fillRect(xPosition + 10, yPosition - 5, 5, 2);
            g.fillRect(xPosition + 13, yPosition - 5, 2, 5);
            //right ear
            g.fillRect(xPosition + 30, yPosition - 5, 5, 2);
            g.fillRect(xPosition + 30, yPosition - 5, 2, 5);
            //left wing
            g.fillRect(xPosition + 12, yPosition + 5, 3, 13);
            g.fillRect(xPosition + 8, yPosition + 8, 4, 13);
            g.fillRect(xPosition + 2, yPosition + 11, 6, 18);
            //right wing
            g.fillRect(xPosition + 30, yPosition + 5, 3, 13);
            g.fillRect(xPosition + 33, yPosition + 8, 4, 13);
            g.fillRect(xPosition + 37, yPosition + 11, 6, 18);
            //more body
            g.setColor(Color.YELLOW);
            g.fillRect(xPosition + 15, yPosition + 5, 15, 10);

            //eyes
            g.setColor(Color.RED);
            g.fillRect(xPosition + 15, yPosition - 5, 5, 5);
            g.fillRect(xPosition + 25, yPosition - 5, 5, 5);
            //legs
            g.fillRect(xPosition + 17, yPosition + 15, 3, 6);
            g.fillRect(xPosition + 25, yPosition + 15, 3, 6);
            //wing detail
            g.fillRect(xPosition + 4, yPosition + 13, 3, 5);
            g.fillRect(xPosition + 4, yPosition + 20, 3, 5);
            g.fillRect(xPosition + 38, yPosition + 13, 3, 5);
            g.fillRect(xPosition + 38, yPosition + 20, 3, 5);

        }
    }

    //work on later
    @Override
    public Rectangle getBounds() {
        return new Rectangle(xPosition, yPosition, 50, 50);
    }

    @Override
    public void move() {
        xPosition += xVelocity;
        yPosition += yVelocity;
    }
}
