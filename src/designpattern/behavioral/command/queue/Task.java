package designpattern.behavioral.command.queue;

public class Task {

    private int id;

    public Task(int id) {
        this.id = id;
    }

    public void solveProblem() {
        System.out.println("Solving the problem with ID: " + id);
    }

}
