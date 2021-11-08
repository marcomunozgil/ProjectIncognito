package ProjectIncognito.src.classes;

import java.util.*;
public class Inspection {
    private String name;
    private String establishment;
    private String questionnaire;

    public String getName()
    {
        return name;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    public String getEstablishment()
    {
        return establishment;
    }
    public void setEstablishment(String newPlace){
        this.establishment = newPlace;
    }
    public String getQuestionnaire() {
        return questionnaire;
    }
    public void setQuestionnaire(String newQues)
    {
       this.questionnaire = newQues;
    }
    
    public int calculateScore(int score){
        return score;
    }

    public void storeEvidence()
    {

    }
}