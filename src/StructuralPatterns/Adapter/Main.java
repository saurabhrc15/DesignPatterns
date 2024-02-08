package StructuralPatterns.Adapter;

public class Main {
    public static void main(String[] args) {
        //! Get data from local stock data provider in XML
        StockDataProvider stockDataProvider = new StockDataProvider();

        //! Local adapter which helps us to convert local stock data from XML to JSON
        //! as third party stock analyzer library takes data in only JSON format
        StockJSONData stockJSONData = new XMLToJSONAdapter(stockDataProvider);

        //! create instance of third part stock data analyzer library
        StockAnalyzerThirdPartyLibrary stockAnalyzer = new StockAnalyzerThirdPartyLibrary();

        //! analysed stock data
        stockAnalyzer.analyseStockData(stockJSONData);
    }
}
