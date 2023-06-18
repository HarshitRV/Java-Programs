package src.uni.lessons.jswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MoveCircle extends JFrame {
    JButton left, right, up, down;
    private int CircleX;
    private int CircleY;

    private boolean isMouseInside;

    public MoveCircle(String title) {
        super(title);
        this.CircleX = 200;
        this.CircleY = 200;
    }

    public void init() {
        setVisible(true);
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        left = new JButton("LEFT");
        right = new JButton("RIGHT");
        up = new JButton("UP");
        down = new JButton("DOWN");

        add(left);
        add(right);
        add(up);
        add(down);

        left.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CircleX -= 100;
                repaint();
            }
        });
        right.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CircleX += 100;
                repaint();
            }
        });
        up.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CircleY -= 100;
                repaint();
            }
        });
        down.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CircleY += 100;
                repaint();
            }
        });

        this.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                isMouseInside = true;
                repaint();
            }

            public void mouseExited(MouseEvent e) {
                isMouseInside = false;
                repaint();
            }
        });

    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(isMouseInside ? Color.BLUE : Color.RED);
        g.fillOval(CircleX, CircleY, 150, 150);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MoveCircle("Move Circle").init();
            }
        });
    }
}
