package users;

import java.util.*;

public class User {
    private String name;
    private String role = "User";
    private String establishment;

    public void addEstablishment() {

    }

    public String viewEstablishment(String e) {
        establishment = e;
        return e;
    }

    public int rateInspector(int rate) {
        return rate;
    }

}
