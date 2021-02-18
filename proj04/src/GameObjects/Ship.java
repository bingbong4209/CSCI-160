/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameObjects;

import Controller.KeyboardController;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import GameObjects.Beam;

/**
 *
 * @author Calvin
 */
public class Ship extends ControlledGameObject {

    private int distance = 3;
    private final int width = 730;
    private final int height = 655;
    
    private boolean left2 = false;
    private boolean left1 = false;
    private boolean right1 = false;
    private boolean right2 = false;

    private int beamVelocity = 5;
    int counter = 0;

    public Ship(int xPosition, int yPosition, Color color, KeyboardController control) {
        super(xPosition, yPosition, color, control);
    }
        
    // This controls the size of Window and Exiting the program when is closes
    //draw ship
    @Override
    public void draw(Graphics g) {
        
        g.setColor(color);
        //top down
        g.fillRect(xPosition + 25, yPosition - 103, 4, 15);
        g.fillRect(xPosition + 23, yPosition - 92, 8, 30);
        g.fillRect(xPosition + 15, yPosition - 65, 25, 40);
        g.fillRect(xPosition + 5, yPosition - 50, 45, 15);
        g.fillRect(xPosition, yPosition - 40, 55, 10);//
        g.fillRect(xPosition - 10, yPosition - 30, 75, 5);
        g.fillRect(xPosition + 25, yPosition - 30, 4, 15);
        //legs
        g.fillRect(xPosition - 10, yPosition - 55, 5, 25);
        g.fillRect(xPosition + 5, yPosition - 65, 5, 25);
        g.fillRect(xPosition + 60, yPosition - 55, 5, 25);
        g.fillRect(xPosition + 45, yPosition - 65, 5, 25);

        //red parts
        g.setColor(Color.RED);
        //tips
        g.fillRect(xPosition - 10, yPosition - 65, 5, 10);
        g.fillRect(xPosition + 5, yPosition - 75, 5, 10);
        g.fillRect(xPosition + 45, yPosition - 75, 5, 10);
        g.fillRect(xPosition + 60, yPosition - 65, 5, 10);
        //middle piece
        g.fillRect(xPosition + 20, yPosition - 55, 5, 12);
        g.fillRect(xPosition + 25, yPosition - 60, 5, 12);
        g.fillRect(xPosition + 30, yPosition - 55, 5, 12);
        //thrusters
        g.fillRect(xPosition + 17, yPosition - 35, 5, 10);
        g.fillRect(xPosition + 10, yPosition - 30, 10, 10);
        g.fillRect(xPosition + 33, yPosition - 35, 5, 10);
        g.fillRect(xPosition + 35, yPosition - 30, 10, 10);

        /*
        if (control.getSpaceKeyStatus() && counter == 0) {
            beamLeft2.draw(g);
            counter++;
        } else if (control.getSpaceKeyStatus() == false && counter == 1) {
            beamLeft2.draw(g);
            counter++;
        } else if (control.getSpaceKeyStatus() && counter == 2) {
            beamLeft1.draw(g);
            counter++;
        } else if (control.getSpaceKeyStatus() == false && counter == 3) {
            beamLeft1.draw(g);
            counter++;
        } else if (control.getSpaceKeyStatus() && counter == 4) {
            beamRight1.draw(g);
            counter++;
        } else if (control.getSpaceKeyStatus() == false && counter == 5) {
            beamRight1.draw(g);
            counter++;
        } else if (control.getSpaceKeyStatus() && counter == 6) {
            beamRight2.draw(g);
            counter++;
        } else if (control.getSpaceKeyStatus() == false && counter == 7) {
            beamRight2.draw(g);
            counter = 0;
        }
        */
    }

    //work on later
    @Override
    public Rectangle getBounds() {
        return new Rectangle(xPosition, yPosition, 50, 50);
    }

    @Override
    public void move() {

        if (control.getLeftKeyStatus()) {
            xPosition -= distance;
        } else if (control.getRightKeyStatus()) {
            xPosition += distance;
        } else if (control.getUpKeyStatus()) {
            yPosition -= distance;
        } else if (control.getDownKeyStatus()) {
            yPosition += distance;
        }
/*
        if (this.getXPosition() >= width && control.getRightKeyStatus() || this.getXPosition() <= 15 && control.getLeftKeyStatus()) {
            distance = -1;
        } else if (this.getYPosition() <= height && control.getUpKeyStatus() || this.getYPosition() >= 730 && control.getDownKeyStatus()) {
            distance = -1;
        } else {
            distance = 3;
        }
*/
    }
}
