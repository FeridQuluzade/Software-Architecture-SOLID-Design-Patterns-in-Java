package designpattern.factory.abstractfactory;

import designpattern.factory.abstractfactory.model.Car;

public class App {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = FactoryProducer.getFactory("ELECTRIC");
        Car ford = abstractFactory.getCar("FORD");
        ford.assembe();

    }
}
