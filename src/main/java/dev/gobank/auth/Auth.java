package dev.gobank.auth;

import dev.gobank.person.Person;

public class Auth {
    private String password;
    private String token;

    public Auth(){}

    public Auth(String password, String token) {
        this.password = password;
        this.token = token;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return token;
    }
}
