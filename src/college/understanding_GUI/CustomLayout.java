// Program to demonstrate the custom layout in java awt.
package src.college.understanding_GUI;

import java.awt.*;

public class CustomLayout extends Frame {
    Label l1, l2;
    TextField tf1, tf2;
    Button b1;

    CustomLayout (){
        l1=new Label("Enter num1: ");
        l2=new Label("Enter num2: ");
        tf1=new TextField(12);
        tf2=new TextField(12);
        b1=new Button("Add");

        setLayout(null);
        setSize(300, 200);
        setVisible(true);

        l1.setBounds(30, 30, 80, 30);
        tf1.setBounds(130,35, 100, 30 );

        l2.setBounds(30, 70, 80, 30);
        tf2.setBounds(130,75, 100, 30);

        b1.setBounds(115, 120, 70, 50);

        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(b1);
    }

    public static void main(String[] args) {
        CustomLayout cl = new CustomLayout();
    }
}
