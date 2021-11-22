package ProjectIncognito.src.inspections;

public class Questionnaire{

    /**
     * this class will simply provide getters and
     * setters for each field. each field is a
     * question itself of type String.
     */
    private boolean question1 = false;
    private boolean question2 = false;
    private boolean question3 = false;
    private boolean question4 = false;
    private boolean question5 = false;




    /**
     * each constructor is a question for the inspection
     * @return is the answer to the question, by default they
     * are all set to false.
     */
    public boolean getQuestion1() {
        String ask1 = "Is the manager present and certified as 'food safety manager'?";
        System.out.println(ask1); //for debugging purposes
        return question1;
    }

    /**
     * use this method to answer the question as a simple yes (true) or no (false), in the GUI this is a
     * toggle switch or a radial button.
     */
    public void setQuestion1(boolean question1) {
        this.question1 = question1;
    }

    public boolean getQuestion2() {
        String ask2 = "Is the perishable food outside the 'Temperature Danger Zone'?";
        System.out.println(ask2); //for debugging purposes
        return question2;
    }

    public void setQuestion2(boolean question2) {
        this.question2 = question2;
    }

    public boolean getQuestion3() {
        String ask3 = "Is there hot and cold water available?";
        System.out.println(ask3); //for debugging purposes
        return question3;
    }

    public void setQuestion3(boolean question3) {

        this.question3 = question3;
    }

    public boolean getQuestion4() {
        String ask4 = "Are all the hand washing stations stocked and accessible?";
        System.out.println(ask4); //for debugging purposes
        return question4;
    }

    public void setQuestion4(boolean question4) {
        this.question4 = question4;
    }

    public boolean getQuestion5() {
        String ask5 = "Is every employee wearing gloves and face mask?";
        System.out.println(ask5); //for debugging purposes
        return question5;
    }

    public void setQuestion5(boolean question5) {
        this.question5 = question5;
    }



    public void Questions () {
        //for debugging purposes
        System.out.println();
    }

}
