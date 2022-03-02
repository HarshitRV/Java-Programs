//GUI program to change the background colors when you click on  buttons.
package src.college.understanding_GUI;

import java.awt.*;
import java.awt.event.*;

class ColorFrame extends Frame implements ActionListener {
    Button r, g, b, y;

    ColorFrame(String s) {
        super(s);
    }

    void createWindow() {
        r = new Button("RED");
        g = new Button("GREEN");
        b = new Button("BLUE");
        y = new Button("YELLOW");

        setLayout(new FlowLayout());

        add(r);
        add(g);
        add(b);
        add(y);

        setSize(200, 400);
        setVisible(true);

        r.addActionListener(this);
        g.addActionListener(this);
        b.addActionListener(this);
        y.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == r)
            setBackground(Color.red);
        if (e.getSource() == g)
            setBackground(Color.green);
        if (e.getSource() == b)
            setBackground(Color.blue);
        if (e.getSource() == y)
            setBackground(Color.yellow);
    }

    public static void main(String[] args) {
        ColorFrame c = new ColorFrame("Color Frame");
        c.createWindow();
    }
}

class Watch extends Frame implements ActionListener {

    Watch(String str){
        super(str);
    }

    Button red, blue, green, yellow;

    void createWindow(){
        red = new Button("RED");
        blue = new Button("BLUE");
        green = new Button("GREEN");
        yellow = new Button("YELLOW");

        red.addActionListener(this);
        blue.addActionListener(this);
        green.addActionListener(this);
        yellow.addActionListener(this);

        red.setForeground(Color.RED);
        blue.setForeground(Color.BLUE);
        green.setForeground(Color.GREEN);
        yellow.setForeground(Color.YELLOW);


        add(red); add(green); add(blue); add(yellow);

        setLayout(new FlowLayout());
        setSize(300, 400);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == red){
            setBackground(Color.RED);
        }
        if(e.getSource() == blue){
            setBackground(Color.BLUE);
        }
        if(e.getSource() == green){
            setBackground(Color.GREEN);
        }
        if(e.getSource() == yellow){
            setBackground(Color.YELLOW);
        }
    }

    public static void main(String[] args) {
        Watch w1 = new Watch("Wathes request");
        w1.createWindow();
    }
}