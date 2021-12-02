package ProjectIncognito.src.inspections;

public class Report{


    //next step is to generate the score from the questionarie and pass it to
    //variable here



    String EstablishmentName = "no name";
    String Address = " no address";
    String date = " no date";
    String ManagerName = " no name";
    String inspector = " no inspector assigned";
    int reportScore;
    String notes = "no notes";
    boolean evidence = false; //meaning no pictures yet
    Questionnaire questions;
    Placard placard;

    public Report () {
        this.EstablishmentName = EstablishmentName;
        this.Address = Address;
        this.date = date;
        this.ManagerName = ManagerName;
        this.inspector = inspector;
        this.notes = notes;

        /**
         * the following methods makes a questionnaire object, which contains
         * all the questions. It will also allow the user to answer and record
         * all the answers in the questionnaire.
         */
        this.questions = new Questionnaire();
        //System.out.println(" this is the score from the report " + questions.getTotalScore());
        this.reportScore = questions.getTotalScore();

        /**
         * Once a questionnaire is made a report placard will also be made to
         * display a summary of the inspection results
         */
        //this.placard = new Placard();


    }


    //need to add methods to edit the data and to filter the access
    //to report data based on the user role.
}
