package model.inspections;

import controller.Controller;
import controller.Message;
import model.LoginModel;
import model.classes.Establishment;
import model.dashboardControl;
import model.users.Inspector;
import model.users.User;
import view.View;
import view.dashboard;
import view.dashboardModel;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * this main is intended to be use only to test model.classes and simulate the behavior
 * of the program. Mainly used for development and debugging of the dashboard and other
 * associated classes.
 */
public class main {

    public static void main(String[] args) {

        //questionsView qna = new questionsView();


       // BlockingQueue<Message> queue = new LinkedBlockingQueue<>();
       // LoginModel model = new LoginModel();
       // View view = new View(queue);
        dashboard theView = new dashboard();
        dashboardModel theModel = new dashboardModel();
        dashboardControl dc = new dashboardControl(theView, theModel);

        //Controller controller = new Controller(queue, model, view);
        //controller.mainLoop();



        System.out.println();
        System.out.println();
        Inspector JohnDoe = new Inspector();
        User Karen = new User();

        System.out.println("A new user was made named: " + JohnDoe.getName() + ".");
        System.out.println("A new user was made named: " + Karen.getName() + ".");
        Establishment InNout = new Establishment();
        System.out.println("A new establishment was made named: " + InNout.getEstablishment() + ".");

        /**
         * user will do an inspection on an establishment not inspected yet
         * for debugging purposes
         */
        System.out.println("User Karen has begun inspection in the new establishment...");
        Karen.doInspection(InNout, Karen.getName());
        /**
         * user adds establishment to inspection queue
         */
        Karen.addEstablishment(InNout);
        System.out.println(Karen.getName() + " has added " + InNout.getEstablishment() +
                " to the list of establishments to be inspected.");

        /**
         * inspector conducts the inspection in the establishment added by user
         */
        System.out.println("Inspector John has begun an inspection in the new establishment...");
        System.out.println();
        System.out.println();





    }
}
