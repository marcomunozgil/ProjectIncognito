public class Placard extends Report{

    String placardColor = "no color yet"; //options are green, yellow and red

    //method to choose the set the color of the placard on the provided report.
    public String Placard (Report aReport) {

        String color;

        //green is passing 85 or more...
        if (reportScore > 85 || reportScore == 85) {
            color = "green";
            return color;
        }

        //yellow is temporary pass 70 to 84...
        else if (reportScore < 85 && reportScore > 69) {
            color = "yellow";
            return color;
        }
        //otherwise under 69 or under is a failing score...
        else {
            color = "red";
            return color;
        }
    }



}
