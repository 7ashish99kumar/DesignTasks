package ParkingLot;

public class Car extends Vehicle {

    public Car(String licensePlate, ParkingFeeStrategy parkingFeeStrategy) {
        super(licensePlate, VehicleType.Car, parkingFeeStrategy);
    }
}
