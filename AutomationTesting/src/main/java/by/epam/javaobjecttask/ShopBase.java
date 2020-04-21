package by.epam.javaobjecttask;

import java.util.ArrayList;

public class ShopBase {

    private ArrayList<Customer> base = new ArrayList<Customer>();

    public ShopBase() {}; // конструктор без параметров

    public ShopBase(ArrayList<Customer> base) { // конструктор с параметрами

        this.base = base;
    }

    public ArrayList<Customer> getBase() { // геттер для ArrayList
        return base;
    }

    public void setBase(ArrayList<Customer> base) { // сеттер для ArrayList
        this.base = base;
    }

    public void addCustomer( Customer client) { // метод для добавления клиентов в base
        base.add(client);
    }
}
