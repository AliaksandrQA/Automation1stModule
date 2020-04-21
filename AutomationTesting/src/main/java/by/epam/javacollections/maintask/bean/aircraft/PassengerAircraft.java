package by.epam.javacollections.maintask.bean.aircraft;

public class PassengerAircraft extends Aircraft {
    public PassengerAircraft() {

    }

    public PassengerAircraft (String aircraftName, int aircraftBoardNumber, int aircraftFlightRange, int aircraftCapacity, int aircraftCargo) {
        super(aircraftName, aircraftBoardNumber, aircraftFlightRange, aircraftCapacity, aircraftCargo);
    }

    @Override
    public int getAircraftCapacity() {
        return super.getAircraftCapacity();
    }

    @Override
    public int getAircraftCargo() {
        return super.getAircraftCargo();
    }
}
