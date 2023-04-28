package src.uni.lessons.jswing;

import javax.swing.*;

public class SwingOptionPane {
    public static void main(String[] args) {
        try {
            int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first num"));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second num"));
            JOptionPane.showMessageDialog(null, "Sum: " + (num1 + num2), "Result", JOptionPane.PLAIN_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Not a valid number", "Syntax Error", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
