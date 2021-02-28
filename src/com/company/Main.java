package com.company;
/**
 * @author Anastaia Akimova
 */

import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {

        //create doctors
        Doctor pavel = new Doctor("Павел", Department.PARAMEDIC);
        Doctor maria = new Doctor("Мария", Department.SURGERY);
        Doctor natalia = new Doctor("Наталья", Department.RESUSCITATION);
        Doctor victor = new Doctor("Виктор", Department.GYNECOLOGY);
        Doctor daniel = new Doctor("Даниил", Department.CARDIOLOGY);
        Doctor klara = new Doctor("Клара", Department.NEUROLOGY);
        Doctor victoria = new Doctor("Виктория", Department.TRAUMATOLOGY);

        //create nurses
        Nurse daria = new Nurse("Дарья", Department.PARAMEDIC);
        Nurse elena = new Nurse("Елена", Department.NEUROLOGY);
        Nurse marina = new Nurse("Марина", Department.TRAUMATOLOGY);

        sayHello();

        for (int i = 0; i < 1; i++) {
            System.out.println("Введите имя пациента:");
            String name = new Scanner(System.in).nextLine();

            System.out.println("Ведите возраст пациента:");
            int age = 0;
            boolean inputError = true;

            while (inputError) {
                try {
                    age = new Scanner(System.in).nextInt();
                    inputError = false;

                } catch (NumberFormatException e) {
                    inputError = true;
                    System.out.println("Введите число!");
                } catch (InputMismatchException e) {
                    inputError = true;
                    System.out.println("Введите число!");
                }
            }

            System.out.println("Укажите болезнь или жалобы " + name + ":");
            String complaints = new Scanner(System.in).nextLine();

            System.out.println("Укажите аллергии пациента. Если таковых нет, напишите \" нет \"");
            String allergy = new Scanner(System.in).nextLine();
            int numOfDoctor;
            System.out.println("Выберите номер врача из списка:");
            try {
                System.out.println("1 " + pavel.toString());
                System.out.println("2 " + maria.toString());
                System.out.println("3 " + natalia.toString());
                System.out.println("4 " + victor.toString());
                System.out.println("5 " + daniel.toString());
                System.out.println("6 " + klara.toString());
                System.out.println("7 " + victoria.toString());
                numOfDoctor = new Scanner(System.in).nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Введите число!");
                continue;
            }
            boolean exitOfChoice = false;
            String doctorName = "";
            String nurseName = "";

            while (exitOfChoice == false) {

                switch (numOfDoctor) {
                    case 1: {
                        System.out.println("Вы выбрали врача:" + pavel.getName());
                        System.out.println("Ему ассистирует медсестра " + daria.getName());
                        exitOfChoice = true;
                        doctorName = pavel.getName();
                        nurseName = daria.getName();
                        break;
                    }
                    case 2: {
                        System.out.println("Вы выбрали врача:" + maria.getName());
                        System.out.println("Ему ассистирует медсестра " + daria.getName());
                        exitOfChoice = true;
                        doctorName = maria.getName();
                        nurseName = daria.getName();
                        break;
                    }
                    case 3: {
                        System.out.println("Вы выбрали врача:" + natalia.getName());
                        System.out.println("Ему ассистирует медсестра " + daria.getName());
                        exitOfChoice = true;
                        doctorName = maria.getName();
                        nurseName = daria.getName();
                        break;
                    }
                    case 4: {
                        System.out.println("Вы выбрали врача:" + victor.getName());
                        System.out.println("Ему ассистирует медсестра" + daria.getName());
                        exitOfChoice = true;
                        doctorName = maria.getName();
                        nurseName = daria.getName();
                        break;
                    }
                    case 5: {
                        System.out.println("Вы выбрали врача:" + daniel.getName());
                        System.out.println("Ему ассистирует медсестра " + marina.getName());
                        exitOfChoice = true;
                        doctorName = maria.getName();
                        nurseName = marina.getName();
                        break;
                    }
                    case 6: {
                        System.out.println("Вы выбрали врача:" + klara.getName());
                        System.out.println("Ему ассистирует медсестра " + elena.getName());
                        exitOfChoice = true;
                        doctorName = maria.getName();
                        nurseName = elena.getName();
                        break;
                    }
                    case 7: {
                        System.out.println("Вы выбрали врача:" + victoria.getName());
                        System.out.println("Ему ассистирует медсестра " + elena.getName());
                        exitOfChoice = true;
                        doctorName = maria.getName();
                        nurseName = elena.getName();
                        break;
                    }
                    default: {
                        System.out.println("Вы ввели неверное значение!");
                        System.out.println("Ведите значение от 1 до 7!");
                    }
                }
            }
            double rand = 1 + Math.random() * 100;
            switch (numOfDoctor) {
                case 1: {
                    //code for doctor pavel
                    Person person = new Person(name, age, complaints, pavel.getName(), allergy);
                    pavel.scheduleMedicine(person);
                    pavel.scheduleProcedure(person);
                    if (rand <= 50) {
                        daria.doProcedure(person);
                    } else {
                        daria.doMedicine(person);
                    }
                    if (rand <= 30) {
                        System.out.println("Пациент выздоровел");
                        pavel.goOut(person);
                    } else {
                        System.out.println("Пациент нарушал режим");
                        pavel.goOut(person);
                    }
                    writeFile(person);
                    break;
                }
                case 2: {
                    //code for doctor maria
                    Person person = new Person(name, age, complaints, pavel.getName(), allergy);
                    maria.scheduleMedicine(person);
                    maria.scheduleProcedure(person);
                    if (rand <= 50) {
                        daria.doProcedure(person);
                    } else {
                        daria.doMedicine(person);
                    }
                    if (rand <= 30) {
                        System.out.println("Пациент выздоровел");
                        maria.goOut(person);
                    } else {
                        System.out.println("Пациент нарушал режим");
                        maria.goOut(person);
                    }
                    writeFile(person);
                    break;
                }
                case 3: {
                    //code for Doctor natalia
                    Person person = new Person(name, age, complaints, pavel.getName(), allergy);
                    natalia.scheduleMedicine(person);
                    natalia.scheduleProcedure(person);
                    if (rand <= 50) {
                        daria.doProcedure(person);
                    } else {
                        daria.doMedicine(person);
                    }
                    if (rand <= 30) {
                        System.out.println("Пациент выздоровел");
                        natalia.goOut(person);
                    } else {
                        System.out.println("Пациент нарушал режим");
                        natalia.goOut(person);
                    }
                    writeFile(person);
                    break;
                }
                case 4: {
                    //code for Doctor victor
                    Person person = new Person(name, age, complaints, pavel.getName(), allergy);
                    victor.scheduleMedicine(person);
                    victor.scheduleProcedure(person);
                    if (rand <= 50) {
                        daria.doProcedure(person);
                    } else {
                        daria.doMedicine(person);
                    }
                    if (rand <= 30) {
                        System.out.println("Пациент выздоровел");
                        victor.goOut(person);
                    } else {
                        System.out.println("Пациент нарушал режим");
                        victor.goOut(person);
                    }
                    writeFile(person);
                    break;
                }
                case 5: {
                    //code for Doctor daniel
                    Person person = new Person(name, age, complaints, pavel.getName(), allergy);
                    daniel.scheduleMedicine(person);
                    daniel.scheduleProcedure(person);
                    if (rand <= 50) {
                        marina.doProcedure(person);
                    } else {
                        marina.doMedicine(person);
                    }
                    if (rand <= 30) {
                        System.out.println("Пациент выздоровел");
                        daniel.goOut(person);
                    } else {
                        System.out.println("Пациент нарушал режим");
                        daniel.goOut(person);
                    }
                    writeFile(person);
                    break;
                }
                case 6: {
                    //code for Doctor klara
                    Person person = new Person(name, age, complaints, pavel.getName(), allergy);
                    klara.scheduleMedicine(person);
                    klara.scheduleProcedure(person);
                    if (rand <= 50) {
                        elena.doProcedure(person);
                    } else {
                        elena.doMedicine(person);
                    }
                    if (rand <= 30) {
                        System.out.println("Пациент выздоровел");
                        klara.goOut(person);
                    } else {
                        System.out.println("Пациент нарушал режим");
                        klara.goOut(person);
                    }
                    writeFile(person);
                    break;
                }
                case 7: {
                    //code for Doctor victoria
                    Person person = new Person(name, age, complaints, pavel.getName(), allergy);
                    victoria.scheduleMedicine(person);
                    victoria.scheduleProcedure(person);
                    if (rand <= 50) {
                        elena.doProcedure(person);
                    } else {
                        elena.doMedicine(person);
                    }
                    if (rand <= 30) {
                        System.out.println("Пациент выздоровел");
                        victoria.goOut(person);
                    } else {
                        System.out.println("Пациент нарушал режим");
                        victoria.goOut(person);
                    }
                    writeFile(person);
                    break;
                }
                default:
                    throw new IllegalStateException("Unexpected value: " + doctorName);
            }
        }
    }

    public static void sayHello() {
        System.out.println("ВАС ПРИВЕТСТВУЕТ СИСТЕМА НАШЕЙ БОЛЬНИЦЫ!");
        System.out.println("Приступить к созданию карточки пациента: ");
    }

    public static void writeFile(Person person) {
        try (FileWriter writer = new FileWriter("patientArchive/" + person.getName() + ".txt", false)) {
            writer.write("Данные: " + person.getName());
            writer.write(person.toString());
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
