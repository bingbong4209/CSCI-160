/*
 * To change this license header, choose License Headers in Project Properties
 * To change this template file, choose Tools | Templates
 * and open the template in the editor
 */
package Game;

import Controller.KeyboardController;
import GameObjects.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author
 */
public class GamePanel extends JPanel {

    // These are for handling the frame rate of the game and player controls
    // You should pass the controller to any objects you create that will
    //  be under keyboard control
    private Timer gameTimer;
    private KeyboardController controller = new KeyboardController();

    // Controls size of game window and framerate
    // You can adjust these if you want to use different values 
    private final int gameWidth = 800;
    private final int gameHeight = 720;
    private final int framesPerSecond = 60;
    private int counter = 0;
    private int score = 0;
    private int life = 3;
    private final Color backgroundColor = Color.BLACK;

    private final Color alien1Color = Color.BLUE;
    private final Color alien2Color = Color.RED;
    private final Color alien3Color = Color.CYAN;
    private final int alienXVelocity = 1;
    private final int alienYVelocity = 0;
    private final int shieldY = 540;
    private final Color shieldColor = Color.YELLOW;

    private boolean beamMoving = false;
    private boolean bulletMoving = false;

    Ship ship = new Ship(350, 715, Color.LIGHT_GRAY, controller);

    Shield leftShield = new Shield(50, shieldY, 50, 10, shieldColor);
    Shield leftMidShield = new Shield(200, shieldY, 50, 10, shieldColor);
    Shield midShield = new Shield(357, shieldY, 40, 10, shieldColor);
    Shield rightMidShield = new Shield(500, shieldY, 50, 10, shieldColor);
    Shield rightShield = new Shield(650, shieldY, 50, 10, shieldColor);

    //Far Left Row
    Alien down1Left2 = new Alien(1, 50, 100, alienXVelocity, alienYVelocity, alien1Color);
    Alien down2Left2 = new Alien(2, 125, 150, alienXVelocity, alienYVelocity, alien2Color);
    Alien down3Left2 = new Alien(3, 50, 200, alienXVelocity, alienYVelocity, alien3Color);
    Alien down4Left2 = new Alien(2, 125, 250, alienXVelocity, alienYVelocity, alien2Color);
    Alien down5Left2 = new Alien(1, 50, 300, alienXVelocity, alienYVelocity, alien1Color);
    //2nd Far Left Row
    Alien down1Left1 = new Alien(1, 200, 100, alienXVelocity, alienYVelocity, alien1Color);
    Alien down2Left1 = new Alien(2, 275, 150, alienXVelocity, alienYVelocity, alien2Color);
    Alien down3Left1 = new Alien(3, 200, 200, alienXVelocity, alienYVelocity, alien3Color);
    Alien down4Left1 = new Alien(2, 275, 250, alienXVelocity, alienYVelocity, alien2Color);
    Alien down5Left1 = new Alien(1, 200, 300, alienXVelocity, alienYVelocity, alien1Color);
    //Middle Row
    Alien down1 = new Alien(1, 350, 100, alienXVelocity, alienYVelocity, alien1Color);
    Alien down2 = new Alien(2, 425, 150, alienXVelocity, alienYVelocity, alien2Color);
    Alien down3 = new Alien(3, 350, 200, alienXVelocity, alienYVelocity, alien3Color);
    Alien down4 = new Alien(2, 425, 250, alienXVelocity, alienYVelocity, alien2Color);
    Alien down5 = new Alien(1, 350, 300, alienXVelocity, alienYVelocity, alien1Color);
    //2nd Far Right Row
    Alien down1Right1 = new Alien(1, 500, 100, alienXVelocity, alienYVelocity, alien1Color);
    Alien down2Right1 = new Alien(2, 575, 150, alienXVelocity, alienYVelocity, alien2Color);
    Alien down3Right1 = new Alien(3, 500, 200, alienXVelocity, alienYVelocity, alien3Color);
    Alien down4Right1 = new Alien(2, 575, 250, alienXVelocity, alienYVelocity, alien2Color);
    Alien down5Right1 = new Alien(1, 500, 300, alienXVelocity, alienYVelocity, alien1Color);
    //Far Right Row
    Alien down1Right2 = new Alien(1, 650, 100, alienXVelocity, alienYVelocity, alien1Color);
    Alien down2Right2 = new Alien(2, 725, 150, alienXVelocity, alienYVelocity, alien2Color);
    Alien down3Right2 = new Alien(3, 650, 200, alienXVelocity, alienYVelocity, alien3Color);
    Alien down4Right2 = new Alien(2, 725, 250, alienXVelocity, alienYVelocity, alien2Color);
    Alien down5Right2 = new Alien(1, 650, 300, alienXVelocity, alienYVelocity, alien1Color);

    Bullet bullet = new Bullet(300, 400, 10, Color.PINK);

    Beam beamLeft2 = new Beam(ship.getXPosition() - 10, ship.getYPosition() - 86, 0, 0, 3, 20, Color.GREEN);
    Beam beamLeft1 = new Beam(ship.getXPosition() + 5, ship.getYPosition() - 96, 0, 0, 3, 20, Color.GREEN);
    Beam beamRight1 = new Beam(ship.getXPosition() + 45, ship.getYPosition() - 96, 0, 0, 3, 20, Color.GREEN);
    Beam beamRight2 = new Beam(ship.getXPosition() + 60, ship.getYPosition() - 86, 0, 0, 3, 20, Color.GREEN);

    ArrayList<Alien> gamePieces = new ArrayList<>();

