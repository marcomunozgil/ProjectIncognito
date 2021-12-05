package model.inspections;

import javax.swing.*;
import java.awt.event.ActionListener;


/**
 * This class is the view class for the questions of the inspection. The questions are simply
 * yes/true or no/false. The user will be able to select the response in the GUI.
 */
public class questionsView extends JFrame {
    private JLabel question1 = new JLabel("Is the manager present and certified as 'food safety manager'?");
    private JLabel question2 = new JLabel("Is the perishable food outside the 'Temperature Danger Zone'?");
    private JLabel question3 = new JLabel("Is there hot and cold water available?");
    private JLabel question4 = new JLabel("Are all the hand washing stations stocked and accessible?");
    private JLabel question5 = new JLabel("Is every employee wearing gloves and face mask?");
    private JRadioButton answerYes = new JRadioButton("Yes");
    private JRadioButton answerNO = new JRadioButton("No");

    /**
     * Set up the view and add components for the inspection questions.
     */
    questionsView(){
        JPanel questionsPanel = new JPanel();
        this.setSize(600, 900);

        questionsPanel.add(question1);
        questionsPanel.add(answerYes);
        questionsPanel.add(answerNO);
        questionsPanel.add(question2);
        questionsPanel.add(answerYes);
        questionsPanel.add(answerNO);
        questionsPanel.add(question3);
        questionsPanel.add(answerYes);
        questionsPanel.add(answerNO);
        questionsPanel.add(question4);
        questionsPanel.add(answerYes);
        questionsPanel.add(answerNO);
        questionsPanel.add(question5);

        this.add(questionsPanel);

    }

    /**
     * If an answer is selected by clicking on the dot then execute the fucntion
     * in the questionsController named actionPerformed
     */
    void addAnswerListener(ActionListener listenForAnswerButton){
        answerYes.addActionListener(listenForAnswerButton);
        answerNO.addActionListener(listenForAnswerButton);

    }

}
