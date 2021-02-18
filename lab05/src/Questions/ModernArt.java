package Questions;

import java.awt.Color;
import java.awt.*;
import javax.swing.JFrame;

/**
 *
 * @author (Your Name Here)
 */
public class ModernArt extends JFrame
{
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        
        g.drawRect(100, 50, 40, 100);
        g.setColor(Color.ORANGE);
        g.drawOval(200, 70, 80, 80);
        g.setColor(Color.CYAN);
        g.fillOval(100, 50, 40, 100);
        g.setColor(Color.RED);
            Polygon solidShape = new Polygon();
            solidShape.addPoint(599, 0);
            solidShape.addPoint(599, 25);
            solidShape.addPoint(568, 25);
            solidShape.addPoint(500, 15);
            solidShape.addPoint(460, 8);
            g.fillPolygon(solidShape);
        
            Polygon pentagon = new Polygon();
            pentagon.addPoint(0, 230);
            pentagon.addPoint(25, 200);
            pentagon.addPoint(50, 230);
            pentagon.addPoint(25, 260);
            g.drawPolygon(pentagon);
            
        g.drawLine(1, 599, 80, 599);
        g.drawLine(0, 0, 10, 10);
        g.drawLine(599, 599, 500, 10);
        g.drawString("Marching Band", 270, 270);
        g.drawString("Is not", 270, 285);
        g.drawString("A sport", 270, 300);
        
    }
    
    public ModernArt()
    {        
        // This controls the size of Window and Exiting the program when is closes
        super.setSize(600, 600);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) 
    {   
        // Creates and displays the Window when running this class
        EventQueue.invokeLater(() -> {new ModernArt().setVisible(true);});
    }   
}
    
