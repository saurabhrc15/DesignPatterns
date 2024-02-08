package StructuralPatterns.Adapter;

public class StockMarketApp {
    public static void main(String[] args) {
        StockDataProvider stockDataProvider = new StockDataProvider();

        StockJSONData stockJSONData = new XMLToJSONAdapter(stockDataProvider);

        StockAnalyzer stockAnalyzer = new StockAnalyzer();

        stockAnalyzer.analyseStockData(stockJSONData);
    }
}
