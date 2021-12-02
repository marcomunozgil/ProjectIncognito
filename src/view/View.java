package view;

import controller.Message;
import controller.LoginMessage;

import javax.swing.*;
import java.util.concurrent.BlockingQueue;

/**
 * Overall View class.
 */
public class View extends JFrame {
    BlockingQueue<Message> queue;
    JLabel label;
    JTextField userText;
    JLabel passwordLabel;
    JPasswordField passwordText;
    JButton loginButton;
    JLabel welcome;

    /**
     * Creates view and queue that stores messages
     *
     * @param queue queue that stores messages
     */
    public View(BlockingQueue<Message> queue) {
        this.queue = queue;

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(1100, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);

        panel.setLayout(null);

        label = new JLabel("Username");
        label.setBounds(10, 20, 80, 25);
        panel.add(label);

        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);

        welcome = new JLabel("Hello! Please enter your username and password.");
        welcome.setBounds(10,110,700,25);
        panel.add(welcome);

        loginButton.addActionListener(e -> {
            String user = userText.getText();
            char[] pass = passwordText.getPassword();
            try {
                queue.put(new LoginMessage(user, pass));
            } catch (InterruptedException exception) {
                //do nothing
            }
        });

    }

    public void updateLoginInfo(String value, char[] pass) {
        this.welcome.setText("Welcome " + value + "!"); //Changes the welcome message so that it reflects the username inputted.
    }

}
