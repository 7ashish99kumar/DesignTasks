package ParkingLot;

public class UpiPayment implements PaymentStrategy {

    @Override
    public double processPayment(double amount) {
        System.out.println("Processing upi : " + amount);
        return amount;
    }

}
