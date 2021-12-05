// Program #1 to demonstrate the flow layout in java awt.

package src.college.understanding_GUI;

import java.awt.*;
class FlowLayoutEx1 extends Frame{
    Label l1, l2;
    TextField tf1, tf2;
    Button b1;
    FlowLayoutEx1(String s){
        super(s);
    }

    void createWindow(){
        // declaring the elements
        l1 = new Label("Enter num1: ");
        l2 = new Label("Enter num2: ");
        tf1 = new TextField(12);
        tf2 = new TextField(12);
        b1 = new Button("Add");

        // adding the elements to the layout
        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(b1);

        // setting up the layout
        setLayout(new FlowLayout());
        setSize(200, 120);
        setVisible(true);
    }

    public static void main(String[] args) {
        FlowLayoutEx1 f1 = new FlowLayoutEx1("Flow Layout Example");
        f1.createWindow();
    }
}
