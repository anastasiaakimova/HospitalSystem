package com.company;

public enum Sex {
    MALE("M"), FEMALE("F");

    private String abbrevitation;

    public String getAbbrevitation() {
        return abbrevitation;
    }

    Sex(String abbrevitation) {
        this.abbrevitation = abbrevitation;
    }
}
