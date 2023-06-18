package src.uni.lessons.jswing.Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import src.uni.lessons.jswing.Calculator.utils.MathExpressionParser;
import src.college.understanding_GUI.Calculator;

public class SwingCalculator extends JFrame implements ActionListener {
    private JTextField input;

    private JButton[] buttons;

    private String[] buttonNames = { "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+" };

    private JButton clearButton;

    private MathExpressionParser parser;

    public SwingCalculator(String title) {
        super(title);
        parser = new MathExpressionParser();
        buttons = new JButton[16];
    }

    public void init() {
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(buttonNames[i]);
        }

        input = new JTextField();
        input.setEditable(false);

        JPanel panelForInput = new JPanel();
        panelForInput.setLayout(new BoxLayout(panelForInput, BoxLayout.X_AXIS));
        panelForInput.add(input);

        JPanel panelForButtons = new JPanel();
        panelForButtons.setLayout(new GridLayout(0, 4));

        for (int i = 0; i < buttons.length; i++) {
            panelForButtons.add(buttons[i]);
            buttons[i].addActionListener(this);
        }

        clearButton = new JButton("Clear");
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                input.setText("");
            }
        });

        JPanel panelForClearButton = new JPanel();
        panelForClearButton.setLayout(new GridLayout(1, 1));
        panelForClearButton.add(clearButton);

        add(panelForInput, BorderLayout.NORTH);
        add(panelForButtons, BorderLayout.CENTER);
        add(panelForClearButton, BorderLayout.SOUTH);

        setSize(270, 310);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttons[14]) {
            try {
                String expression = input.getText().strip();
                if (expression.length() == 0) {
                    return;
                }
                parser.setExpression(expression);
                double result = parser.evaluate();
                input.setText(String.valueOf(result));
            } catch (NumberFormatException n) {
                input.setText("Syntax ERROR");
            } catch (EmptyStackException es) {
                input.setText("Syntax ERROR");
            }
        }

        if (e.getSource() == buttons[13]) {
            input.setText(input.getText() + ".");
        }

        if (e.getSource() == buttons[3]) {
            input.setText(input.getText() + "/");
        }

        if (e.getSource() == buttons[7]) {
            input.setText(input.getText() + "*");
        }

        if (e.getSource() == buttons[11]) {
            input.setText(input.getText() + "-");
        }

        if (e.getSource() == buttons[15]) {
            input.setText(input.getText() + "+");
        }

        if (e.getSource() == buttons[2]) {
            input.setText(input.getText() + "9");
        }

        if (e.getSource() == buttons[1]) {
            input.setText(input.getText() + "8");
        }

        if (e.getSource() == buttons[0]) {
            input.setText(input.getText() + "7");
        }

        if (e.getSource() == buttons[6]) {
            input.setText(input.getText() + "6");
        }

        if (e.getSource() == buttons[5]) {
            input.setText(input.getText() + "5");
        }

        if (e.getSource() == buttons[4]) {
            input.setText(input.getText() + "4");
        }

        if (e.getSource() == buttons[10]) {
            input.setText(input.getText() + "3");
        }

        if (e.getSource() == buttons[9]) {
            input.setText(input.getText() + "2");
        }

        if (e.getSource() == buttons[8]) {
            input.setText(input.getText() + "1");
            new Calculator("Calculator").createWindow();
        }

        if (e.getSource() == buttons[12]) {
            input.setText(input.getText() + "0");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingCalculator("Calculator").init();
            }
        });
    }
}
