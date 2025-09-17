package ParkingLot;

public class VehicleFactory {

    public static Vehicle createVehicle(VehicleType vehicleType, String license, ParkingFeeStrategy feeStrategy) {
        switch(vehicleType) {
            case VehicleType.Car :
                Vehicle car = new Car(license, feeStrategy);
                return car;
                break;
        }
    }

}
