package designpattern.behavioral.observer.example;

public interface Subject {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyAllObservers();

}
