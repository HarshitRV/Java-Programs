package src.learning.GUI_programs;

import java.awt.*;
import java.awt.event.*;

public class RevNumFrame extends Frame implements ActionListener{
    Label l1, l2, l3;
    TextField tf1, tf2;
    Button b1;

    RevNumFrame(String s){
        super(s);
    }

    void createWindow(){
        l1 = new Label("Enter a number: ");
        tf1 = new TextField(12);
        l2 = new Label("Result:");
        l3 = new Label("Let's see if it's Palindrome");
        tf2 = new TextField(12);

        b1 = new Button("Show Reverse !");

        b1.addActionListener(this);

        add(l1);add(tf1);add(l2);add(tf2);
        add(b1);add(l3);

        setLayout(new FlowLayout());
        setSize(300,240);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        String input = tf1.getText();
        String result = "";

        for(int i=input.length()-1;i>=0;i--){
            result += input.charAt(i);
        }

        System.out.println(result);

        tf2.setText(result);

        if(input.equals(result)){
            System.out.println("Palindrome");

            l3.setText("It's palindrome");
        }else{
            l3.setText(" Well! it's not ¯/_(ツ)_/¯ ");
        }

        tf1.setText("");
    }

    public static void main(String[] args) {
        RevNumFrame f1 = new RevNumFrame("Reverse Output");
        f1.createWindow();
    }
}