package designpattern.factory.concretefactory;

import designpattern.factory.concretefactory.model.Animal;

public class App {

    public static void main(String[] args) {
        Animal animal = AnimalFactory.getAnimal(AnimalType.CAT);
        animal.eat();
    }

}
