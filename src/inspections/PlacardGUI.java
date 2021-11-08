package ProjectIncognito.src.inspections;

import javax.swing.JFrame;
import java.awt.*;

public class PlacardGUI extends JFrame  {

    //GUI for the report, this is just a representation of the report's
    //placard for the given inspection.
    PlacardGUI(){
        this.setTitle("Food Establishment Inspection Report");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.green);
        this.setSize(600,900);

    }

}
