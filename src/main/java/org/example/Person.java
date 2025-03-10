package org.example;

import java.sql.SQLOutput;

public class Person {

    String firstName;
    String lastName;
    int age;
    String city;
    double boy;
    double kilo;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person(String firstName, String lastName, int age, double boy, double kilo) {
        this(firstName, lastName, age);
        this.boy= boy;
        this.kilo = kilo;
    }
    public Person(String firstName, String lastName, int age, double boy, double kilo, String city) {
        this(firstName, lastName, age, boy, kilo);
        this.city = city;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }

    public static void main(String[] args) {

        Person person = new Person("John", "Doe", 20);
        System.out.println("Firstname: " + person.getFirstName());
        System.out.println("LastName: " + person.getLastName());
        System.out.println("Age: " + person.getAge());

        Person person2 = new Person("Jane", "Doe", 25, 1.75, 58);
        System.out.println("Firstname: " + person2.getFirstName());
        System.out.println("LastName: " + person2.getLastName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Is Teen?: " + person2.isTeen());

    }

}