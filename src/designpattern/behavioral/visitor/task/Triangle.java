package designpattern.behavioral.visitor.task;

public class Triangle implements Shape {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double accept(ShapeAreaVisitor areaVisitor) {
        return areaVisitor.visit(this);
    }

    public double getArea() {
        return (base * height) / 2;
    }

}
