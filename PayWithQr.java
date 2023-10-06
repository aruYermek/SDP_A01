package Task_2;

public class PayWithQr implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("You paid: " + amount + "with QR");
    }
}
