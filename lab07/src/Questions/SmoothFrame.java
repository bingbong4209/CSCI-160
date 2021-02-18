/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author Calvin
 */
public class SmoothFrame extends JFrame{
    private AnimationPanel panel;
    
    public SmoothFrame() {
        super.setSize(400, 400);

        // Terminate the Program when closing the Window
        super.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        panel = new AnimationPanel();
        panel.setDoubleBuffered(true);
        this.add(panel);
        
        Timer t = new Timer(400, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            panel.update();
            repaint();
        }
    });
        t.start();
    }
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new SmoothFrame().setVisible(true));
    }
    }

