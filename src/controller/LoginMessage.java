package controller;

/**
 * Log-in message class that implements the message interface.
 */
public class LoginMessage implements Message {
    private String username;
    private char[] password;

    /**
     * Initializes the user and pass variables.
     * @param username username
     * @param password password
     */
    public LoginMessage(String username, char[] password) {
        this.username = username;
        this.password = password;
    }

    /**
     * Gives the username
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Gives the password.
     * @return password
     */
    public char[] getPassword() {
        return password;
    }

}
