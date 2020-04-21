package by.epam.javaobjecttask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Logic {
    public static List<Customer> getListBySurname(ArrayList<Customer> base) {

        List<Customer> list = new ArrayList<>(base);
        Collections.sort(list, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getSurname().compareToIgnoreCase(o2.getSurname());
            }
        });
        return list;
    }

    public static List<Customer> getListByAccountNumber(ArrayList<Customer> base, int start, int finish) {

        List<Customer> list = new ArrayList<>();

        for (Customer c : base) {
            if (c.getCreditCardNum() >= start && c.getCreditCardNum() <= finish) {
                list.add(c);
            }

        }
        return list;
    }

}
