package CreationalPatterns.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        //! Mysql Database connection
        DatabaseFactory mySQLDatabaseFactory = new MySQLDatabaseFactory();
        Database mySQLDatabase = mySQLDatabaseFactory.createDatabase();

        mySQLDatabase.connect();
        System.out.println("MySQL database operations");
        mySQLDatabase.disconnect();

        System.out.println("-----------------------------------------------------");

        //! Oracle Database connection
        DatabaseFactory oracleDatabaseFactory = new OracleDatabaseFactory();
        Database oracleDatabase = oracleDatabaseFactory.createDatabase();

        oracleDatabase.connect();
        System.out.println("Oracle database operations");
        oracleDatabase.disconnect();
    }
}
