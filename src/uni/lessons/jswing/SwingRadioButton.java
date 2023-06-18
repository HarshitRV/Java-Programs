package src.uni.lessons.jswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingRadioButton extends JFrame implements ActionListener {
    JRadioButton rBtn1, rBtn2, rBtn3;

    public SwingRadioButton() {
        super("Radio Button");
    }

    public void init() {
        setSize(300, 300);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        rBtn1 = new JRadioButton("1");
        rBtn2 = new JRadioButton("2");
        rBtn3 = new JRadioButton("3");
        
        rBtn1.addActionListener(this);
        rBtn2.addActionListener(this);
        rBtn3.addActionListener(this);

        ButtonGroup btnGrp = new ButtonGroup();
        btnGrp.add(rBtn1);
        btnGrp.add(rBtn2);
        btnGrp.add(rBtn3);

        add(rBtn1);
        add(rBtn2);
        add(rBtn3);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        System.out.println(e.getSource());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingRadioButton().init();
            }
        });
    }
}
