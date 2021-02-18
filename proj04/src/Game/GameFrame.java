/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Calvin
 */
public class GameFrame extends JFrame
{
    private GamePanel game;
    
    public GameFrame()
    {
        // Add text to title bar 
        super("Galaga 2020");
        // Make sure the program exits when the close button is clicked
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        // Create an instance of the Game class and turn on double buffering
        //  to ensure smooth animation
        game = new GamePanel(); 
        game.setDoubleBuffered(true);
        
        // Add the Breakout instance to this frame's content pane to display it
        this.getContentPane().add(game);
        this.pack();
        this.getContentPane().setBackground(Color.BLACK);
        
        // Start the game
        game.start();  
    }
    
    public static void main(String[] args) 
    {
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameFrame().setVisible(true);
            }
        });
        
    }
}
