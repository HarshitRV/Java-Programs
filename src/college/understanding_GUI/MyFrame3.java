package src.college.understanding_GUI;
import java.awt.*;
public class MyFrame3 extends Frame {
    Button b1;

    MyFrame3(String str);
    super();
    b1 = new Button("Click Me");
    add(b1);
    set Size (200,300);
    set Visible (true);

}
public static void main(String[] args) {
    MyFrame3 f1 = new MyFrame3("Button Example");

}
}
