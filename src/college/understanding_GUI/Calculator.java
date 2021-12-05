package src.college.understanding_GUI;

import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener{
    Label num1, num2, result;
    TextField forNum1, forNum2, forResult;
    Button add, sub, mul, div, clear;

    // construtor to give heading to the window
    Calculator(String s){
        super(s);
    }

    // function to create window
    void createWindow(){
        // creating Label object
        num1 = new Label("NUM-1");
        num2 = new Label("NUM-2");

        // creating TextFiedl object
        forNum1 = new TextField(12);
        forNum2 = new TextField(12);
        forResult = new TextField(12);

        // creating Button object
        add = new Button("+");
        sub = new Button("-");
        mul = new Button("*");
        div = new Button("/");
        clear = new Button("Clear");

        // adding Listenrs to the buttons
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        clear.addActionListener(this);

        // setting layout to null
        setLayout(null);

        // setting the coordinates for 
        // components on the window
        //              x   y  w    h  
        num1.setBounds(100,50, 60, 30);
        // num1.setBackground(Color.red);
        forNum1.setBounds(170, 50, 120, 30);

        num2.setBounds(100,100, 60, 30);
        // num2.setBackground(Color.red);
        forNum2.setBounds(170, 100, 120, 30);

        forResult.setBounds(100,140, 190, 30);
        forResult.setBackground(Color.blue);
        forResult.setForeground(Color.white);

        add.setBounds(100, 180, 30, 30);
        sub.setBounds(150, 180, 30, 30);
        mul.setBounds(205, 180, 30, 30);
        div.setBounds(260, 180, 30, 30);
        clear.setBounds(95, 230, 205, 35);
        // clear.setBackground(Color.yellow);

        // adding the components to the window
        add(num1);add(forNum1);
        add(num2);add(forNum2);
        add(forResult);
        add(add);add(sub);add(mul);add(div);
        add(clear);

        // setting up the UI
        setSize(400, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        double n1, n2;
        try {
            if(e.getSource() == add){

                n1 = Double.parseDouble(forNum1.getText());
                n2 = Double.parseDouble(forNum2.getText());
                forResult.setText((n1+n2)+"");

                forNum1.setText((n1+n2)+"");
                forNum2.setText("");
            }
            if(e.getSource() == sub){
                n1 = Double.parseDouble(forNum1.getText());
                n2 = Double.parseDouble(forNum2.getText());
                forResult.setText((n1-n2)+"");

                forNum1.setText((n1-n2)+"");
                forNum2.setText("");
            }
            if(e.getSource() == mul){
                n1 = Double.parseDouble(forNum1.getText());
                n2 = Double.parseDouble(forNum2.getText());
                forResult.setText((n1*n2)+"");

                forNum1.setText((n1*n2)+"");
                forNum2.setText("");
            }
            if(e.getSource() == div){
                n1 = Double.parseDouble(forNum1.getText());
                n2 = Double.parseDouble(forNum2.getText());
                forResult.setText((n1/n2)+"");

                forNum1.setText((n1/n2)+"");
                forNum2.setText("");
            }
            if(e.getSource() == clear){
                forNum1.setText("");
                forNum2.setText("");
                forResult.setText("");
            }
        }catch(NumberFormatException ex){
            forResult.setText("Number format exception");
            forNum1.setText("");
            forNum2.setText("");
        }
    }

    public static void main(String[] args) {
        Calculator c = new Calculator("Calculator");
        c.createWindow();
    }
}
