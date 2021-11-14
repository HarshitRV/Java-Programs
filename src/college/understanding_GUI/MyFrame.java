/*
    Sample code to show on how to create
    window using java.awt.*  
*/
package src.college.understanding_GUI;
import java.awt.*;
class MyFrame {
    public static void main(String[] args) {

        // CREATING FRAME WINDOW DIRECTLY USING THE FRAME CLASS
        Frame f2 = new Frame("");
        f2.setBackground(Color.green);;
        f2.setSize(300,300); 
        f2.setVisible(true);

    }
}
// CREATING OWN FRAME CLASS BY INHERITING THE FRAME CLASS
class MyFrame_2 extends Frame {
    MyFrame_2(String str){
        super(str);
    }
    public static void main(String[] args) {
        // CREATING FRAME WINDOW USING MY OWN FRAME CLASS
        MyFrame_2 f1 = new MyFrame_2("Window using Frame_2");
        f1.setBackground(Color.yellow);
        f1.setSize(300,300);
        f1.setVisible(true);
    }
}
