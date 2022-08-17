package dependencyinversion.task;

public class PayPal implements PaymentMethod {

    @Override
    public void pay() {
        System.out.println("Paying with paypal...");
    }

}
