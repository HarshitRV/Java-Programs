// GUI Program to reverse a string.
package src.college.understanding_GUI;

import java.awt.*;
import java.awt.event.*;

class ReverseStringEx1 extends Frame implements ActionListener {
    Label l;
    Label l1;
    TextField tf;
    TextField tf1;
    Button b;

    ReverseStringEx1(String s) {
        super(s);
    }

    void createWindow() {
        l = new Label("enter number");
        tf = new TextField(12);
        l1 = new Label("output");
        tf1 = new TextField(12);
        b = new Button("SHOW");

        setLayout(new FlowLayout());

        add(l);
        add(tf);
        add(l1);
        add(tf1);
        add(b);

        setSize(200, 400);
        setVisible(true);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String str = "";
        char ch;
        String input = tf.getText();
        for (int i = 0; i < input.length(); i++) {
            ch = input.charAt(i);
            System.out.println(ch);
            str = ch + str;
            System.out.println(str);
        }
        System.out.println("H"+"E");
        System.out.print("E"+"H");
        tf1.setText(str);

    }

    public static void main(String[] args) {
        ReverseStringEx1 p = new ReverseStringEx1("Reverse String");
        p.createWindow();
    }
}
