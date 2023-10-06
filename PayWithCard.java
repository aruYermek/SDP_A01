package Task_2;

public class PayWithCard implements PaymentStrategy{
    private String cardNumber;
    public PayWithCard(String cardNumber){
        this.cardNumber=cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("You paid: " + amount + " with card: " + cardNumber);
    }
}

