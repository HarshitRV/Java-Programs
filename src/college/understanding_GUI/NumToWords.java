// GUI program to convert number 
// to words

package src.college.understanding_GUI;

import java.awt.*;
import java.awt.event.*;

class MyExceptions extends Exception {
    MyExceptions(String s) {
        super(s);
    }
}

class NumToWords extends Frame implements ActionListener {
    Label l1, l2;
    TextField tf1, tf2;
    Button b1;

    NumToWords(String s) {
        super(s);
    }

    void createWindow() {
        l1 = new Label("Enter a number: ");
        tf1 = new TextField(12);
        l2 = new Label("Result:");
        tf2 = new TextField(14);

        b1 = new Button("Show in Words");

        b1.addActionListener(this);

        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(b1);

        setLayout(new FlowLayout());
        setSize(400, 240);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            String input = tf1.getText();
            
            String result = "";

            for (int i = 0; i < input.length(); i++) {
                switch (input.charAt(i)) {
                    case '1':
                        result += "One ";
                        break;
                    case '2':
                        result += "Two ";
                        break;
                    case '3':
                        result += "Three ";
                        break;
                    case '4':
                        result += "Four ";
                        break;
                    case '5':
                        result += "Five ";
                        break;
                    case '6':
                        result += "Six ";
                        break;
                    case '7':
                        result += "Seven ";
                        break;
                    case '8':
                        result += "Eight ";
                        break;
                    case '9':
                        result += "Nine ";
                        break;
                    case '0':
                        result += "Zero ";
                        break;

                    default:
                        throw new MyExceptions("Not a number");
                }
            }

            tf2.setText(result);

        } catch (MyExceptions ex) {
            System.out.println(ex);
            
            tf2.setText("Not a number");
        }
    }

    public static void main(String[] args) {
        NumToWords f1 = new NumToWords("Number to Words");
        f1.createWindow();
    }
}
