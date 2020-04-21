package by.epam.javaobjecttask;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ShopBase shop = new ShopBase(); // создаю объект класса ShopBase // - > заполняю клиентами

        View printList = new View(); // создаю объект для  метода вывода отсортированных массивов

        Logic sort = new Logic(); // создаю объект для  метода  сортировки

        shop.addCustomer(new Customer(1, "Ivanov", "Ivan", "Ivanovich", " 1 Sovetskaya str", 1, 10012344));

        shop.addCustomer(new Customer(23, "Petrov", "Grisha", "Petrovich", " 4 Lenina str", 2, 10077714));

        shop.addCustomer(
                new Customer(17, "Sidorov", "Valentin", "Aleksandrovich", " 8 Pobedy str", 3, 10032088));

        shop.addCustomer(new Customer(1003, "Gritsuk", "Maria", "Olehavna", "12 Pushkina str", 4, 10032234));

        shop.addCustomer(
                new Customer(347, "Starikov", " Aleksei", "Romanovich", "37 Khimica str", 5, 10087965));


        ArrayList<Customer> customers = shop.getBase(); // создаю  переменную customers типа ArrayList // вызываю геттер из класса ShopBase


        List<Customer>  p = Logic.getListBySurname(customers); // создаю переменную  p // вызываю метод getListBySurname передав полученный ранее через геттер  ArrayList<Customer> customers

        List<Customer> z = Logic.getListByAccountNumber(customers, 3, 5); // создаю переменную  z // вызываю метод getListBySurname передав полученный ранее через геттер  ArrayList<Customer> customers

        printList.printBase(p); // вызываю метод printBase передав отсортированный ранее массив
        printList.printBase(z); // вызываю метод printBase передав отсортированный ранее массив

    }

}