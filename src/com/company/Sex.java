package com.company;
/**
 * @author Anastaia Akimova
 */
public enum Sex {
    MALE("M"), FEMALE("F");

    private String abbreviation;

    public String getAbbreviation() {
        return abbreviation;
    }

    Sex(String abbreviation) {
        this.abbreviation = abbreviation;
    }
}
