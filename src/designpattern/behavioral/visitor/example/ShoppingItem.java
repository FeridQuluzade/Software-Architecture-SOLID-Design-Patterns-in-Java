package designpattern.behavioral.visitor.example;

public interface ShoppingItem {

    double accept(ShoppingCardVisitor visitor);

}
