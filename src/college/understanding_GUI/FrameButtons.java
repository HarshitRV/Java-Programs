package src.college.understanding_GUI;

import java.awt.*;

class MyFrame_3 extends Frame {
    public static void main(String[] args) {
        MyFrame_3 f1 = new MyFrame_3("Button Example");
        Button b1 = new Button("Click Me");
        f1.add(b1, BorderLayout.NORTH);
        f1.setSize(200, 300);
        f1.setVisible(true);

    }

    MyFrame_3(String str) {
        super(str);
    }
}
