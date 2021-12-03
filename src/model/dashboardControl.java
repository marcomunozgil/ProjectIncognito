package model;

import model.classes.Establishment;
import model.users.Inspector;
import view.dashboard;
import view.dashboardModel;

import javax.lang.model.type.NullType;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class dashboardControl{

    private dashboardModel theModel;
    private dashboard theView;
    private Inspector jonny ;
    private Establishment bKing;

    public dashboardControl(dashboard theView, dashboardModel theModel) {
        this.theModel = theModel;
        this.theView = theView;
        this.jonny = new Inspector();
        this.bKing = new Establishment();
        //when doInspection button is pressed execute method in inspectionlistener inner class
        this.theView.addInspectionListener(new InspectionListener());
        this.theView.addLogOutListener(new logOutListener());
        this.theView.addEstablishmentListener(new addEstablishmentListener());
    }

    class addEstablishmentListener implements ActionListener{

        public void actionPerformed (ActionEvent x) {
            try {
                theModel.addEstablishment(jonny, bKing);
                System.out.println("Establishment named " + bKing.getEstablishment() + " to the " +
                        "queue of establishments to be inspected by Team Incognito!");
            }
            catch (NullPointerException s){
                throw s;
            }
        }
    }

    class logOutListener implements ActionListener{
        public void actionPerformed (ActionEvent i) {
            try {
                theModel.logOut();
            }
            catch (NullPointerException e){
                throw e;
            }
        }
    }

    class InspectionListener implements ActionListener{


        public void actionPerformed (ActionEvent e) {
            try{
                theModel.doInspection(jonny, bKing);
            }
            catch (Exception ex){
                if(ex instanceof IOException){
                    // handle this exception type
                } else if (ex instanceof NullPointerException){
                    //handle this one
                } else {
                    // We didn't expect this one. What could it be? Let's log it, and let it bubble up the hierarchy.
                    throw ex;
                }
            }
        }

    }


}
