package StructuralPatterns.Adapter;

public class StockAnalyzerThirdPartyLibrary {
    public void analyseStockData(StockJSONData jsonData) {
        System.out.println("Analysing stock data : " + jsonData.getJSONData());
    }
}
