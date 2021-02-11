package com.company;

/**
 * @author Anastaia Akimova
 */
public class Doctor {
    private long id;
    private long doctorGenerator;
    private String name;
    private Department department;

    public Doctor(String name, Department department) {
        id = doctorGenerator++;
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return " имя: " + name + '\n' +
                " отдел: " + department;
    }

    //planned
    public void scheduleOperation(Person person, Operation operation) {
        System.out.println("Доктор " + getName() + " назначил операцию " + Operation.getName()
                + " для " + person.getName());

    }

    public void scheduleMedicine(Person person) {
        System.out.println("Доктор " + getName() + " назначил курс препоратов " + " для " + person.getName());
    }

    public void scheduleProcedure(Person person) {
        System.out.println("Доктор " + getName() + " назначил процедуру " + " для " + person.getName());
    }

    //doctor did  the operation
    public void doOperation(Person person) {
        System.out.println("Доктор " + getName() + " провел операцию " + Operation.getName() +
                " для: " + person.getName());
    }

    // patient is free
    public void goOut(Person person) {
        System.out.println("Доктор " + getName() + " выписал " + person.getName());
    }
}
