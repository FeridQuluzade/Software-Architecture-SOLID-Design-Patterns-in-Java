package designpattern.factory.abstractfactory;

import designpattern.factory.abstractfactory.model.Car;

public interface AbstractFactory {

    Car getCar(String type);

}
