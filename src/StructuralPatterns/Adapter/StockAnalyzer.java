package StructuralPatterns.Adapter;

public class StockAnalyzer{
    public void analyseStockData(StockJSONData jsonData) {
        System.out.println("Analysing stock data : " + jsonData.getJSONData());
    }
}
