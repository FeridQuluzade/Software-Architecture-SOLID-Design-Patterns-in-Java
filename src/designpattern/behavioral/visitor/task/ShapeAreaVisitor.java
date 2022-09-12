package designpattern.behavioral.visitor.task;

public interface ShapeAreaVisitor {

    double visit(Circle circle);

    double visit(Rectangle rectangle);

    double visit(Triangle triangle);

}
