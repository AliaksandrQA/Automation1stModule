package by.epam.javacollections.maintask.bean.aircraft;



public abstract class Aircraft  {

    private String aircraftName;
    private int aircraftBoardNumber;
    private int aircraftFlightRange;
    private int aircraftCapacity;
    private int aircraftCargo;

    public Aircraft() {
    }

    public Aircraft(String aircraftName, int aircraftBoardNumber, int aircraftFlightRange, int aircraftCapacity, int aircraftCargo) {
        this.aircraftName = aircraftName;
        this.aircraftBoardNumber = aircraftBoardNumber;
        this.aircraftFlightRange = aircraftFlightRange;
        this.aircraftCapacity = aircraftCapacity;
        this.aircraftCargo = aircraftCargo;
    }

    public String getAircraftName() {
        return aircraftName;
    }

    public void setAircraftName(String aircraftName) {
        this.aircraftName = aircraftName;
    }

    public int getAircraftBoardNumber() {
        return aircraftBoardNumber;
    }

    public void setAircraftBoardNumber(int aircraftBoardNumber) {
        this.aircraftBoardNumber = aircraftBoardNumber;
    }

    public int getAircraftFlightRange() {
        return aircraftFlightRange;
    }

    public void setAircraftFlightRange(int aircraftFlightRange) {
        this.aircraftFlightRange = aircraftFlightRange;
    }

    public int getAircraftCapacity() {
        return aircraftCapacity;
    }

    public void setAircraftCapacity(int aircraftCapacity) {
        this.aircraftCapacity = aircraftCapacity;
    }

    public int getAircraftCargo() {
        return aircraftCargo;
    }

    public void setAircraftCargo(int aircraftCargo) {
        this.aircraftCargo = aircraftCargo;
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "aircraftName='" + aircraftName + '\'' +
                ", aircraftBoardNumber=" + aircraftBoardNumber +
                ", aircraftFlightRange=" + aircraftFlightRange +
                ", aircraftCapacity=" + aircraftCapacity +
                ", aircraftCargo=" + aircraftCargo +
                '}';
    }
}