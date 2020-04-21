package by.epam.javacollections.maintask.bean.aircraft;

public class CommercialAircraft extends Aircraft {

    public CommercialAircraft() {
        super();
    }

    public CommercialAircraft(String aircraftName, int aircraftBoardNumber, int aircraftFlightRange, int aircraftCapacity, int aircraftCargo) {
        super(aircraftName, aircraftBoardNumber, aircraftFlightRange, aircraftCapacity, aircraftCargo);
    }

    @Override
    public int getAircraftCargo() {
        return super.getAircraftCargo();
    }

    @Override
    public int getAircraftCapacity() {
        return super.getAircraftCapacity();
    }
}
