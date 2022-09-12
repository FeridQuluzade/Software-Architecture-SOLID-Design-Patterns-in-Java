package designpattern.behavioral.visitor.example;

public interface ShoppingCardVisitor {

    double visit(Table table);

    double visit(Chair chair);

}
