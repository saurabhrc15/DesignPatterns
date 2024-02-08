package CreationalPatterns.AbstractFactory;

public class OracleDatabaseFactory implements DatabaseFactory{
    @Override
    public Database createDatabase() {
        return new OracleDatabase();
    }
}
