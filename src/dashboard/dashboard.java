import javax.swing.*;

public class dashboard {
    private static JLabel label;
    private static JLabel homeLabel;
    private static JLabel reportLabel;
    private static JLabel operationLabel;
    private static JLabel scoreLabel;
    private static JLabel placardLabel;

    private static JButton logout;
    //private static JLabel failed;

    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);

        panel.setLayout(null);

        label = new JLabel("Username");
        label.setBounds(10, 20, 80, 25);
        panel.add(label);

        homeLabel = new JLabel("Home");
        homeLabel.setBounds(10, 50, 80, 25);
        panel.add(homeLabel);

        reportLabel = new JLabel("Reports");
        reportLabel.setBounds(10, 80, 80, 25);
        panel.add(reportLabel);

        operationLabel = new JLabel("Operations");
        operationLabel.setBounds(10, 110, 80, 25);
        panel.add(operationLabel);

        scoreLabel = new JLabel("Scores");
        scoreLabel.setBounds(10, 140, 80, 25);
        panel.add(scoreLabel);

        placardLabel = new JLabel("Placard");
        placardLabel.setBounds(10, 170, 80, 25);
        panel.add(placardLabel);

        logout = new JButton("Logout");
        logout.setBounds(10,200,80,25);
        panel.add(logout);

        frame.setVisible(true);
    }
}