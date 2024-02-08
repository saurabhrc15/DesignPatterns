package CreationalPatterns.FactoryMethod;

public interface Database {
    public void connect();
    public void disconnect();

    class DatabaseFactory {
        public Database getDatabaseConnection(String dbName) throws Exception {
            if (dbName.equalsIgnoreCase("MYSQL")) {
                return new MySQLDatabase();
            } else if (dbName.equalsIgnoreCase("ORACLE")) {
                return new OracleDatabase();
            } else {
                throw new Exception("Unable to find Database");
            }
        }
    }
}
