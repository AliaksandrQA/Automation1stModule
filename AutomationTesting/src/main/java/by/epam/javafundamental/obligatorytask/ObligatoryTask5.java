package by.epam.javafundamental.obligatorytask;

/*Найти количество чисел, содержащих только четные цифры, а среди оставшихся — количество чисел с равным числом четных и нечетных цифр */

import java.util.ArrayList;
import java.util.Scanner;

public class ObligatoryTask5 {
    public static void main(String[] args) {

        int n;
        System.out.println("How many digits should be processed?");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int[] numbers = new int[n]; // массив вводимых чисел

        int even = 0; // кол-во четных цифр в числе
        int odd = 0; // кол-во нечетных

        int evenResult = 0; // итоговое кол-во чисел, состоящих ТОЛЬКО из четных цифр
        int wholeNumberResult = 0; // а тут равных четных-нечетных


        // будем обрабатыать и считать число и нужную нам инфу, сразу после ввода пользователя. по итогу просто выведем отчет
        for (int s = 0; s < n; s++) { // s меньше вводимого числа

            // вводим число
            System.out.println("Number " + (s + 1) + " : ");
            numbers[s] = sc.nextInt(); // заносим число в массив

            // раскладываем его на динамический массив цифр
            ArrayList<Integer> dynArr = new ArrayList<>();
            while (numbers[s] != 0) { // пока занесенное число не равно 0
                dynArr.add(numbers[s] % 10); // добавь его в динамический массив (отсекая от левой части)
                numbers[s] /= 10; // убрать крайне правое число
            }

            // проверяем каждую цифру на четность и увеличиваем соответствующий счетчик
            for (int i = 0; i < dynArr.size(); i++) {
                if (dynArr.get(i) % 2 == 0) even++;
                else odd++;
            }

            // если кол-во четных цифр = кол-ву цифр в чисел
            if (even == dynArr.size()) evenResult++; // это первое условие
            else if (even == odd) wholeNumberResult++; // а если четные = нечетным - второе

            // обнулим счетчики
            even = 0;
            odd = 0;

            // дин.массив " ArrayList<Integer> qiwri" специально задается внутри цикла, чтобы при каждом новом вводимом числе он пересоздавался
        }

        System.out.println("Total amount of even numbers is " + evenResult);
        System.out.println("Total amount of numbers where even numbers equal to odd numbers is " + wholeNumberResult);
    }
}
