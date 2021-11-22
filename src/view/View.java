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

    public View(BlockingQueue<Message> queue) {
        this.queue = queue;
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(1000, 1000);
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

        welcome = new JLabel("Testing");
        panel.add(welcome);

        frame.setVisible(true);

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

    public void updateLoginInfo(String user, char[] pass) {
        this.welcome.setText("Welcome " + user + "!");
    }

}