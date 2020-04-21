package by.epam.javafundamental.maintask;

/* Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.*/

import java.util.Scanner;

public class AutomationTask4 {
    public static void main(String[] args) {
        int sum;
        int multy;
        int integer;

        sum = 0;
        multy = 1;
        @SuppressWarnings("resource")

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers: ");

        integer = sc.nextInt();

        multy(integer);
        sum(integer);
    }

    public static void multy(int integer) {
        int multy = 1;

        while (integer != 0) {
            multy = multy * (integer % 10);
            integer = integer / 10;
        }
        System.out.println("The multiplication of entered integers is  " + " " + multy);


    }

    public static void sum(int integer) {
        int sum = 0;
        while (integer != 0) {
            sum = sum + integer % 10;
            integer = integer / 10;
        }
        System.out.println("The sum of entered integers is  " + " " + sum);
    }

}