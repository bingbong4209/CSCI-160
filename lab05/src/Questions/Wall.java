/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;
import javax.swing.JFrame;
import java.awt.*;
/**
 *
 * @author User
 */
public class Wall extends JFrame
{
    public Brick redBrick;
    public Brick orangeBrick;
    public Brick yellowBrick;
    public Brick greenBrick;
    public Brick blueBrick;
    public Brick cyanBrick;
    public Brick magentaBrick;
    public Brick lightGrayBrick;
    
        public static void main(String[] args) 
    {   
        // Creates and displays the Window when running this class
        EventQueue.invokeLater(() -> {new Wall().setVisible(true);});
    }   
        
    public Wall()
    {
        redBrick = new Brick(45,60,20,10,Color.RED);
        orangeBrick = new Brick(60,70,20,10,Color.ORANGE);
        yellowBrick = new Brick(75,60,20,10,Color.YELLOW);
        greenBrick = new Brick(90,70,20,10,Color.GREEN);
        blueBrick = new Brick(105,60,20,10,Color.BLUE);
        cyanBrick = new Brick(120,70,20,10,Color.CYAN);
        magentaBrick = new Brick(135,60,20,10,Color.MAGENTA);
        lightGrayBrick = new Brick(150,70,20,10,Color.LIGHT_GRAY);
        super.setSize(300,300);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        redBrick.draw(g);
        orangeBrick.draw(g);
        yellowBrick.draw(g);
        greenBrick.draw(g);
        blueBrick.draw(g);
        cyanBrick.draw(g);
        magentaBrick.draw(g);
        lightGrayBrick.draw(g);
    }
}
