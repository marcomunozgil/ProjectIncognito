package view;

import model.classes.Establishment;
import model.users.Inspector;

public class dashboardModel {
    private Inspector JohnDoe = new Inspector();
    private Establishment InnOut = new Establishment();


    public void doInspection (Inspector John, Establishment place) {
        JohnDoe.doInspection(place, John.getName());
    }
}
