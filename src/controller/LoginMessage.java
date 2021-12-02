package controller;

/**
 * Log-in message class that implements the message interface.
 */
public class LoginMessage implements Message {
    String username;
    String password;

    /**
     * Initializes the user and pass variables.
     * @param username username
     * @param password password
     */
    public LoginMessage(String username, String password) {
        this.username = username;
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
