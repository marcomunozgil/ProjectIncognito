package view;

import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.*;
import model.inspections.Placard;

import static javax.swing.text.StyleConstants.Bold;

public class PlacardV extends Placard {

    String placeName = getEstablishmentName();

    public PlacardV(String nameOfInspector) {
        super(nameOfInspector);
    }

    public static class PlacardGUI extends JFrame {

        //GUI for the report, this is just a representation of the report's
        //placard for the given inspection.
        public PlacardGUI(String colorForPlacard, String inspectorname, int scoreNumber) {

            //JLayeredPane topTitleArea = new JLayeredPane();

            JPanel topTitleArea = new JPanel();



            //set the layout
            topTitleArea.setLayout(new BoxLayout(topTitleArea, BoxLayout.PAGE_AXIS));


            Font font0 = new Font ("Verdana", Font.BOLD, 50);
            JLabel placardTitle = null;
            JLabel placardMessage = new JLabel("   This establishment has been " +
                    "officially inspected by Team Incognito. The overall results are: ");
            JLabel inspectorName = new JLabel("   Inspected by: " + inspectorname);
            JLabel numericalScore = new JLabel("   Score: " + scoreNumber);

            this.setTitle("Food Establishment Inspection Report");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(true);
            this.getRootPane();

            if (colorForPlacard == "green"){
                topTitleArea.setBackground(Color.green);
                placardTitle = new JLabel("     PASS ");
                font0 = new Font("Verdana", Font.BOLD, 80);

            }
            else if (colorForPlacard == "red"){
                topTitleArea.setBackground(Color.red);
                placardTitle = new JLabel(" CLOSED ");
                font0 = new Font("Verdana", Font.BOLD, 70);

            }
            else if (colorForPlacard == "yellow"){
                topTitleArea.setBackground(Color.yellow);
                placardTitle = new JLabel(" CONDITIONAL PASS ");
                font0 = new Font("Verdana", Font.BOLD, 45);
            }
            this.setSize(600, 700);///
            //topTitleArea.setSize(600, 100);////


            Font font = new Font("Verdana", Font.BOLD, 25);

            placardTitle.setFont(font0);
            inspectorName.setFont(font);
            numericalScore.setFont(font);
            topTitleArea.add(Box.createRigidArea(new Dimension(0,20)));//empty space to separate objects
            topTitleArea.add(placardMessage);//just a message on the top
            topTitleArea.add(Box.createRigidArea(new Dimension(0,100)));//empty space to separate objects
            topTitleArea.add(placardTitle);//title, this is the pass, closed or conditional pass
            topTitleArea.add(Box.createRigidArea(new Dimension(0,180)));//empty space to separate objects
            topTitleArea.add(numericalScore);
            topTitleArea.add(Box.createRigidArea(new Dimension(0,50)));//empty space to separate objects
            topTitleArea.add(inspectorName);//message about inspector name.


            topTitleArea.setBorder(BorderFactory.createMatteBorder(20,20,20,20, Color.black));


            this.add(topTitleArea);///
            //this.getContentPane();
            //this.add(placardTitle);
            topTitleArea.setVisible(true);


        }

    }

}