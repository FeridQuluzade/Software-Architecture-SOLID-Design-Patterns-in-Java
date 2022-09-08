package designpattern.creational.factory.abstractfactory;

import designpattern.creational.factory.abstractfactory.model.Car;
import designpattern.creational.factory.abstractfactory.model.ElectricFord;
import designpattern.creational.factory.abstractfactory.model.ElectricToyota;

public class ElectricCarFactory implements AbstractFactory {

    @Override
    public Car getCar(String type) {
        if ("FORD".equals(type)) {
            return new ElectricFord();
        } else if ("TOYOTA".equals(type)) {
            return new ElectricToyota();
        }
        throw new RuntimeException("Unsupported card model...");
    }

}
