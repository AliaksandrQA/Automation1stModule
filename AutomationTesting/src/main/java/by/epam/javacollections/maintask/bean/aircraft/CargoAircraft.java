package by.epam.javacollections.maintask.bean.aircraft;

public class CargoAircraft extends Aircraft {
    public CargoAircraft() {
        super();
    }

    public CargoAircraft(String aircraftName, int aircraftBoardNumber, int aircraftFlightRange, int aircraftCapacity, int aircraftCargo) {
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
