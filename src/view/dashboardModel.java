package view;

import model.classes.Establishment;
import model.users.Inspector;
import model.users.User;

public class dashboardModel {


    public void doInspection (Inspector John, Establishment place) {
        John.doInspection(place, John.getName());
    }


    public void logOut () {
        System.out.println("Logging you out... Thanks!");
        System.exit(0);
    }

    public void addEstablishment (User u, Establishment e) {
        u.addEstablishment(e);
    }
}
