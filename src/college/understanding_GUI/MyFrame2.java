package src.college.understanding_GUI;
import java.awt.*;
public class MyFrame2 extends Frame {
    public static void main(String[] args) {
        MyFrame2 f1 = new MyFrame2("Year 2022");
        f1.setBackground(Color.green);;
        f1.setSize(300,300); 
        f1.setVisible(true);   
    }
 MyFrame2(String str){
 super(str);
}
}
