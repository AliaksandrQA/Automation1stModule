package by.epam.javafundamental.maintask;

/*  Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.*/

import java.util.Scanner;

public class AutomationTask5 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month's number: ");
        int n = sc.nextInt();
        setMonth(n);
    }

    static void setMonth(int a)   {
        String[] month = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        String s;
        try {
            s = month[a - 1];
            System.out.println("Entered month is " + s + ".");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Entered month number doesn't exist");
        }
    }
}
