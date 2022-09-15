package designpattern.behavioral.visitor.planet;

public class Mars implements Planet {

    @Override
    public void accept(Explorer explorer) {
        explorer.visit(this);
    }

}
