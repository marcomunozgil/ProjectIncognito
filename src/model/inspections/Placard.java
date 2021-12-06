package model.inspections;

/**
 * This class is the placard, the poster with a quick summary of the
 * results of the inspection. It is meant to be posted in a public place
 * to display the achievement and inspire trust to the guests dinning there.
 */
public class Placard extends Report {

    String placardColor;
    String placardTitle;
    String placardMessage;
    String inspectorName;

    /**
     * Constructor to make a placard object with the parameters from the super class.
     * @param nameOfInspector is the name of the inspector.
     * @param placeName is the name of the business to be inspected.
     */
    public Placard(String nameOfInspector, String placeName) {
        super(nameOfInspector, placeName);
    }


    /**
     * Method to assign and return the color of the placard on the provided report.
     * @return is a string returned to the caller with the color of the placard, based
     * on the score obtained from the questions.
     */
    public String getPlacardColorPlacard () {
     String color;

        /**
         * green is passing 85 or more...
         */
        if (reportScore > 85 || reportScore == 85) {
            color = "green";
            placardColor = color;
            return placardColor;
        }

        /**
         * yellow is temporary pass 70 to 84...
         */
        else if (reportScore < 85 && reportScore > 69) {
            color = "yellow";
            placardColor = color;
            return color;
        }

        /**
         * otherwise under 69 or under is a failing score...
         */
        else {
            color = "red";
           return color;
        }
    }

    /**
     * this method to create the title for the placard
     * @param placardColor the color used to decide the title
     * @return a string with the word "fail" for color red, "Pass" for color green or "Conditional Pass" for yellow
     */
    public String getPlacardTitle(String placardColor){

        if (placardColor == "red") {
            placardTitle = "FAIL";

        }
        else if (placardColor == "green") {
            placardTitle = "PASS";
        }
        else if (placardColor == "yellow") {
            placardTitle = "CONDITIONAL PASS";
        }
        else {
            return "Incorrect placard color input";
        }

        return placardTitle;
    }

    /**
     * This function returns a string with the name of the business on the report.
     * @return is the name of the business in the report.
     */
    public String getEstablishmentName(){
        placardMessage = EstablishmentName;
        return EstablishmentName;
    }

    /**
     * This method returns a string with the name of the inspector in the report.
     * @return is the string with the inspector's name.
     */
    public String getInspectorName(){
        //inspectorName = inspector;
        return inspector;
    }

    /**
     * This method returns a string with the date.
     * @return is the date of the inspection.
     */
    public String getDate() {
        return date;
    }

    /**
     * This method returns an int with the score of the inspection.
     * @return is the score of the inspection. An integer from 1-100
     */
    public int getScore(){
        reportScore = questions.getTotalScore();
        return reportScore;
    }

}
