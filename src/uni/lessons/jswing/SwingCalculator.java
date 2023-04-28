package src.uni.lessons.jswing;

import javax.swing.*;
import java.awt.*;

public class SwingCalculator extends JFrame {
    private JTextField input;
    private JButton zero, one, two, three, four, five, six, seven, eight, nine, dot, equal, add, subtract, multiply,
            divide;

    public SwingCalculator(String title) {
        super(title);
    }

    public void createWindow() {
        input = new JTextField();
        input.setBounds(0, 0, 300, 30);

        zero = new JButton("0");
        //             x,  y,  h, w
        zero.setBounds(0, 35, 75, 30);

        one = new JButton("1");
        one.setBounds(65, 35, 75, 30);

        two = new JButton("2");
        three = new JButton("3");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");

        dot = new JButton(".");
        add = new JButton("+");
        subtract = new JButton("-");
        multiply = new JButton("*");
        divide = new JButton("/");

        add(input);
        add(zero);
        add(one);

        setLayout(null);
        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingCalculator("Calculator").createWindow();
            }
        });
    }
}
