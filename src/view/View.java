package view;

import controller.Message;
import controller.LoginMessage;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.BlockingQueue;

/**
 * Overall View class.
 */
public class View extends JFrame {
    BlockingQueue<Message> queue;
    JLabel label;
    JTextField userText;
    JLabel passwordLabel;
    JTextField passwordText;
    JButton loginButton;
    JLabel welcome;

    /**
     * Creates view and queue that stores messages
     *
     * @param queue queue that stores messages
     */
    public View(BlockingQueue<Message> queue) {
        this.queue = queue;

        

        this.label = new JLabel("Username");
        this.label.setBounds(10, 20, 80, 25);
        this.add(label);

        this.userText = new JTextField(10);
        this.userText.setBounds(100, 20, 165, 25);
        this.add(userText);

        this.passwordLabel = new JLabel("Password");
        this.passwordLabel.setBounds(10, 50, 80, 25);
        this.add(passwordLabel);

        this.passwordText = new JTextField(10); //Text field to simplify the test. Password field would usually be used.
        this.passwordText.setBounds(100, 50, 165, 25);
        this.add(passwordText);

        this.loginButton = new JButton("Login");
        this.loginButton.setBounds(10, 80, 80, 25);
        this.add(loginButton);

        this.welcome = new JLabel("Hello! Please enter your username and password.");
        this.welcome.setBounds(10,110,700,25);
        this.add(welcome);

        loginButton.addActionListener(e -> {
            String user = userText.getText();
            String pass = passwordText.getText();
            try {
                Message msg = new LoginMessage(user, pass);
                queue.put(msg);
            } catch (InterruptedException exception) {
                //do nothing
            }
        });

        this.setSize(700, 400);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    /**
     * Method that is used to welcome the entered username.
     * @param value username
     * @param pass password
     */
    public void updateLoginInfo(String value, String pass) {
        //this.welcome.setText("Welcome " + value + "!"); //Changes the welcome message so that it reflects the username inputted.
        if (value.equals("karen") && pass.equals("password")) {
            welcome.setText("Welcome back " + value + "! The dashboard window will now open.");
            dashboard db = new dashboard();
            db.setVisible(true);
            this.setVisible(false);
        } else {
            welcome.setText("Invalid username or password. Please try again.");
        }
    }

}
