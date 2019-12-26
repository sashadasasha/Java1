package com.company;

<<<<<<< HEAD
import java.util.Arrays;

public class Main {

    static int nums [] = {0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 0};
    static int nums2 [] = {7, 12, 3, 1};
    static int arr [] = {34, 5, 6, 0, 0, 13, 17, 8, 2};
    static int arr2 [] = {1, 2, 3, 4, 5};

    public static void main(String[] args) {
        System.out.println(changes(nums));
        System.out.println(step3());
        System.out.println(multiply2());
        System.out.println(diagonal());
        System.out.println(maxMin());
        System.out.println(checkBalance(nums));
        System.out.println(checkBalance(nums2));
        System.out.println(move(arr, 3));
        System.out.println(move(arr2, -2));
        System.out.println(move(arr, 0));
    }

    //Задание 1
    public static String changes (int [] arr) {
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        return Arrays.toString(arr);
    }
    //Задание 2
    public static String step3 () {
        int [] arr = new int [8];
        for (int i = 0, j = 0; i < arr.length; i ++, j += 3) {
            arr[i] = j;
        }
        return Arrays.toString(arr);
    }
    //Задание 3
    public static String multiply2 () {
        int arr [] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i ++ ) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        return Arrays.toString(arr);
    }

    //Задание 4
    public static String diagonal () {
        int [][] table = new int [7][7];
        for (int i = 0; i < table.length; i ++ ) {
            for (int j = 0; j < table.length; j ++) {
                if (i == j) {
                    table[i][j] = 1;
                }
            }
        }

        int j = table.length-1;
        for (int i = 0; i <table.length; i ++) {
            table[i][j] = 1;
            j--;
        }
        return Arrays.deepToString(table);
    }

    //Задание 5

    public static String maxMin () {
        int arr [] = {13, 44, 23, 2, 35, 54, 234234, 345, 23, 67, 8, 11, 3434};
        int max = arr[0];
        int indexMax = 0;
        int min = arr[0];
        int indexMin = 0;
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] > max) {
                max = arr[i];
                indexMax = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                indexMin = i;
            }
        }
        return "Максимальное число в массиве: " + max + ". Его индекс - " + indexMax + "\n" +
                "Минимальное число в массиве: " + min + ". Его индекс - " + indexMin;
    }

    // Задание 6
    public static boolean checkBalance (int [] arr) {
        int sumLeft = 0;
        int sumRight = Arrays.stream(arr).sum();

        for (int i = 0; i < arr.length; i ++ ) {
            sumLeft += arr[i];
            sumRight -= arr[i];
            if (sumLeft == sumRight) {
                return true;
            }
        }
        return false;
    }

    //Задание 7
    public static String move (int[] arr, int n) {

        if (n > 0) {
            for (int i = n; i > 0; i--) {
                int lastValue = arr[arr.length - 1];
                for (int j = 0; j < arr.length; j++) {
                    int currentValue = arr[j];
                    arr[j] = lastValue;
                    lastValue = currentValue;
                }
            }
        } else if (n < 0) {
            for (int i = n; i < 0; i++) {
                int firstValue = arr[0];
                for (int j = arr.length - 1; j >= 0; j--) {
                    int currentValue = arr[j];
                    arr[j] = firstValue;
                    firstValue = currentValue;
                }
            }
        } else {
            return "Массив останется прежним - значение сдвига = 0";
        }
        return Arrays.toString(arr);
    }
}
=======
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

>>>>>>> a138cd559b8be1650cba34adfff168607c8b3e8f
