package src.uni.assignments.lab.da_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Converter extends JFrame {
    private JLabel decimalLabel;
    private JLabel hexLabel;
    private JLabel binaryLabel;

    private JTextField decimalField;
    private JTextField hexField;
    private JTextField binaryField;

    public Converter(String title) {
        super(title);
    }

    public void createWindow() {
        setSize(400, 120);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2, 0, 0));

        decimalLabel = new JLabel("Decimel");
        hexLabel = new JLabel("Hex");
        binaryLabel = new JLabel("Binary");

        decimalField = new JTextField(12);
        hexField = new JTextField(12);
        binaryField = new JTextField(12);

        decimalField.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                try {
                    int decimal = Integer.parseInt(decimalField.getText());
                    hexField.setText(Integer.toHexString(decimal));
                    binaryField.setText(Integer.toBinaryString(decimal));
                } catch (NumberFormatException ex) {
                    hexField.setText("");
                    binaryField.setText("");
                }
            }
        });

        hexField.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                try {
                    int decimal = Integer.parseInt(hexField.getText(), 16);
                    decimalField.setText(Integer.toString(decimal));
                    binaryField.setText(Integer.toBinaryString(decimal));
                } catch (NumberFormatException ex) {
                    decimalField.setText("");
                    binaryField.setText("");
                }
            }
        });

        binaryField.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                try {
                    int decimal = Integer.parseInt(binaryField.getText(), 2);
                    hexField.setText(Integer.toHexString(decimal));
                    decimalField.setText(Integer.toString(decimal));
                } catch (NumberFormatException ex) {
                    decimalField.setText("");
                    hexField.setText("");
                }
            }
        });

        add(decimalLabel);
        add(decimalField);
        add(hexLabel);
        add(hexField);
        add(binaryLabel);
        add(binaryField);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Converter("Convert Numbers").createWindow();
            }
        });
    }
}