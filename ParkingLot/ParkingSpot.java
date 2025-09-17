package ParkingLot;

public class ParkingSpot {

    String spotId;
    Vehicle vehicle;
    boolean isOccupied;
    String spotType;

    public ParkingSpot(String spotId, Vehicle vehicle, String spotType) {
        this.spotId = spotId;
        this.vehicle = vehicle;
        this.isOccupied = false;
        this.spotType = spotType;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean canParkVehicle(Vehicle vehicle) {
        if(spotType.equals(vehicle.getVehicleType().toString())) {
            return true;
        }
        return false;
    }

    public void parkVehicle(Vehicle vehicle) {
        if(isOccupied) {
            throw new IllegalStateException("Vehicle already occupied");
        }
        if(!canParkVehicle(vehicle)) {

        }
        this.vehicle = vehicle;
        this.isOccupied = true;
    }

    public void vacate() {
        if(isOccupied) {
            this.vehicle = null;
            this.isOccupied = false;
        } else {
            throw new IllegalStateException("Spot vacant");
        }
    }

}
