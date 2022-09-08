package designpattern.behavioral.strategy.task.solution;

public class ImageManager {

    private Renderer renderer;

    public void setDevice(Renderer renderer) {
        this.renderer = renderer;
    }

    public void execute(){
        renderer.showImage();
    }

}
