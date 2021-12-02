package view;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

/**
 * Log in GUI for Project Incognito. Not currently used (Code is in View.java for now)
 */
public class LoginGUI extends JFrame {
    private static JLabel label;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton login;
    private static JLabel welcome;

    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);

        panel.setLayout(null);

        label = new JLabel("Username:");
        label.setBounds(10,20,80,25);
        panel.add(label);

        userText = new JTextField(20);
        userText.setBounds(10,45,165,25);
        panel.add(userText);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10,90,80,25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(10,50,165,25);
        panel.add(passwordText);

        login = new JButton("Log In");
        login.setBounds(10,80,80,25);
        panel.add(login);

        welcome = new JLabel("");
        welcome.setBounds(10,110,300,25);
        panel.add(welcome);

        frame.setVisible(true);
    }

}
