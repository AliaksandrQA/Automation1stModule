package by.epam.javacollections.obligatorytask;
/* Ввести строки из файла, записать в список ArrayList. Выполнить сортировку строк, используя метод sort() из класса Collections*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) throws FileNotFoundException {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(new File("D:/Shakespeare.txt"));
        List<String> arrStr = new ArrayList<>();

        while (scan.hasNext()) {
            arrStr.add(scan.nextLine());
        }
        scan.close();
        Collections.sort(arrStr);

        for (String anArrStr : arrStr) {
            System.out.println(anArrStr);
        }
    }
}
