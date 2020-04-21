package by.epam.javacollections.maintask.bean.airline;

import by.epam.javacollections.maintask.bean.aircraft.Aircraft;

import java.util.ArrayList;
import java.util.List;


public class Airline {
    private  String airLineName;
    List<Aircraft> aircrafts = new ArrayList<Aircraft>();

    public Airline() {
    }

    public Airline(String airLineName, List<Aircraft> aircrafts) {
        this.airLineName = airLineName;
        this.aircrafts = aircrafts;
    }

    public List<Aircraft> getAircrafts() {
        return aircrafts;
    }

    public void setAircrafts(List<Aircraft> aircrafts) {
        this.aircrafts = aircrafts;
    }

    public Airline(String airLineName) {
        this.airLineName = airLineName;
    }

    public String getAirLineName() {
        return airLineName;
    }

    public void setAirLineName(String airLineName) {
        this.airLineName = airLineName;
    }
    public void addAircraft(Aircraft aircraft) {
        aircrafts.add(aircraft);
    }

}
