package designpattern.behavioral.observer.task;

public interface Subject {

    void addObserver(Observer observer);

    void notifyObservers();

}
