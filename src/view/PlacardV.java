package view;

import javax.swing.*;
import java.awt.*;
import model.inspections.Placard;

/**
 * This is the view class or GUI for the placard generated when doing an inspection.
 */
public class PlacardV extends Placard {

    public PlacardV(String nameOfInspector, String placeName) {
        super(nameOfInspector, placeName);
    }

    public static class PlacardGUI extends JFrame {

        /**
         * Constructor for the placard view. This is what the user will see in the
         * screen as the placard.
         * @param colorForPlacard could be yellow, red or green depending on score.
         * @param inspectorname the name of the inspector performing the inspection.
         * @param scoreNumber the score given to the establishment after inspection.
         */
        public PlacardGUI(String colorForPlacard, String inspectorname, int scoreNumber, String placeName) {

            JPanel topTitleArea = new JPanel();
            topTitleArea.setLayout(new BoxLayout(topTitleArea, BoxLayout.PAGE_AXIS));
            Font font0 = new Font ("Verdana", Font.BOLD, 50);
            JLabel placardTitle = null;
            JLabel placardMessage = new JLabel("   This establishment has been " +
                    "officially inspected by Team Incognito. The overall results are: ");
            JLabel inspectorName = new JLabel("   Inspected by: " + inspectorname);
            JLabel numericalScore = new JLabel("   Score: " + scoreNumber);
            JLabel establishmentName = new JLabel("   Business Name: " + placeName );
            Font font = new Font("Verdana", Font.BOLD, 25);
            this.add(topTitleArea);
            this.setTitle("Food Establishment Inspection Report");
            this.setVisible(true);
            this.getRootPane();
            this.setSize(600, 700);

            /**
             * The next if-else block decides on a Title based on the color of the placard.
             * Green means pass, red means fail and yellow is conditional pass.
             */
            if (colorForPlacard == "green"){
                topTitleArea.setBackground(Color.green);
                placardTitle = new JLabel("     PASS ");
                font0 = new Font("Verdana", Font.BOLD, 80);

            }
            else if (colorForPlacard == "red"){
                topTitleArea.setBackground(Color.red);
                placardTitle = new JLabel("     FAIL ");
                font0 = new Font("Verdana", Font.BOLD, 70);

            }
            else if (colorForPlacard == "yellow"){
                topTitleArea.setBackground(Color.yellow);
                placardTitle = new JLabel(" CONDITIONAL PASS ");
                font0 = new Font("Verdana", Font.BOLD, 45);
            }

            /**
             * Setting up and adding the components of the placard.
             */
            placardTitle.setFont(font0);
            inspectorName.setFont(font);
            numericalScore.setFont(font);
            establishmentName.setFont(font);
            topTitleArea.add(Box.createRigidArea(new Dimension(0,20)));
            topTitleArea.add(placardMessage);
            topTitleArea.add(Box.createRigidArea(new Dimension(0,100)));
            topTitleArea.add(placardTitle);
            topTitleArea.add(Box.createRigidArea(new Dimension(0,180)));
            topTitleArea.add(numericalScore);
            topTitleArea.add(Box.createRigidArea(new Dimension(0,50)));
            topTitleArea.add(establishmentName);
            topTitleArea.add(Box.createRigidArea(new Dimension(0,50)));
            topTitleArea.add(inspectorName);
            topTitleArea.setBorder(BorderFactory.createMatteBorder(20,20,20,20, Color.black));
            topTitleArea.setVisible(true);
        }

    }

}