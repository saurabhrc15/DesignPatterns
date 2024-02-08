package StructuralPatterns.Adapter;

public class StockDataProvider implements StockXMLData{
    @Override
    public String getStockDataInXML() {
        //! Dummy XML data..
        return "<stock><companyName>XYZ</companyName><stockPrice>200.00</stockPrice><currency>INR</currency></stock>";
    }
}
