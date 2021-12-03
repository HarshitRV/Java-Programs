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

   ReverseStringEx1() {
        l = new Label("enter number");
        tf = new TextField(12);
        l1 = new Label("result");
        tf1 = new TextField(12);
        b = new Button("show reverse");

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
        char ch;
        String input = tf.getText();
        for (int i=0; i<input.length(); i++) {
       ch=input.charAt(i); 
      // System.out.println(ch);
       str=ch+str;
        }
    //    System.out.println(str);
      tf1.setText(str);
        
        }
        public static void main(String[] args) {
            ReverseStringEx1 p = new ReverseStringEx1();
        }
    }


