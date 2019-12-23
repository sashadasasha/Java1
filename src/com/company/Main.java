package com.company;

public class Main {

    int number = 34000000;
    byte field = 127;
    short oneMoreNumber = -32768;
    long veryBigNumber = 354455650234234234L;
    double numberWithDigit = 35.6548;
    float pi = 3.14f;

    char symbol = 'e';

    boolean itsTrue = true;


    String name = "John";


    public static void main(String[] args) {
            System.out.println(operation(25, 7.8f, 34, 12.6f));
            System.out.println(twoNumbers(12, 6));
            System.out.println(whatThisNumberIs(-25));
            System.out.println(itsNegativeNumber(58));
            System.out.println(helloName("Вася"));
            System.out.println(whatIsThisYear(1200));
            System.out.println(whatIsThisYear(2012));
            System.out.println(whatIsThisYear(2100));
            System.out.println(whatIsThisYear(2015));

        }

     //3 задание

    public static float operation(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    //4 задание
    public static boolean twoNumbers (int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    //5 задание
    public static String whatThisNumberIs (int a) {
        if (a >= 0) {
            return "Это положительное число";
        } else {
            return "Это отрицательное число";
        }
    }

    //6 задание

    public static boolean itsNegativeNumber (int a) {
        return a < 0;
    }

    //7 задание

    public static String helloName (String name) {
        return "Привет, " + name + "!";
    }

    //8 задание

    public static String whatIsThisYear (int year) {
        if (year%4 == 0 && year%100 != 0 || year%400 == 0) {
            return "Это високосный год";
        } else {
            return "Это обычный год";
        }

    }
}

