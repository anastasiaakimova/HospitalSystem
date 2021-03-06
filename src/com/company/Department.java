package com.company;

/**
 * @author Anastaia Akimova
 */
public enum Department {
    PARAMEDIC("PM"), SURGERY("SG"), RESUSCITATION("RS"),
    GYNECOLOGY("GN"), CARDIOLOGY("CR"), NEUROLOGY("NE"),
    TRAUMATOLOGY("TR");

    private String abbrevitation;

    public String getAbbrevitation() {
        return abbrevitation;
    }

    Department(String abbrevitation) {
        this.abbrevitation = abbrevitation;
    }

}
