package model;

/**
 * Model class for login.
 */
public class LoginModel {
    private String username;
    private String password;

    /**
     * Sets the username that the user typed
     * @param username username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Sets the password that the user typed.
     * @param password password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gives the username.
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Gives the password.
     * @return password
     */
    public String getPassword() {
        return password;
    }

}
