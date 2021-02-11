package com.company;

/**
 * @author Anastaia Akimova
 */
public class Operation {
    private static String name;

    public Operation() {
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Operation.name = name;
    }
}
