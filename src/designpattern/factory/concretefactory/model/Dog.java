package designpattern.factory.concretefactory.model;

public class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

}