    /**
     * This method is called by the GameFrame class when starting the game for
     * the first time. It should be used like a constructor method where you
     * initialize all of the instance variables. You can also use this method to
     * reset a game after a player wins or loses and wants to play again.
     */
    public final void setupGame() {
        gamePieces.add(down1Left2);
        gamePieces.add(down2Left2);
        gamePieces.add(down3Left2);
        gamePieces.add(down4Left2);
        gamePieces.add(down5Left2);

        gamePieces.add(down1Left1);
        gamePieces.add(down2Left1);
        gamePieces.add(down3Left1);
        gamePieces.add(down4Left1);
        gamePieces.add(down5Left1);

        gamePieces.add(down1);
        gamePieces.add(down2);
        gamePieces.add(down3);
        gamePieces.add(down4);
        gamePieces.add(down5);

        gamePieces.add(down1Right1);
        gamePieces.add(down2Right1);
        gamePieces.add(down3Right1);
        gamePieces.add(down4Right1);
        gamePieces.add(down5Right1);

        gamePieces.add(down1Right2);
        gamePieces.add(down2Right2);
        gamePieces.add(down3Right2);
        gamePieces.add(down4Right2);
        gamePieces.add(down5Right2);

    }

    /**
     * This method is automatically called by the game timer every frame. As
     * typical, you should use it to draw all of your game objects.
     *
     * @param g The Graphics object used for drawing the GameObject instances.
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        leftShield.draw(g);
        leftMidShield.draw(g);
        midShield.draw(g);
        rightMidShield.draw(g);
        rightShield.draw(g);

        ship.draw(g);

        for (int i = 0; i < gamePieces.size(); i++) {
            gamePieces.get(i).draw(g);
        }

        beamLeft2.draw(g);
        bullet.draw(g);
        g.drawString("Score: " + score, 25, 25);
        g.drawString("Lives: " + life, 25, 50);
    }

    /**
     * This method is automatically called by the game timer every frame. Any of
     * your code for moving game objects or handling collisions, etc. should be
     * done by this method. The method has a single parameter which represents
     * the current frame number, which is incremented by the Timer each time
     * before the method is called. You can assume that it will always increase,
     * but it will eventually overflow if the game runs long enough (something
     * like 1 year)
     *
     * @param frameNumber The number of the current frame.
     */
    public void updateGameState(int frameNumber) {
        ship.move();
        if (ship.getXPosition() > gameWidth) {
            ship.setXPosition(-50);
        } else if (ship.getXPosition() + 50 < 0) {
            ship.setXPosition(780);
        }

        for (int i = 0; i < gamePieces.size(); i++) {
            gamePieces.get(i).move();

            if (gamePieces.get(i).getXPosition() > 730) {
                for (int j = 0; j < gamePieces.size(); j++) {
                    gamePieces.get(j).setXVelocity(-(gamePieces.get(j).getXVelocity()));
                    gamePieces.get(j).setYPosition((gamePieces.get(j).getYPosition() + 15));
                }
            }
            if (gamePieces.get(i).getXPosition() <= 0) {
                for (int j = 0; j < gamePieces.size(); j++) {
                    gamePieces.get(j).setXVelocity(-(gamePieces.get(j).getXVelocity()));
                    gamePieces.get(j).setYPosition((gamePieces.get(j).getYPosition() + 15));
                }
            }
        }

        if (beamMoving == false) {
            beamLeft2.setXPosition(ship.getXPosition() - 10);
            beamLeft2.setYPosition(ship.getYPosition() - 86);
        }

        if (controller.getSpaceKeyStatus()) {
            beamMoving = true;
        }

        if (beamMoving == true) {
            beamLeft2.setYVelocity(10);
            beamLeft2.move();
            if (beamLeft2.getYPosition() <= 0) {
                beamMoving = false;
            }

            for (int i = 0; i < gamePieces.size(); i++) {
                if (beamLeft2.isColliding(gamePieces.get(i))) {
                    beamMoving = false;
                    gamePieces.remove(i);
                    gamePieces.trimToSize();
                    score += 10;
                }
            }
        }
        if (bulletMoving == false) {
            bullet.setXPosition(down5.getXPosition());
            bullet.setYPosition(down5.getYPosition());
        }

        if (controller.getSpaceKeyStatus()) {
            bulletMoving = true;
        }

        if (bulletMoving) {
            bullet.setYVelocity(10);
            bullet.move();
            if (bullet.getYPosition() <= 0) {
                bulletMoving = false;
            }

            if (bullet.isColliding(ship)) {
                bulletMoving = false;
                life--;
            }
        }

    }

    /**
     * Constructor method for GamePanel class. It is not necessary for you to
     * modify this code at all
     */
    public GamePanel() {
        // Set the size of the Panel
        this.setSize(gameWidth, gameHeight);
        this.setPreferredSize(new Dimension(gameWidth, gameHeight));
        this.setBackground(backgroundColor);

        // Register KeyboardController as KeyListener
        //controller = new KeyboardController();
        this.addKeyListener(controller);

        // Call setupGame to initialize fields
        this.setupGame();

        this.setFocusable(true);
        this.requestFocusInWindow();
    }

    /**
     * Method to start the Timer that drives the animation for the game. It is
     * not necessary for you to modify this code unless you need to in order to
     * add some functionality.
     */
    public void start() {
        // Set up a new Timer to repeat based on the set framesPerSecond
        gameTimer = new Timer(1000 / framesPerSecond, new ActionListener() {

            // Tracks the number of frames that have been produced.
            // May be useful for limiting action rates
            private int frameNumber = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                // Update the game's state and repaint the screen
                updateGameState(frameNumber++);
                repaint();
            }
        });

        gameTimer.setRepeats(true);
        gameTimer.start();
    }
}
