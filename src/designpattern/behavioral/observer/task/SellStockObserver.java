package designpattern.behavioral.observer.task;

public class SellStockObserver implements Observer {

    @Override
    public void update(float price) {
        if (105 > price) {
            System.out.println("Selling stock because price is too high...");
        }
    }

}
