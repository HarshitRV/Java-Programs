package src.uni.lessons.jswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingEventDemo extends JFrame implements ActionListener {
    private JLabel jLabel;
    private JButton jButtonAlpha, jButtonBeta;

    public SwingEventDemo(String title) {
        super(title);
    }

    // user defined class to create frame
    public void createFrame() {
        // JFrame configurations
        setLayout(new FlowLayout());
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Adding components like labels and button to the frame
        jLabel = new JLabel("Press a button");
        jButtonAlpha = new JButton("Alpha");
        jButtonBeta = new JButton("Beta");

        // attaching event listener
        jButtonAlpha.addActionListener(this);
        jButtonBeta.addActionListener(this);

        // finally adding the components to the frame
        // Note: since layout is set to flow layout, components
        // appear in the order in which they are added.
        add(jLabel);
        add(jButtonAlpha);
        add(jButtonBeta);
    }

    // override the abstract method of the ActionListener interface
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jButtonAlpha) {
            jLabel.setText("Alpha was clicked");
        }
        if (e.getSource() == jButtonBeta) {
            jLabel.setText("Beta was clicked");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // creating SwingEventDemo object and calling createFrame method.
                new SwingEventDemo("Swing Event Demo").createFrame();
            }
        });
    }
}
