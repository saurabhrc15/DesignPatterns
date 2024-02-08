package StructuralPatterns.Adapter;

public class XMLToJSONAdapter implements StockJSONData {
    private StockXMLData stockXMLData;

    public XMLToJSONAdapter(StockXMLData xmlData) {
        this.stockXMLData = xmlData;
    }

    @Override
    public String getJSONData() {
        //! <stock><companyName>XYZ</companyName><stockPrice>200.00</stockPrice><currency>INR</currency></stock>
        String xmlData = stockXMLData.getStockDataInXML();

        //! Dummy conversion of XML data to JSON data
        xmlData = xmlData.replace("<stock>", "{ \"stock\": {");
        xmlData = xmlData.replace("</stock>", "} }");
        xmlData = xmlData.replace("<companyName>", "\"companyName\": \"");
        xmlData = xmlData.replace("</companyName>", "\",");
        xmlData = xmlData.replace("<stockPrice>", "\"stockPrice\": ");
        xmlData = xmlData.replace("</stockPrice>", "\",");
        xmlData = xmlData.replace("<currency>", "\"currency\": ");
        xmlData = xmlData.replace("</currency>", "");

        return xmlData;
    }
}
