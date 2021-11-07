package users;

public class User {
    private String name;
    private String role = "User";
    private String establishment;

    /**
     * Able to add an Establishment if it is not listed in the website.
     */
    public void addEstablishment() {

    }

    /**
     * User will be able to view the chosen Establishment
     * @param e Name of Establishment
     * @return The Establishment
     */
    public String viewEstablishment(String e) {
        establishment = e;
        return e;
    }

    /**
     * Rate the Inspector of a chosen inspection in an Establishment.
     * @param rate The rating of the Inspector out of 5
     */
    public void rateInspector(int rate) {

    }

}
