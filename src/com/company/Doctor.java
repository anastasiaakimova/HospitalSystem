package com.company;

//Врач может сделать Назначение Пациенту (процедуры, лекарства, операции).
public class Doctor {
    private String name;
    private Department department;

    public Doctor(String name, Department department) {
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
        return "Имя='" + name + '\'' +
                ", отдел=" + department +
                '}';
    }

    //назначены
    public static void scheduleOperation() {

    }

    public static void scheduleMedicine() {

    }

    public static void scheduleProcedure() {

    }
    //совершена операция

    public static void doOperation() {

    }

    // пациент выписан
    public static void goOut() {

    }
}
