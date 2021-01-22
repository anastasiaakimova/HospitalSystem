package com.company;
/*
 * created by anastasiaakimova
 */
public class Person {
    private long id;
    private long generator;
    private String name;
    private int age;
    private String complaints;
    private String doctor;
    private String allergy;

    public Person(long id, String name, int age, String complaints, String doctor, String allergy) {
        this.id = generator++;
        this.name = name;
        this.age = age;
        this.complaints = complaints;
        this.doctor = doctor;
        this.allergy = allergy;
    }

    @Override
    public String toString() {
        return "\n Номер пациента:" + id +
                "\n Имя:" + name +
                "\n Возраст:" + age +
                "\n Жалобы:" + complaints +
                "\n Лечащий врач" + doctor +
                "\n Аллергия: " + allergy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getComplaints() {
        return complaints;
    }

    public void setComplaints(String complaints) {
        this.complaints = complaints;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }

}
