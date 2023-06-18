// add jdbc driver to path
// export CLASSPATH=/Users/harshitkrvishwakarma/Desktop/Java-Programs/bin/mysql-connector-java-8.0.27.jar:$CLASSPATH

package src.uni.lessons.jswing.swingAndJDBC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ListData extends JFrame implements ActionListener {
    JLabel label, status;
    JTextField textField;
    JButton button;
    JTextArea resultArea;

    public ListData(String title) {
        super(title);
    }

    public void init() {
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        label = new JLabel("ID");
        status = new JLabel("DB Not connected");
        textField = new JTextField(12);
        button = new JButton("Get Details");

        button.addActionListener(this);

        resultArea = new JTextArea();
        resultArea.setEditable(false);
        // resultArea.setRows(20);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

        panel.add(label);
        panel.add(textField);
        panel.add(button);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
        panel2.add(resultArea);

        JScrollPane scrollPane = new JScrollPane(resultArea);

        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        scrollPane.add(panel2);

        JPanel panel3 = new JPanel();
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));
        panel3.add(status);

        add(panel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(panel3, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e) {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/emp";
            String user = "root";
            String password = "";

            conn = DriverManager.getConnection(url, user, password);

            status.setText("DB Connected");

            // NORMAL STATEMENT
            // Statement st = conn.createStatement();
            // ResultSet rs = st.executeQuery("select * from empl");

            // PREPARED STATEMENT
            PreparedStatement psmt = conn.prepareStatement("select * from empl where id = ?");
            String id = textField.getText().trim();
            if (id.length() == 0) {
                resultArea.setText("ID Required");
                return;
            }

            psmt.setString(1, textField.getText().trim());

            ResultSet rs = psmt.executeQuery();

            String result = "";
            while (rs.next()) {
                result += rs.getInt("id") + " | " + rs.getString("name") + " | " + rs.getInt("salary") + "\n";
            }
            resultArea.setText(result);
        } catch (NullPointerException ex) {
            System.out.println("Couldn't connect to database");
        } catch (SQLException se) {
            System.out.println(se.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ListData("EMPLOYEE DETAILS").init();
            }
        });
    }
}
