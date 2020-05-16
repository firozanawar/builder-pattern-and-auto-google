package com.firozanwar.builderpatternandautobygoogle.User;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class UserWitAutoValue {

    public abstract String firstName();

    public abstract String lastName();

    public static UserWitAutoValue with(String first, String last) {
        return new AutoValue_UserWitAutoValue(first, last);
    }

}
