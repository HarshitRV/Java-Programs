package src.uni.lessons.jswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CirclePanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(200, 200, 50, 50);
    }
}

class Circle extends JFrame {
    Circle() {
        super("Draw a circle");
    }

    void init() {
        CirclePanel cp = new CirclePanel();
        JLabel label = new JLabel();

        getContentPane().add(cp);
        getContentPane().add(label);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Circle().init();
            }
        });
    }
}

class MouseOnCircle extends JFrame implements MouseMotionListener {

    private int circleCenterX = 100;
    private int circleCenterY = 90;
    private int circleRadius = 50;
    private JLabel label;

    public MouseOnCircle() {
        super("Circle Drawing Program");
        setSize(400, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addMouseMotionListener(this);
    }

    public void paint(Graphics g) {
        // Draw the circle
        g.drawOval(circleCenterX - circleRadius, circleCenterY - circleRadius, circleRadius * 2, circleRadius * 2);
    }

    public void mouseMoved(MouseEvent e) {
        int mouseX = e.getX();
        int mouseY = e.getY();

        // Calculate the distance between mouse point and circle center
        double distance = Math.sqrt(Math.pow(mouseX - circleCenterX, 2) + Math.pow(mouseY - circleCenterY, 2));

        // Check if the distance is less than the circle radius
        if (distance <= circleRadius) {
            System.out.println("Mouse point is inside the circle at (" + mouseX + ", " + mouseY + ")");
            JOptionPane.showMessageDialog(null, "on circle", "is on circle?", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void mouseDragged(MouseEvent e) {
        // Do nothing
    }

    public static void main(String[] args) {
        new MouseOnCircle();
    }
}