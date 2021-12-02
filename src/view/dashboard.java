package view;

import javax.swing.*;
import java.awt.*;

public class dashboard extends JFrame{
    private static JLabel label;
    private static JLabel homeLabel;
    private static JLabel reportLabel;
    private static JButton addEstablishment;
    private static JLabel scoreLabel;
    private static JButton doInspection;

    private static JButton logout;
    //private static JLabel failed;

    public dashboard() {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);

        panel.setLayout(null);
        Font font = new Font("Helvetica", Font.BOLD, 25);

        label = new JLabel("        Welcome to your dashboard!");
        label.setFont(font);
        label.setBounds(10, 20, 500, 25);
        panel.add(label);

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
        panel.add(addEstablishment);

       /** scoreLabel = new JLabel("Scores");
        *scoreLabel.setBounds(10, 140, 80, 25);
        *panel.add(scoreLabel);
        */

        doInspection = new JButton("Do an Inspection");
        doInspection.setBounds(10, 150, 450, 25);
        panel.add(doInspection);

        logout = new JButton("Log Out");
        logout.setBounds(10,200,450,25);
        panel.add(logout);

        frame.setVisible(true);
    }
}