package com.company;

public class Employee {

    private String names;
    private String rank;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Employee(String names, String rank, String email, String phone, double salary, int age) {
        this.names = names;
        this.rank = rank;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }

    public void getInfoEmployee() {
        System.out.println("ФИО: " + this.names +
                "\nДолжность: " + this.rank +
                "\nemail: " + this.email +
                "\nТелефон: " + this.phone +
                "\nЗарплата: " + this.salary +
                "\nВозраст: " + this.age
        );
    }

    public int getAge() {
        return this.age;
    }
}
