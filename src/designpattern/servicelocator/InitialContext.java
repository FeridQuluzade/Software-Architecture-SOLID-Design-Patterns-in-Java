package designpattern.servicelocator;


public class InitialContext {

    public Service lookup(String jndiName) {
        switch (jndiName) {
            case DatabaseService.NAME:
                return new DatabaseService();
            case MessagingService.NAME:
                return new MessagingService();
            default:
                return null;
        }
    }

}
