// Program to demonstrate the action listeners in java.

package src.college.understanding_GUI;

import java.awt.*;
import java.awt.event.*;
public class ActionListenerEx1 extends Frame implements ActionListener{

    Label l1;
    TextField tf1;
    Button b1;

    ActionListenerEx1(String s){

        super(s);

        l1 = new Label("Type something");
        tf1 = new TextField(16);
        b1 = new Button("Print to terminal");

        b1.addActionListener(this);

        add(l1);add(tf1);add(b1);

        setLayout(new FlowLayout());
        setSize(300,100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        System.out.println(tf1.getText());
    }
    public static void main(String[] args) {
        ActionListenerEx1 f1 = new ActionListenerEx1("Action Listener");
    }
}
