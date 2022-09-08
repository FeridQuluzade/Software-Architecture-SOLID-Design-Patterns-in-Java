package designpattern.behavioral.strategy.task;

import designpattern.behavioral.strategy.task.solution.ImageManager;
import designpattern.behavioral.strategy.task.solution.TVRenderer;

public class App {

    public static void main(String[] args) {
        ImageManager imageManager = new ImageManager();
        imageManager.setDevice(new TVRenderer());
        imageManager.execute();
    }

}
