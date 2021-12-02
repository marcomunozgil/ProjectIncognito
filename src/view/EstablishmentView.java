package view;


import controller.Message;

import javax.swing.*;
import java.util.concurrent.BlockingQueue;

/**
 * Class that initializes the Establishment UI/View.
 */
public class EstablishmentView extends JFrame {
    //private static BlockingQueue<Message> queue;
    private static JLabel establishmentName;
    private static JLabel managerName;
    private static JLabel address;

    public EstablishmentView() {
        //this.queue = queue;
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(1280, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);

        panel.setLayout(null);

        establishmentName = new JLabel("McDonald's");
        establishmentName.setBounds(480,20,165,25);
        panel.add(establishmentName);

        managerName = new JLabel("Manager: Johnny Doe");
        managerName.setBounds(480,40,165,25);
        panel.add(managerName);

        address = new JLabel("1234 Imagine Drive");
        address.setBounds(480,60,165,25);
        panel.add(address);

    }

}
