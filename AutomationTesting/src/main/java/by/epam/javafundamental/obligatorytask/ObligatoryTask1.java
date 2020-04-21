package by.epam.javafundamental.obligatorytask;

/*Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.*/

import java.util.Scanner;

public class ObligatoryTask1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many digits should be processed?");
        int n = scan.nextInt();
        System.out.println( "Please enter"+" "+ n+" "+"digits");

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.next();
        }

        findMinMax(arr);
    }

    public static void findMinMax(String[] arr) {
        int min = arr[0].length(); // значение длины  1 го элемента полученного массива в переменной
        int max = 0;

        for (String value : arr) { // элементы массива типа стринг // рандомное имя массива в for each// : передаваемый массив
            if (value.length() > max) { // если длина элемента массива больше
                max = value.length();
            } else if (value.length() < min) { // если длина элемента массива меньше
                min = value.length();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() == max) {
                System.out.println("Max number is " + arr[i] + " his length " + arr[i].length());
            } else if (arr[i].length() == min) {
                System.out.println("Min number is " + arr[i] + " his length " + arr[i].length());
            }
        }
    }
}