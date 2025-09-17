package ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private List<ParkingSpot> spots;

    public ParkingLot(int totalSpots) {
        spots = new ArrayList<>();
        for(int i=0;i<totalSpots;i++) {
            spots.add(new ParkingSpot(i.toString(),null,"Car"));
        }
    }

    public ParkingSpot findAvailable(String vehicleType) {
        for(ParkingSpot spot : spots) {
            if(!spot.isOccupied() && spot.getSpotType().equals(vehicleType)) {
                return spot;
            }
        }
        return null;
    }

    public ParkingSpot parkVehicle(Vehicle vehicle) {
        ParkingSpot freeSpot = findAvailable(vehicle.getVehicleType().toString());
        if(freeSpot != null) {
            freeSpot.parkVehicle(vehicle);
        }
    }

    public void vacate(ParkingSpot spot) {
        spot.vacate();
    }

}
