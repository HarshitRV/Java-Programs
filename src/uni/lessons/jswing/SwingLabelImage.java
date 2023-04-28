package src.uni.lessons.jswing;

import javax.swing.*;

public class SwingLabelImage extends JFrame {
    private JLabel jLabel;
    private ImageIcon imageIcon;

    public SwingLabelImage(String title) {
        super(title);
    }

    public void createWindow() {
        setSize(320, 250);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        imageIcon = new ImageIcon("/Users/harshitkrvishwakarma/Desktop/Java-Programs/src/resources/images/nodejs.png");
        jLabel = new JLabel("NodeJS", imageIcon, JLabel.CENTER);

        add(jLabel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingLabelImage("Label Icon with Text").createWindow();
            }
        });
    }
}