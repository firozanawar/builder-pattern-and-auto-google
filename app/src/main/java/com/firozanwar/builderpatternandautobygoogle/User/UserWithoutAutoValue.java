package com.firozanwar.builderpatternandautobygoogle.User;

public class UserWithoutAutoValue {

    public String firstName;
    public String lastName;

    public static UserWithoutAutoValue with(String first, String last) {
        UserWithoutAutoValue user = new UserWithoutAutoValue();
        user.firstName = first;
        user.lastName = last;
        return user;
    }
}
