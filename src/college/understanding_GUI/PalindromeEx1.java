package src.college.understanding_GUI;
import java.awt.*;
import java.awt.event.*;

class PalindromeEx1 extends Frame implements ActionListener {
    Label l;
    Label l1;
    TextField tf;
    TextField tf1;
    Button b;

    PalindromeEx1() {
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
        String str="";
        String input = tf.getText();
        for (int i = input.length()-1; i >= 0; i--) {
        str+= input.charAt(i);
        }
      
        if(input.equals(str)){
            tf1.setText("Palindrome");
        }
        else{
        tf1.setText("Not Palindrome");
        }

        }
        public static void main(String[] args) {
            PalindromeEx1 p = new PalindromeEx1();
        }
    }

