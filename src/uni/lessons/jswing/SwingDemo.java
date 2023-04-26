package src.uni.lessons.jswing;

import javax.swing.*;

public class SwingDemo {
    public SwingDemo() {
        // creating thje JFrame object
        JFrame jf = new JFrame("My First Swing Program");

        // create compone JLabel to add on the JFrame
        JLabel jlabel = new JLabel("This is a label");
        // adding the JLabel component to the frame
        jf.add(jlabel);

        // setting frame configaration like size, visbility and on close operation
        jf.setSize(300, 200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        // running the swing demo on event dispatching thread
        // instead of the main thread, for more reference on this
        // read the book or the offical documentation, 
        // this is essentially done to avoid deadlock.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingDemo();
            }
        });
    }
}
