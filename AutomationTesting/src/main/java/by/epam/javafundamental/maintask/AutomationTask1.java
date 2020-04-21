package by.epam.javafundamental.maintask;

/*Приветствовать любого пользователя при вводе его имени через командную строку*/

import java.util.Scanner;

public class AutomationTask1 {
    public static void main(String[] args) {
        String name;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name please");
        name = sc.next();
        System.out.println("Hello there" + " "+ name + "!");


    }
}
