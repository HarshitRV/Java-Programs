package src.uni.lessons.jswing;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class RotateRect extends JFrame {
    int x;
    int y;

    JButton rotate;

    public RotateRect(String title) {
        super(title);
    }

    public void init() {
        setVisible(true);
        setSize(400, 500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        rotate = new JButton("Rotate");

        add(rotate);

        rotate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("clicked");
                x += 10;
                y += 10;
                repaint();
            }
        });
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawRect(x, y, 150, 150);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new RotateRect("Rotate Rect").init();
            }
        });
    }
}
