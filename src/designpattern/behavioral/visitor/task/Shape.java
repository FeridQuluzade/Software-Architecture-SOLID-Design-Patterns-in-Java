package designpattern.behavioral.visitor.task;

public interface Shape {

    double accept(ShapeAreaVisitor areaVisitor);

}
