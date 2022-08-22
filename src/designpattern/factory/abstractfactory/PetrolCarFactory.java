package designpattern.factory.abstractfactory;

import designpattern.factory.abstractfactory.model.Car;
import designpattern.factory.abstractfactory.model.PetrolFord;
import designpattern.factory.abstractfactory.model.PetrolToyota;

public class PetrolCarFactory implements AbstractFactory {

    @Override
    public Car getCar(String type) {
        if ("FORD".equals(type)) {
            return new PetrolFord();
        } else if ("TOYOTA".equals(type)) {
            return new PetrolToyota();
        }
        throw new RuntimeException("Unsupported car model...");
    }

}
