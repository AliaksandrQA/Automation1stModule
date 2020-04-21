package by.epam.javafundamental.obligatorytask;

/* Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину*/

import java.util.Scanner;

public class ObligatoryTask3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // ридер

        String line = scan.nextLine(); // переменная  String принимает значения ввёденных с клавы

        double average = 0; //

        String[] arr = line.split(" "); // разделить строки в  массиве  String
        for (String s : arr) { // for each
            average = average + s.length(); // average = длине массива
        }
        if (arr.length > 0) { // длина массива больше
            average = average / arr.length; // значение average делим на длину массива

            System.out.printf("The average length of entered digitsis: %.2f", average);
            System.out.println("\n Integers with length  more than average:");
            for (String s : arr) {
                if (s.length() > average) {
                    System.out.println(s + " Length: " + s.length());
                }
            }
            System.out.println("Integers with  length less than average:");
            for (String s : arr) {
                if (s.length() < average) System.out.println(s + " Length: " + s.length());
            }
        }
    }
}



