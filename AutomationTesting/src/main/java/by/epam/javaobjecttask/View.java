package by.epam.javaobjecttask;

import java.util.List;

public class View {
    public void printBase(List<Customer> base) {
        for (Customer client : base) {
            System.out.println(client.toString());
        }

        System.out.println();
    }

}

