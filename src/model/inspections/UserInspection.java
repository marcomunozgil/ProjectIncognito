package model.inspections;
import model.classes.Establishment;

public class UserInspection implements Inspection {

    private Establishment facility;

    /**
     * this method from the interface is implementing the strategy pattern
     * @param facility is the establishment being inspected by the user
     * the user can only view the results of the inspection, but before
     * that the program needs to check if the establishment has been inspected
     */
    @Override
    public void doInspection(Establishment facility){


        //System.out.println("An inspection has been initiated!"); //for debugging
        System.out.println("Doing inspection...");
        /**
         * check first to make sure the establishment has been inspected
         */
        boolean inspectionStatus;
        inspectionStatus = facility.getStatus();
        if (inspectionStatus == false) {
            System.out.println("This facility has not been inspected yet! ");
            System.out.println("Please add the facility to the model.inspections queue.");
        }
        else {
            System.out.println("Please find the inspection results below: ");
            facility.getInspectionReport();
        }

    }
}
