package view;

import model.classes.Establishment;
import model.users.Inspector;
import model.users.User;

import javax.swing.*;

/**
 * The dashboardModel class is the one that holds the data and executes the
 * functions.
 */
public class dashboardModel {

    /**
     * This is the method for the do Inspection button. It has two parameters.
     * @param John is the user object performing the inspection.
     * @param place is the establishment in which the user is to perform the
     *              inspection.
     */
    public void doInspection (Inspector John, Establishment place) {
        John.doInspection(place, John.getName());
    }

    /**
     * This is the log out button functions. It simply prints a statement to the
     * console to notify the user.
     */
    public void logOut () {
        System.out.println("Logging you out... Thanks!");
        System.exit(0);
    }

    /**
     * This last method is the for the add establishment button of the dashboard.
     * @param u is the user adding the place to be inspected.
     * @param e is the place or establishment to be inspected.
     */
    public void addEstablishment (User u, Establishment e) {
        u.addEstablishment(e);
    }
}
