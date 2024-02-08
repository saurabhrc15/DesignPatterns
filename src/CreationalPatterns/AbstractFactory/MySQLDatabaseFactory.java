package CreationalPatterns.AbstractFactory;

public class MySQLDatabaseFactory implements DatabaseFactory{
    @Override
    public Database createDatabase() {
        return new MySQLDatabase();
    }
}
