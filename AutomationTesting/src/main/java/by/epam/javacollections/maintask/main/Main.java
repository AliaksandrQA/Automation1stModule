package by.epam.javacollections.maintask.main;

import by.epam.javacollections.maintask.bean.aircraft.Aircraft;
import by.epam.javacollections.maintask.bean.aircraft.CargoAircraft;
import by.epam.javacollections.maintask.bean.aircraft.CommercialAircraft;
import by.epam.javacollections.maintask.bean.aircraft.PassengerAircraft;
import by.epam.javacollections.maintask.bean.airline.Airline;
import by.epam.javacollections.maintask.logic.Logic;
import by.epam.javacollections.maintask.view.Print;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Airline internationalAirline = new Airline("Sherbet");


        internationalAirline.addAircraft(new PassengerAircraft("AirbusA318", 318, 5600, 100, 50));
        internationalAirline.addAircraft(new PassengerAircraft("AirbusA320", 320, 5900, 150, 65));
        internationalAirline.addAircraft(new PassengerAircraft("AirbusA323", 323, 6200, 165, 75));
        internationalAirline.addAircraft(new CargoAircraft("AN-70", 789, 6000, 10, 200));
        internationalAirline.addAircraft(new CargoAircraft("AN-77", 863, 7500, 13, 300));
        internationalAirline.addAircraft(new CargoAircraft("AN-83", 1023, 6800, 5, 400));
        internationalAirline.addAircraft(new CommercialAircraft("Fly-100", 777, 2500, 10, 10));
        internationalAirline.addAircraft(new CommercialAircraft("Fly-150", 1777, 2700, 10, 25));

        List<Aircraft> aircrafts = internationalAirline.getAircrafts();


        int findPassengerCapacity = Logic.calculateTotalPassengerCapacity(aircrafts);
        int findCargoCargoCapacity = Logic.calculateTotalCargoCapacity(aircrafts);
        List<Aircraft> PlanesByFlightRange = Logic.sortPlanesByFlightRange(aircrafts);
        List<Aircraft> findByByParameters = (List<Aircraft>) Logic.findSuitableAircraftByParameters(aircrafts, 10, 50);


        Print.printAircraftByCapacity(findPassengerCapacity);
        Print.printAircraftByCargoCapacity(findCargoCargoCapacity);
        Print.printAircraftByFlightRange(PlanesByFlightRange);
        Print.printAircraftByParameters(findByByParameters);

    }
}
