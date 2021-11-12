package src.college.GUI;

import java.awt.*;

// making a window by inheriting frame class
class MyApp extends Frame {
    MyApp(String s){
        super(s);
    }

    public static void main(String[] args) {
        MyApp app = new MyApp("New Window");
        app.setSize(300,300);
        app.setVisible(true);
        app.setBackground(Color.gray);
    }
}

// making window without inheriting the Frame class
class MyApp2 {
    public static void main(String[] args) {
        Frame app2 = new Frame("My App");
        app2.setSize(300,300);
        app2.setVisible(true);
        app2.setBackground(Color.yellow);
    }
}