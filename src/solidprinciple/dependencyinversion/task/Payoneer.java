package solidprinciple.dependencyinversion.task;

public class Payoneer implements PaymentMethod {

    @Override
    public void pay() {
        System.out.println("Paying with payoneer...");
    }

}
