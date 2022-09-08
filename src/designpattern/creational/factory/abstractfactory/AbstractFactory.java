package designpattern.creational.factory.abstractfactory;

import designpattern.creational.factory.abstractfactory.model.Car;

public interface AbstractFactory {

    Car getCar(String type);

}
