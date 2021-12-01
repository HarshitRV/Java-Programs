package src.learning.GUI_programs;

import java.awt.*;
import java.awt.event.*;
public class SimpleCalc extends Frame implements ActionListener{

    Label num1;
    Label num2;
    Label result;
    TextField tf1;
    TextField tf2;
    Button sum;

    SimpleCalc(String s){
        super(s);
    }

    void createCalc(){
        num1 = new Label("Enter num1: ");
        tf1 = new TextField(16);
        num2 = new Label("Enter num2: ");
        tf2 = new TextField(16);
        result = new Label("Result will be here");
        sum = new Button("Sum"); 

        sum.addActionListener(this);
        
        add(num1);add(tf1);add(num2);
        add(tf2);add(result);add(sum);

        setLayout(new FlowLayout());
        setSize(190, 210);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        int n1 = Integer.parseInt(tf1.getText());
        int n2 = Integer.parseInt(tf2.getText());

        result.setText(""+(n1+n2));
        tf1.setText("");
        tf2.setText("");
        System.out.print(n1+n2);
    }

    public static void main(String[] args) {
        SimpleCalc Calculator = new SimpleCalc("Simple Calculator");
        Calculator.createCalc();
    }
}   
