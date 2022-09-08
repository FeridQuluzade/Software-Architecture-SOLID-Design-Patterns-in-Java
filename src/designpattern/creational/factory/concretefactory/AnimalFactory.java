package designpattern.creational.factory.concretefactory;

import designpattern.creational.factory.concretefactory.model.Animal;
import designpattern.creational.factory.concretefactory.model.Cat;
import designpattern.creational.factory.concretefactory.model.Dog;
import designpattern.creational.factory.concretefactory.model.Lion;
import designpattern.creational.factory.concretefactory.model.Tiger;

public class AnimalFactory {

    public static Animal getAnimal(AnimalType animalType) {
        if (AnimalType.CAT.equals(animalType)) {
            return new Cat();
        } else if (AnimalType.TIGER.equals(animalType)) {
            return new Tiger();
        } else if (AnimalType.LION.equals(animalType)) {
            return new Lion();
        } else if (AnimalType.DOG.equals(animalType)) {
            return new Dog();
        }
        throw new RuntimeException("unsupported object type: " + animalType);
    }

}
