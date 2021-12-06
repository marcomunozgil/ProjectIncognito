package model;

import model.classes.Establishment;
import model.users.Inspector;
import view.dashboard;
import view.dashboardModel;

import javax.swing.JTextArea;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;

/**
 * The dashboard control is meant to provide a menu of options to the user.
 * It controls the interactions between the view and the model classes. The
 * user can add an establishment to be inspected, perform an inspection
 * and log out.
 */
public class dashboardControl{

    /**
     *These are the variables used by the dashboard to perform its functions.
     */
    private dashboardModel theModel;
    private dashboard theView;
    private Inspector jonny ;
    private Establishment bKing;
    private String myString;
    private String myString2;
    public static JTextArea editTextArea = new JTextArea();

    /**
     * This method constructs a dashboard object with the given parameters.
     * @param theView is the class that makes the GUI.
     * @param theModel is the class that holds the data.
     */
    public dashboardControl(dashboard theView, dashboardModel theModel) {
        /**
         * Initializing and assigning the variables.
         */
        this.theModel = theModel;
        this.theView = theView;
        this.jonny = new Inspector();
        this.bKing = new Establishment();

        /**
         * The next statements makes it so that when the respective button is pressed
         * on the dashboard, it will execute the method inside the inner class.
         */
        this.theView.addInspectionListener(new InspectionListener());
        this.theView.addLogOutListener(new logOutListener());
        this.theView.addEstablishmentListener(new addEstablishmentListener());
    }

    /**
     * These are the methods to be executed when the buttons are pressed.
     */
    class addEstablishmentListener implements ActionListener{
        /**
         * The actual task or method to be executed is inside a try-catch block
         * in case anything goes wrong the program will not crash.
         * @param x is the event we are waiting for or listening to know when
         * to go ahead and execute the method. This first one is the add Establishment
         * button.
         */

        public void actionPerformed (ActionEvent x) {

            try {
                /**
                 * the next block of code is the GUI for adding an establishment to be inspected

                int answer = JOptionPane.showConfirmDialog(null,
                        "Please enter the name of the business", "Food Safety Inspections by Incognito",
                        JTe);
                /**
                 * If the user selects No then set the value of the boolean to false.
                 * Otherwise set the value to true when user selects Yes.

                if (answer == JOptionPane.NO_OPTION) {
                    question1 = false;

                } else if(answer == JOptionPane.YES_OPTION) {
                    question1 = true;
                }*/
                String result = (String)JOptionPane.showInputDialog(
                        null,
                        "Please enter the name of the business:",
                        "Food safety inspections by incognito 1/2",
                        JTextField.CENTER
                );
                if(result != null && result.length() > 0){
                    myString = result;
                }else {
                    myString = "no name";
                }

                String result2 = (String)JOptionPane.showInputDialog(
                        null,
                        "Please enter the name of the inspector:",
                        "Food safety inspections by incognito 2/2",
                        JTextField.CENTER
                );
                if(result2 != null && result2.length() > 0){
                    myString2 = result2;
                }else {
                    myString2 = "no name";
                }

                theModel.addEstablishment(jonny, bKing);
                bKing.setEstablishment(myString);
                jonny.setName(myString2);

                JOptionPane.showMessageDialog(null,
                       bKing.getEstablishment() + " has been added to the list of " +
                                "businesses to inspect. Thanks!");

                System.out.println("Establishment named " + bKing.getEstablishment() + " to the " +
                        "queue of establishments to be inspected by Team Incognito!");
            }
            catch (NullPointerException s){
                throw s;
            }
        }
    }

    /**
     * This next class is the log-out button. In this case it terminates the program
     * and shows a message on the screen to notify the user. In a future more
     * functionality can be added. Like saving all changes, or even making a file so
     * that you can print a report, summary or even a placard.
     */
    class logOutListener implements ActionListener{
        public void actionPerformed (ActionEvent i) {
            try {
                JOptionPane.showMessageDialog(null, "Logging you out... Thanks!");
                theModel.logOut();
            }
            catch (IllegalComponentStateException e){
                throw e;
            }
        }
    }

    /**
     * This last class is the do Inspection button. It uses a User and Establishment
     * objects that in this case are created here, but they were meant to be created
     * in the log in page and passed on to the other pages to be used and/or updated
     * as needed. This last try-catch block is a little different just to show another
     * implementation of how to handle exceptions when you know what exception to look
     * for and also to just throw the ones you did not expect. Again, in this case they
     * are basically just for show but in a future extra functionality can be added.
     */
    class InspectionListener implements ActionListener{

        public void actionPerformed (ActionEvent e) {
            try{
                theModel.doInspection(jonny, bKing);

            }
            catch (Exception ex){
                if(ex instanceof IOException){

                } else if (ex instanceof NullPointerException){

                } else {

                    throw ex;
                }
            }
        }

    }


}
