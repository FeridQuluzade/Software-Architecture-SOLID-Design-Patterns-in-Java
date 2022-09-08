package designpattern.creational.factory.abstractfactory;

import designpattern.creational.factory.abstractfactory.model.Car;

public class App {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = FactoryProducer.getFactory("ELECTRIC");
        Car ford = abstractFactory.getCar("FORD");
        ford.assembe();

    }
}
