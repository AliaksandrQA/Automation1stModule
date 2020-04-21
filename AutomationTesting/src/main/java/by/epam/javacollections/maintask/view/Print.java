package by.epam.javacollections.maintask.view;


import by.epam.javacollections.maintask.bean.aircraft.Aircraft;

import java.util.List;

public class Print {
    public static void printAircraftByCapacity(int findPassengerCapacity) {
        System.out.println("Total passenger capacity is" + " " + findPassengerCapacity);
    }

    public static void printAircraftByCargoCapacity(int findCargoCargoCapacity) {
        System.out.println("Total Cargo capacity is" + " " + findCargoCargoCapacity);
    }

    public static void printAircraftByFlightRange(List<Aircraft> PlanesByFlightRange) {
        System.out.println("Sorted planes by parameters:" + " " + PlanesByFlightRange);

    }

    public static void printAircraftByParameters(List<Aircraft> findByByParameters) {
        System.out.println("Sorted planes by parameters:" + " " + findByByParameters);
    }
}

