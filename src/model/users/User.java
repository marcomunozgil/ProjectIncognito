package model.users;

import model.classes.Establishment;
import model.inspections.UserInspection;

/**
 * User class. Currently what most ProjectIncognito.src.model.users will be defined as for Project Incognito.
 */
public class User {
    public String getName() {
        return name;
    }



    private String name = "Karen";
    private String role = "User";
    private String establishment;
    private Establishment facility;
    private UserInspection inspection;



    /**
     * Able to add an Establishment if it is not listed in the website.
     * @param facility
     */
    public void addEstablishment(Establishment facility) {
        this.facility = facility;
    }

    /**
     * User will be able to view the chosen Establishment
     * @param e Name of Establishment
     * @return The Establishment
     */
    public String viewEstablishment(String e) {
        establishment = e;
        return e;
    }

    /**
     * Rate the Inspector of a chosen inspection in an Establishment.
     * @param rate The rating of the Inspector out of 5
     */
    public void rateInspector(int rate) {

    }

    public void doInspection (Establishment facility, String nameOfInspector){
        inspection = new UserInspection();
        inspection.doInspection(facility, nameOfInspector);
    }

}
