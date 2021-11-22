package ProjectIncognito.src.inspections;

public class Placard extends Report { //



    String placardColor = "red"; //options are green, yellow and red


    //method to assigns and returns the color of the placard on the provided report.
    public String getPlacardColorPlacard () {

        String color = "red";

        //green is passing 85 or more...
        if (reportScore > 85 || reportScore == 85) {
            color = "green";
            placardColor = color;
            return placardColor;
        }

        //yellow is temporary pass 70 to 84...
        else if (reportScore < 85 && reportScore > 69) {
            color = "yellow";
            placardColor = color;
            return color;
        }
        //otherwise under 69 or under is a failing score...
        else {
            return color;
        }
    }


}
