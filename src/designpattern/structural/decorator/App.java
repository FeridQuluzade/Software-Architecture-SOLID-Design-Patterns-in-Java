package designpattern.structural.decorator;

public class App {
    public static void main(String[] args) {
        Beverage b = new Sugar(new Milk(new PlainBeverage()));
    }
}
