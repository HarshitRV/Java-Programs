package src.uni.lessons.jswing;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class SwingCheckbox extends JFrame implements ItemListener {
    private JCheckBox checkbox1;
    private JCheckBox checkBox2;

    private JLabel label1;
    private JLabel label2;

    private JTextField textField1;
    private JTextField textField2;

    private JButton button1;
    private JButton button2;
    private JButton button3;

    public SwingCheckbox(String title) {
        super(title);
    }

    public void createWindow() {
        checkbox1 = new JCheckBox("Snap to Grid");
        checkBox2 = new JCheckBox("Show Grid");

        checkbox1.addItemListener(this);
        checkBox2.addItemListener(this);

        label1 = new JLabel("X:");
        label2 = new JLabel("Y:");

        textField1 = new JTextField(3);
        textField2 = new JTextField(3);

        button1 = new JButton("Ok");
        button2 = new JButton("Cancel");
        button3 = new JButton("Help");

        add(checkbox1);
        add(checkBox2);
        add(label1);
        add(label2);
        add(textField1);
        add(textField2);
        add(button1);
        add(button2);
        add(button3);

        setLayout(null);
        checkbox1.setBounds(50, 0, 300, 50);
        checkBox2.setBounds(50, 20, 300, 50);

        label1.setBounds(250, 0, 300, 50);
        label2.setBounds(250, 20, 300, 50);

        textField1.setBounds(270, 10, 100, 25);
        textField2.setBounds(270, 35, 100, 25);

        button1.setBounds(420, 0, 100, 30);
        button2.setBounds(420, 35, 100, 30);
        button3.setBounds(420, 65, 100, 30);

        setSize(550, 150);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void itemStateChanged(ItemEvent i) {
        System.out.println(checkbox1.isSelected());
        System.out.println(checkBox2.isSelected());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingCheckbox("Align").createWindow();
            }
        });
    }
}
