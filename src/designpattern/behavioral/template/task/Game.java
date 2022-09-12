package designpattern.behavioral.template.task;

public abstract class Game {

    protected abstract void initializeGame();

    protected abstract void playing();

    protected abstract void showResults();

    public final void play() {
        initializeGame();
        playing();
        showResults();
    }

}
