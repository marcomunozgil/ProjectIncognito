public class Placard extends Report{

    String placardColor = "no color yet"; //options are green, yellow and red

    //method to choose the set the color of the placard on the provided report.
    public String Placard (Report aReport) {

        String color;

        if (reportScore > 85 || reportScore == 85) {
            color = "green";
            return color;
        }
        else if (reportScore < 85 && reportScore > 69) {
            color = "yellow";
            return color;
        }
        else {
            color = "red";
            return color;
        }
    }



}
