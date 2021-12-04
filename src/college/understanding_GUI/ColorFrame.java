//GUI program to change the background colors when you click on  buttons.
package src.college.understanding_GUI;
import java.awt.*;
import java.awt.event.*;

class ColorFrame extends Frame implements ActionListener{
    Button r,g,b,y;

    ColorFrame(){
        r=new Button("RED");
        g=new Button("GREEN");
        b=new Button("BLUE");
        y=new Button("YELLOW");

        setLayout(new FlowLayout());

        add(r);
        add(g);
        add(b);
        add(y);

        setSize(200,400);
        setVisible(true);

        r.addActionListener(this);
        g.addActionListener(this);
        b.addActionListener(this);
        y.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==r)
        setBackground(Color.red);
        if (e.getSource()==g)
        setBackground(Color.green);
        if (e.getSource()==b)
        setBackground(Color.blue);
        if (e.getSource()==y)
        setBackground(Color.yellow);
    }
    public static void main(String[] args) {
        ColorFrame c=new ColorFrame();
    }
}