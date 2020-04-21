package by.epam.javafundamental.maintask;

/*  Вывести заданное количество случайных чисел с переходом и без перехода на новую строку*/

import java.util.Random;

public class AutomationTask3 {
    public static void main(String[] args) {

        int [] arr = new int[10];
       int [] x = randomArr(arr);
        print(x);

    }
    public static int [] randomArr(int[] arr){
        Random random = new Random();
        for ( int i = 0; i <arr.length; i++){
            arr[i] = random.nextInt(100);
        }  return arr;
    }


    public static void print( int [] x){
        for (int i = 0; i < x.length; i++) {
           System.out.print(x[i] + " ");}
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
        }
    }


