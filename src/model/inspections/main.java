/*Use this main to test your model.classes or other code
you added to start debugging or adding features
 */

package model.inspections;

import controller.Message;
import model.classes.Establishment;
import model.users.Inspector;
import model.users.User;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.BlockingQueue;

/**
 * this main is intended to be use only to test model.classes and simulate the behavior
 * of the program, but it is not the final main with the MVC coding pattern implemented
 */
public class main {
    private static JLabel label;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JTextField passwordText;
    private static JButton loginButton;
    private static JLabel welcome;

    private static JLabel label2;
    private static JLabel homeLabel;
    private static JLabel reportLabel;
    private static JButton addEstablishment;
    private static JLabel scoreLabel;
    private static JButton doInspection;

    private static JButton logout;

    public static void main(String[] args) {


        System.out.println();
        System.out.println();
        Inspector JohnDoe = new Inspector();
        User Karen = new User();
        System.out.println("A new user was made named: " + JohnDoe.getName() + ".");
        System.out.println("A new user was made named: " + Karen.getName() + ".");
        Establishment InNout = new Establishment();
        System.out.println("A new establishment was made named: " + InNout.getEstablishment() + ".");

        /**
         * user will do an inspection on an establishment not inspected yet
         * for debugging purposes
         */
        System.out.println("User Karen has begun inspection in the new establishment...");
        Karen.doInspection(InNout, Karen.getName());
        /**
         * user adds establishment to inspection queue
         */
        Karen.addEstablishment(InNout);
        System.out.println(Karen.getName() + " has added " + InNout.getEstablishment() +
                " to the list of establishments to be inspected.");

        /**
         * inspector conducts the inspection in the establishment added by user
         */
        System.out.println("Inspector John has begun an inspection in the new establishment...");
        JohnDoe.doInspection(InNout, JohnDoe.getName());
        System.out.println();
        System.out.println();
        System.out.println("End of the program...");

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(700, 400);
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

        passwordText = new JTextField(); //Text field to simplify the test. Password field would usually be used.
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);

        welcome = new JLabel("Hello! Please enter your username and password.");
        welcome.setBounds(10,110,700,25);
        panel.add(welcome);

        JPanel panel2 = new JPanel();
        JFrame frame2 = new JFrame();
        frame2.setSize(500, 300);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setVisible(true);
        frame2.add(panel2);

        panel2.setLayout(null);
        Font font = new Font("Helvetica", Font.BOLD, 25);

        label2 = new JLabel("        Welcome to your dashboard!");
        label2.setFont(font);
        label2.setBounds(10, 20, 500, 25);
        panel2.add(label2);

        /**homeLabel = new JLabel("Home");
         *homeLabel.setBounds(10, 50, 80, 25);
         *panel.add(homeLabel);
         */

        /**reportLabel = new JLabel("Reports");
         *reportLabel.setBounds(10, 80, 80, 25);
         *panel.add(reportLabel);
         */

        addEstablishment = new JButton("Add an Establishment");
        addEstablishment.setBounds(10, 100, 450, 25);
        panel2.add(addEstablishment);

        /** scoreLabel = new JLabel("Scores");
         *scoreLabel.setBounds(10, 140, 80, 25);
         *panel.add(scoreLabel);
         */

        doInspection = new JButton("Do an Inspection");
        doInspection.setBounds(10, 150, 450, 25);
        panel2.add(doInspection);

        logout = new JButton("Log Out");
        logout.setBounds(10,200,450,25);
        panel2.add(logout);

        frame2.setVisible(true);



    }
}
