package src.college.understanding_GUI;
import java.awt.*;
public class MyFrame3 extends Frame {
    public static void main(String[] args) {
        MyFrame3 f1 = new MyFrame3("Button Example");
       Button b1 = new Button("Click Me");
        f1.add(b1,BorderLayout.CENTER);
        f1.setSize (200,300);
        f1.setVisible (true);
    
    }
    MyFrame3(String str){
    super(str);
    }
}


