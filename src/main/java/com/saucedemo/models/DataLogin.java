package com.saucedemo.models;

public class DataLogin {

    String user;
    String password;

    public DataLogin(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
