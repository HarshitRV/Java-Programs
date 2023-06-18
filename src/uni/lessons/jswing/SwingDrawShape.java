package src.uni.lessons.jswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingDrawShape extends JFrame {
    public SwingDrawShape(String title) {
        super(title);
    }

    public void paint(Graphics g) {
        // Draw lines
        g.drawLine(20, 40, 100, 90);
        g.drawLine(20, 90, 100, 40);

        // Draw Circles
        g.drawOval(20, 250, 50, 50);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                SwingDrawShape shape = new SwingDrawShape("Shaped");
                shape.setSize(new Dimension(300, 300));
                shape.setVisible(true);
            }
        });
    }
}
