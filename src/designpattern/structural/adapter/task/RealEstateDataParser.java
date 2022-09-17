package designpattern.structural.adapter.task;

public class RealEstateDataParser implements CsvParser {

    @Override
    public void parse() {
        System.out.println("Reas estate data parsing...");
    }

}
