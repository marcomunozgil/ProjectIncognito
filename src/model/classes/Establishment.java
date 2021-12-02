package model.classes;

import model.inspections.Placard;

/**
 * Establishment model class that initializes an establishment with the given information.
 */
public class Establishment {
    private String managerName;
    private String establishmentName = "McDonald's"; //Sample name
    private String address;
    private boolean status = false; //this boolean will let the user know if the place has been inspected
    private Placard inspectionReport;

    /**
     * Returns the establishment manager's name.
     * @return manager's name
     */
    public String getManagerName() {
        return managerName;
    }

    /**
     * Sets the managerName variable with the given name.
     * @param nameManager manager's name
     */
    public void setManagerName(String nameManager)
    {
        this.managerName = nameManager;
    }

    /**
     * Returns the establishment's name.
     * @return establishment's name
     */
    public String getEstablishment()
    {
        return establishmentName;
    }

    /**
     * Sets the establishment's name.
     * @param newPlace establishment's name
     */
    public void setEstablishment(String newPlace) {
        this.establishmentName = newPlace;
    }

    /**
     * Returns the establishment's street address.
     * @return establishment's street address
     */
    public String getAddress()
    {
        return address;
    }

    /**
     * Sets the establishment's street address.
     * @param newAddress establishment's street address
     */
    public void setAddress(String newAddress) {
        this.address = newAddress;
    }

    /**
     * Checks if the establishment has been inspected.
     * @return Inspection status
     */
    public boolean getStatus(){
        return status;
    }

    /**
     * Sets the establishment's inspection status
     * @param status true or false if there has been an inspection
     */
    public void setStatus(boolean status) {
        this.status = status;

    }

    /**
     * Returns the inspection report of the establishment, if there is any.
     * @return inspection report
     */
    public Placard getInspectionReport () {
        return inspectionReport;
    }

    /**
     * Creates a new inspection report using the Placard class.
     * @param newReport new inspection report
     */
    public void setInspectionReport (Placard newReport) {
        this.inspectionReport = newReport;
    }

}
