package com.saucedemo.models;

public class DataProducts {

    String firsname;
    String lastname;
    String postalCode;

    public DataProducts(String firsname, String lastname, String postalCode) {
        this.firsname = firsname;
        this.lastname = lastname;
        this.postalCode = postalCode;
    }

    public String getFirsname() {
        return firsname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPostalCode() {
        return postalCode;
    }
}
