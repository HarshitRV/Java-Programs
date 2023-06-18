// add jdbc driver to path
// export CLASSPATH=/Users/harshitkrvishwakarma/Desktop/Java-Programs/bin/mysql-connector-java-8.0.27.jar:$CLASSPATH

package src.uni.fat.q3;

import javax.swing.*;
import java.awt.*;

class BookStore extends JFrame {
    JLabel label;
    JButton addToCart, removeFromCart, checkout;
    JList<String> bookList;
    String[] books = { "Java", "Operating System", "Soft Computing", "Cloud Computing" };

    public BookStore(String title) {
        super(title);
    }

    public void init() {
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(120, 200);

        label = new JLabel("Available Book");
        JPanel labelPanel = new JPanel();
        labelPanel.setLayout(new BoxLayout(labelPanel, BoxLayout.X_AXIS));
        labelPanel.add(label);

        bookList = new JList<String>(books);
        JPanel panelList = new JPanel();
        panelList = new JPanel();
        panelList.setLayout(new BoxLayout(panelList, BoxLayout.X_AXIS));
        panelList.add(bookList);

        addToCart = new JButton("Add");
        checkout = new JButton("Checkout");
        removeFromCart = new JButton("Remove");

        JPanel panelButtons = new JPanel();
        panelButtons.setLayout(new GridLayout(3, 1, 0, 0));
        panelButtons.add(addToCart);
        panelButtons.add(checkout);
        panelButtons.add(removeFromCart);

        add(labelPanel, BorderLayout.NORTH);
        add(panelList, BorderLayout.CENTER);
        add(panelButtons, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new BookStore("Book Store").init();
            }
        });
    }
}
