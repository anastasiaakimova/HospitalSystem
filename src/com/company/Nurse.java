package com.company;

/**
 * @author Anastaia Akimova
 */
public class Nurse extends Doctor {
    public Nurse(String name, Department department) {
        super(name, department);
    }

    public void doProcedure(Person person) {
        System.out.println("Медсестра " + getName() + " провела процедуру " + " для " + person.getName());
    }

    public void doMedicine(Person person) {
        System.out.println("Медсестра " + getName() + " выдаа медикаменты " + " для " + person.getName());
    }

    public void assistOperations(Person person, Doctor doctor) {
        System.out.println("Медсестра " + getName() + " ассистирует во время операции врачу " + doctor.getName()
                + " для " + person.getName());
    }
}
