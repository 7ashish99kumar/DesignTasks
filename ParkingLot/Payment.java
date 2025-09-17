package ParkingLot;

public class Payment {

    private double amount;
    private PaymentStrategy strategy;

    public Payment(double amount, PaymentStrategy strategy) {
        this.amount = amount;
        this.strategy = strategy;
    }

    public void processPayment() {
        if(amount>0) {
            strategy.processPayment(amount);
        }
    }

}
