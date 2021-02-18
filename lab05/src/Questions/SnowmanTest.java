/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author User
 */
public class SnowmanTest extends JFrame {

    Snowman bigMan;

    public SnowmanTest() {
        super.setSize(500, 500);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        bigMan = new Snowman(250, 250);
        bigMan.draw(g, Color.BLACK, Color.ORANGE, Color.GRAY);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new SnowmanTest().setVisible(true);
        });
    }
}
