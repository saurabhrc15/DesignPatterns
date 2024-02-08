package StructuralPatterns.Adapter;

public class Main {
    public static void main(String[] args) {
        StockDataProvider stockDataProvider = new StockDataProvider();

        StockJSONData stockJSONData = new XMLToJSONAdapter(stockDataProvider);

        StockAnalyzerThirdPartyLibrary stockAnalyzer = new StockAnalyzerThirdPartyLibrary();

        stockAnalyzer.analyseStockData(stockJSONData);
    }
}
