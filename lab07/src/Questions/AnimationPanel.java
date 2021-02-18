/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Calvin
 */
public class AnimationPanel extends JPanel {
    
    private Ball b1;
    private Ball b2;
    
    public AnimationPanel() {
        b1 = new Ball(50, 50, 50, 10, 10, Color.BLUE);
    }
    
    public void paint(Graphics g) {
        b1.draw(g);
    }
    
    public void update() {
        b1.move();
    }
    
}
