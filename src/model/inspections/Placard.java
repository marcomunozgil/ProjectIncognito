package model.inspections;

public class Placard extends Report {


    /**
     * options are green, yellow and red
     */
    String placardColor = " ";
    String placardTitle;
    String establishmentName;
    String inspectorName;

    /**
     *method to assign and return the color of the placard on the provided report.
     */
   // public String getPlacardColorPlacard () {
     //  String color;
        /**
         * green is passing 85 or more...
         */
//        if (reportScore > 85 || reportScore == 85) {
//            color = "green";
//            placardColor = color;
//            return placardColor;
//        }
        /**
         * yellow is temporary pass 70 to 84...
         */
 //       else if (reportScore < 85 && reportScore > 69) {
 //           color = "yellow";
 //           placardColor = color;
//            return color;
//        }
        /**
         * otherwise under 69 or under is a failing score...
         */
        //else {
         //   color = "red";
       //     return color;
     //   }
   // }

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

    public String getEstablishmentName(){
        establishmentName = EstablishmentName;
        return EstablishmentName;
    }

    public String getInspectorName(){
        inspectorName = inspector;
        return inspector;
    }

    public String getDate() {
        return date;
    }

    public int getScore(){
        reportScore = questions.getTotalScore();
        return reportScore;
    }

    //build the view for placard
    //PlacardV.PlacardGUI view = new PlacardV.PlacardGUI();

}
