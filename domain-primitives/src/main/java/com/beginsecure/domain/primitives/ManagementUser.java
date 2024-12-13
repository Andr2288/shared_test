package com.beginsecure.domain.primitives;

public class ManagementUser {

    private String firstName;
    private String lastName;

    public String getInfo() {
        String info = "FN ---" + firstName
                + "\nLN ---" + lastName;

        return info;
    }

    public ManagementUser(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}




