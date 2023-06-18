package src.uni.lessons.jswing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class SwingComboBox extends JFrame {
    JComboBox<String> comboBox;

    public SwingComboBox(String title) {
        super(title);
    }

    public void init() {
        setSize(200, 200);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        comboBox = new JComboBox<>();
        comboBox.addItem("INSERT");
        comboBox.addItem("DELETE");
        comboBox.addItem("UPDATE");
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(comboBox.getSelectedIndex());
                int i = comboBox.getSelectedIndex();
                System.out.println(i);
            }
        });

        add(comboBox);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingComboBox("Combobox").init();
            }
        });
    }
}
