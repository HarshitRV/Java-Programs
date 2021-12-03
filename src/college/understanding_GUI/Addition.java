

package src.college.understanding_GUI;

import java.awt.*;
import java.awt.event.*;

public class Addition extends Frame implements ActionListener{

    Label l1,l2,l3;
    TextField tf1,tf2,tf3;
    Button b;

    Addition(String s){

        super(s);

        l1 = new Label("Enter A");
        tf1 = new TextField(10);
        l2 = new Label("Enter B");
        tf2 = new TextField(10);
        l3 = new Label("Addition: ");
        tf3 = new TextField(10);
        b = new Button("Show");

        b.addActionListener(this);

        add(l1);add(tf1);add(l2);add(tf2);add(l3);add(tf3);add(b);

        setLayout(new FlowLayout());
        setSize(300,100);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        String a = tf1.getText();
        String b = tf2.getText();
        int n1 = Integer.parseInt(a);
        int n2 = Integer.parseInt(b);
        tf3.setText(""+(n1+n2));
    }

    public static void main(String[] args) {
        Addition f = new Addition("Action Listner");
    }
    
}
