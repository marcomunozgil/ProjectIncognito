package model;

import model.classes.Establishment;
import model.users.Inspector;
import view.dashboard;
import view.dashboardModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class dashboardControl{

    private dashboardModel theModel;
    private dashboard theView;

    public dashboardControl(dashboard theView, dashboardModel theModel) {
        this.theModel = theModel;
        this.theView = theView;

        //when doInspection button is pressed execute method in inspectionlistener inner class
        this.theView.addInspectionListener(new InspectionListener());
        this.theView.addLogOutListener(new logOutListener());
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

        Inspector JohnDoe = new Inspector();
        Establishment InNout = new Establishment();


        public void actionPerformed (ActionEvent e) {
            try{
                JohnDoe.doInspection(InNout, JohnDoe.getName());
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
