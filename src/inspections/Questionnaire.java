package ProjectIncognito.src.inspections;

public class Questionnaire{

    /**
     * this class will simply provide getters and
     * setters for each field. each field is a
     * question itself of type String.
     */
    private boolean question1 = true;
    private boolean question2 = true;
    private boolean question3 = true;
    private boolean question4 = true;
    private boolean question5 = true;
    private int totalScore = 0;



    /**
     * each constructor is a question for the inspection
     * @return is the answer to the question, by default they
     * are all set to false.
     */
    public boolean getQuestion1() {
        String ask1 = "Is the manager present and certified as 'food safety manager'?";
        System.out.println(ask1); //for debugging purposes
        //if method only temporaty for debugging until control class is made
        if (question1 == true) {
            totalScore = totalScore + 25;
        }
        return question1;
    }

    /**
     * use this method to answer the question as a simple yes (true) or no (false), in the GUI this is a
     * toggle switch or a radial button.
     */
    public void setQuestion1(boolean question1) {
        if (question1 == true) {
            totalScore =+ 25;
        }
        this.question1 = question1;
    }

    public boolean getQuestion2() {
        String ask2 = "Is the perishable food outside the 'Temperature Danger Zone'?";
        System.out.println(ask2); //for debugging purposes
        //if method only temporaty for debugging until control class is made
        if (question2 == true) {
            totalScore = totalScore + 25;
        }
        return question2;
    }

    public void setQuestion2(boolean question2) {
        if (question2 == true) {
            totalScore =+ 25;
        }
        this.question2 = question2;
    }

    public boolean getQuestion3() {
        String ask3 = "Is there hot and cold water available?";
        System.out.println(ask3); //for debugging purposes
        //if method only temporaty for debugging until control class is made
        if (question3 == true) {
            totalScore = totalScore + 20;
        }
        return question3;
    }

    public void setQuestion3(boolean question3) {
        if (question3 == true) {
            totalScore =+ 20;
        }
        this.question3 = question3;
    }

    public boolean getQuestion4() {
        String ask4 = "Are all the hand washing stations stocked and accessible?";
        System.out.println(ask4); //for debugging purposes
        //if method only temporaty for debugging until control class is made
        if (question4 == true) {
            totalScore = totalScore + 15;
        }
        return question4;
    }

    public void setQuestion4(boolean question4) {
        if (question4 == true) {
            totalScore =+ 15;
        }
        this.question4 = question4;
    }

    public boolean getQuestion5() {
        String ask5 = "Is every employee wearing gloves and face mask?";
        System.out.println(ask5); //for debugging purposes
        //if method only temporaty for debugging until control class is made
        if (question5 == true) {
            totalScore = totalScore + 15;
            //System.out.println(totalScore);
        }
        return question5;
    }

    public void setQuestion5(boolean question5) {
        if (question5 == true) {
            totalScore = totalScore + 15;
        }
        this.question5 = question5;
    }

    public void Questions () {
        //for debugging purposes
        System.out.println();
    }

    public int getTotalScore(){
        //for debugging purposes
        //
        return totalScore;
    };

    public String setPlacardColorPlacard () {

        String color;

        /**
         * green is passing 85 or more...
         */
        if (totalScore > 85 || totalScore == 85) {
            color = "green";
            return color;
        }

        /**
         * yellow is temporary pass 70 to 84...
         */
        else if (totalScore < 85 && totalScore > 69) {
            color = "yellow";
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

    public String setPlacardTitle() {
        String title;

        /**
         * green is passing 85 or more...
         */
        if (totalScore > 85 || totalScore == 85) {
            title = " PASS ";
            return title;
        }

        /**
         * yellow is temporary pass 70 to 84...
         */
        else if (totalScore < 85 && totalScore > 69) {
            title = " CONDITIONAL PASS ";
            return title;
        }

        /**
         * otherwise under 69 or under is a failing score...
         */
        else {
            title = " FAIL ";
            return title;
        }
    }

}
