package model.users;

import model.classes.Establishment;
import model.inspections.InspectorInspection;

/**
 * Inspector class that extends from User.
 */
public class Inspector extends User {

    private String name = "John Doe";
    private String role = "Inspector";
    private String establishment = "no name";
    private InspectorInspection inspection;
    private Establishment facility;

    public String getName() {
        this.name = name;
        return name;
    }

    public String getRole() {
        return role;
    }
    /**
     * Able to add an Establishment if it is not listed in the website.
     * @param facility
     */
    public void addEstablishment(Establishment facility) {
        this.facility = facility;
    }


    /**
     * Inspector will be able to rate the Establishment
     * @param rate rate the Establishment out of 5
     *
     */
    public void rateEstablishment(int rate) {

    }

    /**
     * Inspectors will be able to conduct an Inspection using the Inspection interface
     * thanks to the strategy coding pattern implemented
     * @param facility is the establishment to be inspected.
     */
    public void doInspection(Establishment facility, String nameOfInspector) {
            inspection = new InspectorInspection();
            inspection.doInspection(facility, nameOfInspector);


    }


}
