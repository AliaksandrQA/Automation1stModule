package by.epam.javacollections.maintask.logic;

import by.epam.javacollections.maintask.bean.aircraft.Aircraft;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Logic {

    public static int calculateTotalPassengerCapacity(List<Aircraft> aircrafts) {
        int totalPassengerCapacity = 0;
        for (int i = 0; i < aircrafts.size(); i++) {
            totalPassengerCapacity = totalPassengerCapacity + aircrafts.get(i).getAircraftCapacity();
        }
        return totalPassengerCapacity;
    }

    public static int calculateTotalCargoCapacity(List<Aircraft> aircrafts) {
        int totalCargoCapacity = 0;
        for (int i = 0; i < aircrafts.size(); i++) {
            totalCargoCapacity = totalCargoCapacity + aircrafts.get(i).getAircraftCargo();
        }
        return totalCargoCapacity;
    }


    public static List<Aircraft> sortPlanesByFlightRange(List<Aircraft> aircrafts) {

        aircrafts.sort(Comparator.comparing(Aircraft::getAircraftFlightRange));
        return aircrafts;


    }

    public static List<Aircraft> findSuitableAircraftByParameters(List<Aircraft> aircrafts, int aircraftCapacity, int aircraftCargo) {
        List<Aircraft> list = new ArrayList<>();
        for (Aircraft aircraft : aircrafts) {
            if ((aircraft.getAircraftCapacity() >= aircraftCapacity) && (aircraft.getAircraftCargo() >= aircraftCargo)) {
                list.add(aircraft);
            }
        }
        return list;
    }
}
