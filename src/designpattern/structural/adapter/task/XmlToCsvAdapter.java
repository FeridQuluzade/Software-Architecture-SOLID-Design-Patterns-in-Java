package designpattern.structural.adapter.task;

public class XmlToCsvAdapter implements CsvParser {

    private StackMarketDataParser stackMarketDataParser;

    public XmlToCsvAdapter(StackMarketDataParser parser) {
        this.stackMarketDataParser = parser;
    }


    @Override
    public void parse() {
        stackMarketDataParser.parseXml();
    }
}
