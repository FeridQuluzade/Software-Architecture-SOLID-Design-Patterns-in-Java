package designpattern.behavioral.visitor.example;

public class ShoppingCard implements ShoppingCardVisitor {

    @Override
    public double visit(Table table) {
        return table.getPrice();
    }

    @Override
    public double visit(Chair chair) {
        return chair.getPrice();
    }

}
