package controller;

public class LoginMessage implements Message {
    String username;
    char[] password;

    public LoginMessage(String username, char[] password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public char[] getPassword() {
        return password;
    }

}
