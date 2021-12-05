package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * This is the dashboard view class. It's essentially the GUI, this is the what the
 * user will see in the screen. It does not
 */
public class dashboard extends JFrame{
    private static JLabel label;
    private static JButton addEstablishment;
    private static JButton doInspection;
    private static JButton logout;

    /**
     * This constructor sets up the dashboard view class and adds the components of
     * the GUI.
     */
    public dashboard() {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(500, 300);
        panel.setBackground(Color.CYAN);
        frame.setTitle("Food Safety Inspections by Incognito Team");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);
        panel.setLayout(null);
        Font font = new Font("Helvetica", Font.BOLD, 25);
        /**
        * This is just a label at the top of the dashboard.
        */
        label = new JLabel("        Welcome to your dashboard!");
        label.setFont(font);
        label.setBounds(10, 20, 500, 25);
        panel.add(label);

         /**
         * The next components are the three buttons in the dashboard. The first one is the
         * add establishment button. The second one is the do inspection button, and the last
         * one is the log out button.
         */
        addEstablishment = new JButton("Add an Establishment");
        addEstablishment.setBounds(10, 100, 450, 25);
        panel.add(addEstablishment);

        doInspection = new JButton("Do an Inspection");
        doInspection.setBounds(10, 150, 450, 25);
        panel.add(doInspection);

        logout = new JButton("Log Out");
        logout.setBounds(10,200,450,25);
        panel.add(logout);

        frame.setVisible(true);
    }

    /**
     * The next three functions execute the method in the body when the button is pressed.
     * They all have one parameter which is the listener for the respective button.
     * @param listenforaddestablishmentbutton listener for the add establishment method.
     */
    public void addEstablishmentListener(ActionListener listenforaddestablishmentbutton) {
        addEstablishment.addActionListener(listenforaddestablishmentbutton);
    }

    public void addInspectionListener(ActionListener listenforinspectionbutton){
        doInspection.addActionListener(listenforinspectionbutton);
    }

    public void addLogOutListener(ActionListener listenforlogoutbutton) {
        logout.addActionListener(listenforlogoutbutton);
    }

}