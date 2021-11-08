

public class Report {

    String EstablishmentName = "no name";
    String Address = " no address";
    String date = " no date";
    String ManagerName = " no name";
    String inspector = " no inspector assigned";
    int reportScore = 100;
    String notes = "no notes";
    boolean evidence = false; //meaning no pictures yet


    public Report () {
        this.EstablishmentName = EstablishmentName;
        this.Address = Address;
        this.date = date;
        this.ManagerName = ManagerName;
        this.inspector = inspector;
        this.reportScore = reportScore;
        this.notes = notes;
        this.evidence = evidence;
    }

    //need to add methods to edit the data and to filter the access
    //to report data based on the user role.
}
