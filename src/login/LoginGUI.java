package login;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

/**
 * Log in GUI for Project Incognito.
 */
public class LoginGUI implements ActionListener {
    private static JLabel label;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton login;
    private static JLabel welcome;
    //private static JLabel failed;

    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);

        panel.setLayout(null);

        label = new JLabel("Username");
        label.setBounds(10,20,80,25);
        panel.add(label);

        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        login = new JButton("Login");
        login.setBounds(10,80,80,25);
        login.addActionListener(new LoginGUI());
        panel.add(login);

        welcome = new JLabel("");
        welcome.setBounds(10,110,300,25);
        panel.add(welcome);

        //failed = new JLabel("");
        //failed.setBounds(10,110,300,25);
        //panel.add(failed);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        char[] password = passwordText.getPassword();
        System.out.println(user + ", " + Arrays.toString(password));

        if(user.equals("user")) { // Will test Password later.
            welcome.setText("Welcome back!");
            //failed.setText("");
        }
        else {
            //failed.setText("Log in failed. Try again.");
            welcome.setText("Log in failed. Try again.");
        }
    }

}
