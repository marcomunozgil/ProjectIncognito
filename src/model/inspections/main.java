/*Use this main to test your model.classes or other code
you added to start debugging or adding features
 */

package model.inspections;

import model.classes.Establishment;
import model.users.Inspector;
import model.users.User;

/**
 * this main is intended to be use only to test model.classes and simulate the behavior
 * of the program, but it is not the final main with the MVC coding pattern implemented
 */
public class main {

    public static void main(String[] args) {


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
        Karen.doInspection(InNout);
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
        JohnDoe.doInspection(InNout);
        System.out.println();
        System.out.println();
        System.out.println("End of the program...");





    }
}