package designpattern.behavioral.template.example;

public class App {

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 7};
        Algorithm algorithm = new SelectionSort(nums);
        algorithm.sort();
    }

}
