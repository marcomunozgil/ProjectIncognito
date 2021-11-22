package model;

/**
 * Model class for login.
 */
public class LoginModel {
    private String username;
    private char[] password;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public char[] getPassword() {
        return password;
    }

}
