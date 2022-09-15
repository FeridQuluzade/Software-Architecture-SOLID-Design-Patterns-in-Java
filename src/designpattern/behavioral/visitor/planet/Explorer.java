package designpattern.behavioral.visitor.planet;

public interface Explorer {

    void visit(Mercury mercury);
    void visit(Mars mars);
    void visit(Saturn saturn);

}
