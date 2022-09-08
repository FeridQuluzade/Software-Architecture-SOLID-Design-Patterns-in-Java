package designpattern.creational.factory.concretefactory;

import designpattern.creational.factory.concretefactory.model.Animal;

public class App {

    public static void main(String[] args) {
        Animal animal = AnimalFactory.getAnimal(AnimalType.CAT);
        animal.eat();
    }

}
