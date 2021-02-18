/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author (Your Name Here)
 */
public class Animation extends JFrame {

    /*  For this portion of the assignment, you will be creating a simple animation 
        of a ball that moves around the screen of an applet and bounces off of the
        walls.
    
        As part of this assignment, you will need to have first completed the Ball class. 
    
        1) Create an instance of the Ball class and make sure it can draw itself
        2) Complete the detectCollisions method that determines when your Ball object
            has collided with any of the walls, in which case it should reverse direction.
        3) Create an instance of the Timer class and assign it an ActionListener that
            moves the ball around and repaints the screen every time it triggers its event
     */
    private Ball b1;

    public Animation() {
        // Set the size of the Window
        super.setSize(400, 400);

        // Terminate the Program when closing the Window
        super.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        // Create, configure, and start your Timer here
        b1 = new Ball(50, 50, 50, 10, 10, Color.BLUE);

        Timer t = new Timer(400, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                detectCollisions();

                update();
                repaint();
            }
        });
        t.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        b1.draw(g);
        detectCollisions();

    }

    public void update() {
        b1.move();
        detectCollisions();

    }

    public void detectCollisions() {
        if (b1.getXPosition() == getWidth()) {
            b1.setXVelocity(b1.getXVelocity() * -1);
        }
        if (b1.getYPosition() == getHeight()) {
            b1.setYVelocity(b1.getYVelocity() * -1);
        }
        if (b1.getXPosition() == 0) {
            b1.setXVelocity(b1.getXVelocity() * -1);
        }
        if (b1.getYPosition() == 0) {
            b1.setYVelocity(b1.getYVelocity() * -1);
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new Animation().setVisible(true));
    }
}
