package by.epam.javacollections.obligatorytask;
/*   Ввести число, занести его цифры в стек. Вывести число, у которого цифры идут в обратном порядке*/

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class Task2 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        int n;
        Stack stack = new Stack();
        n = 0;
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        try {
            n = scan.nextInt();

        } catch (InputMismatchException fg) {
            System.out.println("Number hasn't been entered. Try again");
        }

        char[] enteredNumbers = String.valueOf(n).toCharArray();
        for (char num : enteredNumbers) {
            stack.push(num);
        }

        while (!stack.empty()) {
            char stackNum;
            stackNum = (Character) stack.pop();
            System.out.print(stackNum);
        }
    }

    }


