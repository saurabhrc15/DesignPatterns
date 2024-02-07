package DesignPatterns.Factory;

public class Main {
    public static void main(String[] args) {
        DatabaseFactory databaseFactory = new DatabaseFactory();
        try {
            Database database = databaseFactory.getDatabaseConnection("ORACLE");

            database.connect();

            //! Do db operations..

            database.disconnect();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
