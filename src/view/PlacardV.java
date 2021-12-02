package view;

import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.*;
import model.inspections.Placard;

import static javax.swing.text.StyleConstants.Bold;

public class PlacardV extends Placard {



    public static class PlacardGUI extends JFrame {


        //private
        private JLabel establishmentName;
        private JLabel inspectorName;

        //GUI for the report, this is just a representation of the report's
        //placard for the given inspection.
        public PlacardGUI(String colorForPlacard) {


            JLayeredPane topTitleArea = new JLayeredPane();
            JLabel placardTitle = null;
            Font font0 = new Font ("Verdana", Font.BOLD, 50);

            this.setTitle("Food Establishment Inspection Report");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(true);
            this.getRootPane();
            if (colorForPlacard == "green"){
                this.getContentPane().setBackground(Color.green);
                placardTitle = new JLabel(" PASS ");
                font0 = new Font("Verdana", Font.BOLD, 80);

            }
            else if (colorForPlacard == "red"){
                this.getContentPane().setBackground(Color.red);
                placardTitle = new JLabel(" CLOSED ");
                font0 = new Font("Verdana", Font.BOLD, 70);

            }
            else if (colorForPlacard == "yellow"){
                this.getContentPane().setBackground(Color.yellow);
                placardTitle = new JLabel(" CONDITIONAL PASS ");
                font0 = new Font("Verdana", Font.BOLD, 45);
            }

            
            this.setSize(600, 900);

            //Font font = new Font("Verdana", Font.BOLD, 45);

            placardTitle.setFont(font0);
            topTitleArea.setSize(400, 10);
            topTitleArea.add(placardTitle);
            this.add(topTitleArea);
            //this.getContentPane();
            this.add(placardTitle);
            topTitleArea.setVisible(true);

        }

    }

}