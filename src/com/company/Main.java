package com.company;

import java.util.Scanner;

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

        for (int i = 0; i < 1; i++){
            System.out.println("Введите имя пациента:");
            String name = new Scanner(System.in).nextLine();

            System.out.println("Ведите возраст пациента:");
            int age = new Scanner(System.in).nextInt();

            System.out.println("Укажите болезнь или жалобы " + name + ":");
            String complaints = new Scanner(System.in).nextLine();

            System.out.println("Укажите аллергии пациента. Если таковых нет, напишите \" нет \"");
            String allergy = new Scanner(System.in).nextLine();

            System.out.println("Выберите лечащего врача" + " \n " + "Выберите номер врача из списка:") ;
            System.out.println("1. " + pavel.toString());
            System.out.println("2. " + maria.toString());
            System.out.println("3. " + natalia.toString());
            System.out.println("4. " + victor.toString());
            System.out.println("5. " + daniel.toString());
            System.out.println("6. " + klara.toString());
            System.out.println("7. " + victoria.toString());

        }
    }

    public static void sayHello() {
        System.out.println("ВАС ПРИВЕТСТВУЕТ СИСТЕМА НАШЕЙ БОЛЬНИЦЫ!");
        System.out.println("Приступить к созданию карточки пациента: ");

    }
}
