package src.uni.lessons.jswing;

import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.*;

public class SwingTextField extends JFrame implements ActionListener {

    private JLabel jLabel;
    private JTextField jTextField;
    private JButton jButton;

    public SwingTextField(String title) {
        super(title);
    }

    public void createWindow() {
        setSize(200, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        jLabel = new JLabel("Enter text");
        jTextField = new JTextField(10);
        jButton = new JButton("Update Label");

        jButton.addActionListener(this);

        add(jLabel);
        add(jTextField);
        add(jButton);
    }

    public void actionPerformed(ActionEvent e) {
        String text = jTextField.getText();
        jLabel.setText(text);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingTextField("Textfield Demo").createWindow();
            }
        });
    }
}
