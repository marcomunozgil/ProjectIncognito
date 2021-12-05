package model.inspections;
import model.classes.Establishment;
import view.PlacardV;


public class InspectorInspection implements Inspection {

    private Establishment facility;
    /**
     * this line starts the inspection; which creates a report with the question answers
     * and a placard in it. this info will then be forward to the view class
     */
    @Override
    public void doInspection(Establishment facility, String nameOfInspector) {
        this.facility = facility;
        String nameOfplace = facility.getEstablishment();
        Placard report1 = new Placard(nameOfInspector, nameOfplace);

    /**
    * The following statements are only meant to be used during the development and debugging
    * process. They serve as an extra assurance of what is going on behind the curtains.
    */
        System.out.println("Doing inspection...");
        System.out.println("Here are the results of the inspection on "
                + facility.getEstablishment() + ":");
        System.out.println(report1.questions.getQuestion1());
        System.out.println(report1.questions.getQuestion2());
        System.out.println(report1.questions.getQuestion3());
        System.out.println(report1.questions.getQuestion4());
        System.out.println(report1.questions.getQuestion5());
        System.out.println();
        System.out.println("Overall: " + report1.questions.setPlacardTitle());
        System.out.println("Placard Score: " + report1.questions.getTotalScore());
        System.out.println("Placard color: " + report1.questions.setPlacardColorPlacard() + ".");
        System.out.println("Inspected by: " + nameOfInspector);

        /**
         * This next line of code builds the placard itself with the given parameters.
         * It will pop up on the screen once the inspection is complete.
         */
        PlacardV.PlacardGUI view = new PlacardV.PlacardGUI(report1.questions.setPlacardColorPlacard(), report1.getInspectorName(), report1.questions.getTotalScore(), report1.getEstablishmentName());
    }

    /**
     * this method will calculate a score for the inspection
     * @param score will contain the numerical value of the inspection
     * @return the score of the inspection to be included in report and
     * placard model.classes.
     */
    public int calculateScore(int score){
        return score;
    }

    /**
     * this method is meant to store evidence like pictures to be potentially
     * added to the report as an extra functionality
     */
    public void storeEvidence()
    {

    }
}