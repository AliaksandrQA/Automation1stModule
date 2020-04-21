package by.epam.javafundamental.maintask;

/* Отобразить в окне консоли аргументы командной строки в обратном порядке*/

import java.util.Scanner;

public class AutomationTask2 {
    public static void main(String[] args) {
        int digit;

            @SuppressWarnings("resource")

            Scanner sc1 = new Scanner(System.in);

            System.out.println("Enter digits ");

            while (!sc1.hasNextInt()) {

                System.out.println("Only digits should be entered : ");

                sc1.next();
            }
        digit = sc1.nextInt();

        System.out.println("The next digits have been entered" + " "+ digit);
        int temp = 0;
        while (digit != 0) {
            temp = temp * 10 + (digit % 10);
            digit = digit / 10;
        }
        System.out.println("Reverse order of  entered number is"+" " + temp);

    }
}
