package StructuralPatterns.Adapter;

public class Main {
    public static void main(String[] args) {
        StockDataProvider stockDataProvider = new StockDataProvider();

        StockJSONData stockJSONData = new XMLToJSONAdapter(stockDataProvider);

        StockAnalyzer stockAnalyzer = new StockAnalyzer();

        stockAnalyzer.analyseStockData(stockJSONData);
    }
}
