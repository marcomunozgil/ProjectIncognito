package model.inspections;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
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

        createWindow();
/**
        this.setSize(600, 900);
        this.setTitle("Food Safety Inspection by Incognito");




        JPanel answerButtons1 = new JPanel();
        answerButtons1.add(Box.createHorizontalGlue());
        answerButtons1.add(answerYes);
        answerButtons1.add(Box.createRigidArea(new Dimension(15, 0)));
        answerButtons1.add(answerNO);



        JPanel answerButtons2 = new JPanel();
        answerButtons2.add(Box.createHorizontalGlue());
        answerButtons2.add(answerYes);
        answerButtons2.add(Box.createRigidArea(new Dimension(15, 0)));
        answerButtons2.add(answerNO);

        JPanel questionsPanel1 = new JPanel();
        questionsPanel1.setLayout(new BoxLayout(questionsPanel1, BoxLayout.PAGE_AXIS));
        questionsPanel1.add(question1);
        questionsPanel1.add(Box.createRigidArea(new Dimension(15, 0)));

        questionsPanel1.add(answerYes);
        questionsPanel1.add(Box.createHorizontalGlue());
        questionsPanel1.add(answerNO);
        questionsPanel1.add(Box.createRigidArea(new Dimension(15, 0)));
**/
        /**
        questionsPanel1.add(Box.createRigidArea(new Dimension(25, 0)));
        questionsPanel1.add(question2);
        questionsPanel1.add(Box.createRigidArea(new Dimension(15, 0)));


        JPanel questionsPanel2 = new JPanel();
        questionsPanel2.setLayout(new BoxLayout(questionsPanel2, BoxLayout.PAGE_AXIS));
        questionsPanel2.add(question2);
        questionsPanel2.add(Box.createRigidArea(new Dimension(15, 0)));
        questionsPanel2.add(answerButtons1);



        JPanel answerButtons2 = new JPanel();
        answerButtons2.add(Box.createHorizontalGlue());
        answerButtons2.add(answerYes);
        answerButtons2.add(Box.createRigidArea(new Dimension(15, 0)));
        answerButtons2.add(answerNO);

        questionsPanel.add(question1);
        questionsPanel.add(answerButtons1);

        questionsPanel.add(answerButtons2);
        questionsPanel.add(question3);
        questionsPanel.add(answerButtons1);
        questionsPanel.add(question4);
        questionsPanel.add(answerButtons2);
        questionsPanel.add(question5);
        questionsPanel.add(answerButtons1);*/



        //this.add(questionsPanel1);
        //this.add(questionsPanel2);

        this.setVisible(true);


    }



    private static void createWindow() {
        JFrame frame = new JFrame("Food Safety Inspection by Incognito");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createUI(frame);
        frame.setSize(560, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void createUI(final JFrame frame){
        JPanel panel = new JPanel();
        LayoutManager layout = new FlowLayout();
        panel.setLayout(layout);

        JButton button = new JButton("Start Questionnaire");
        final JLabel label = new JLabel();
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(frame, "Is the manager present and certified as 'food safety manager'?", "Food Safety Inspection by Incognito",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if (result == JOptionPane.YES_OPTION) {
                    label.setText("You selected: Yes");
                } else if (result == JOptionPane.NO_OPTION) {
                    label.setText("You selected: No");
                } else {
                    label.setText("None selected");
                }
            }
        });
        panel.add(button);
        panel.add(label);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
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
