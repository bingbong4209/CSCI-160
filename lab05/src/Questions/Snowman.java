/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;
import java.awt.*;
/**
 *
 * @author User
 */
public class Snowman {
    
     int sX;
     int sY;
    
    public Snowman()
    {
        sX = 250;
        sY = 250;
    }
    
    public final void setCoordinates(int sX, int sY)
    {
        this.sX = sX;
        this.sY = sY;
    }
    
    public Snowman(int startX, int startY)
    {
        setCoordinates(startX, startY);
    }
    
    
    
    public void draw(Graphics g, Color body, Color hat, Color belly)
    {
        g.setColor(body);
        g.drawOval(sX, sY, 35, 35);
        g.drawOval(sX + 5, sY - 25, 25, 25);
        g.drawOval(sX + 10, sY - 40, 15, 15);
        g.setColor(hat);
        g.drawLine(sX + 5, sY - 41, sX + 30, sY - 41);
        g.drawRect(sX + (38/3), sY - 46, 10, 5);
        g.setColor(belly);
        
        Polygon bellyGon = new Polygon();        
            
            bellyGon.addPoint(sX + 13, sY + 25);
            bellyGon.addPoint(sX + 23, sY + 25);
            bellyGon.addPoint(sX + 28, sY + 20);
            bellyGon.addPoint(sX + 18, sY + 15);
            bellyGon.addPoint(sX + 8, sY + 20);        
            
        g.drawPolygon(bellyGon);
    }

}
