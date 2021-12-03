// Program to demonstrate Java Event Handling with Java AWT components

package src.college.understanding_GUI;

import java.awt.*;
import java.awt.event.*;

class Frm extends Frame implements ActionListener{
    Label l;
    TextField tf;
    Button b;

    Frm(String s){

        super(s);

        l = new Label("Enter Name: ");
        tf = new TextField(10);
        b = new Button("Show");

        add(l); add(tf); add(b);

        b.addActionListener(this);

        setLayout(new FlowLayout());
        setSize(200,300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        String s = tf.getText();
        System.out.println(s);
    }

    public static void main(String[] args) {
        Frm f = new Frm("Action Listner");
    }

}