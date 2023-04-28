package src.uni.lessons.jswing;

import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.*;

public class SwingTextAndPasswordField extends JFrame implements ActionListener {
    private JLabel forUsername, forPassword, message;
    private JTextField username;
    private JPasswordField password;
    private JButton loginBtn;

    public SwingTextAndPasswordField(String title) {
        super(title);
    }

    public void createWindow() {
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        forUsername = new JLabel("Username");

        username = new JTextField(20);
        username.setToolTipText("enter username");

        forPassword = new JLabel("Password");

        password = new JPasswordField(20);
        password.setToolTipText("enter password");

        loginBtn = new JButton("Login");
        loginBtn.addActionListener(this);

        message = new JLabel();

        add(forUsername);
        add(username);
        add(forPassword);
        add(password);
        add(loginBtn);
        add(message);
    }

    public void actionPerformed(ActionEvent e) {
        String name = username.getText();
        String pass = new String(password.getPassword());

        if (name.equals("harshitrv.eth") && pass.equals("javaisbest"))
            message.setText("Logged in ✅");
        else
            message.setText("Unauthorized ❌");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingTextAndPasswordField("Text and Password Fields").createWindow();
            }
        });
    }
}
