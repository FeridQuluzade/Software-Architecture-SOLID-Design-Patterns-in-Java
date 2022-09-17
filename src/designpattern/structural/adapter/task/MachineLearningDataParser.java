package designpattern.structural.adapter.task;

public class MachineLearningDataParser implements CsvParser {

    @Override
    public void parse() {
        System.out.println("Machine Learning data parser process start...");
    }

}
