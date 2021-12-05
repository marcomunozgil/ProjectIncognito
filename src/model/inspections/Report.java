package model.inspections;

/**
 * This class is a report that contains all the details of the business and the inspector
 * conducting the inspection. It is meant to be used as the source of all the data needed
 * to generate all the other objects of the other classes like the placard for example.
 */
public class Report{

    String EstablishmentName = "no name";
    String Address = " no address";
    String date = " no date";
    String ManagerName = " no name";
    String inspector;
    int reportScore;
    String notes = "no notes";
    boolean evidence = false; //meaning no pictures yet
    Questionnaire questions;
    Placard placard;

    /**
     * This constructor makes a report with the given inspector and business.
     * @param nameOfInspector is the name of the inspector doing the inspection.
     * @param placeName is the name of the business in which the inspection is being made.
     */
    public Report (String nameOfInspector,String placeName) {

        this.questions = new Questionnaire();
        this.EstablishmentName = placeName;
        this.Address = Address;
        this.date = date;
        this.ManagerName = ManagerName;
        this.inspector = nameOfInspector ;
        this.notes = notes;
        this.reportScore = questions.getTotalScore();




    }

}
