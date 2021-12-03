package src.college.understanding_GUI;

import java.awt.*;
import java.awt.event.*;

public class Square extends Frame implements ActionListener{

    Label l1,l2;
    TextField tf1,tf2;
    Button b;

    Square(String s){

        super(s);

        l1 = new Label("Enter a number: ");
        tf1 = new TextField(10);
        l2 = new Label("Square: ");
        tf2 = new TextField(10);
        b = new Button("Show");

        b.addActionListener(this);

        add(l1);add(tf1);add(l2);add(tf2);add(b);

        setLayout(new FlowLayout());
        setSize(300,100);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        String s = tf1.getText();
        int n = Integer.parseInt(s);
        tf2.setText(""+(n*n));
    }

    public static void main(String[] args) {
        Square f = new Square("Action Listner");
    }
    
}