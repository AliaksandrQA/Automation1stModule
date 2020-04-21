package by.epam.javafundamental.obligatorytask;

/*  Вывести числа в порядке возрастания (убывания) значений их длины*/


import java.util.Scanner;

public class ObligatoryTask2 {
    public static void main(String[] args) throws Exception {
        String[] arr = new String[3];
        System.out.println("Enter three digits please");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            arr[i] = scanner.nextLine(); //присваиваем  значения в массив
        }

        sortArr(arr);
        printArr(arr);
    }


    public static String[] sortArr(String[] arr) {
        for (int i = arr.length - 1; i > 0; i--) { //Здесь происходит сортировка (сортировка пузырьком):
            for (int j = 0; j < i; j++) {

                if (arr[j].length() > arr[j + 1].length()) {  /*Сравниваем элементы попарно, если они имеют неправильный порядок, то меняем местами */
                    String tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void printArr(String[] arr) {
        System.out.println("The next digits have been sorted in increasing  order");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
