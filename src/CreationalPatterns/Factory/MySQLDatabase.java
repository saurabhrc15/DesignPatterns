package DesignPatterns.Factory;

public class MySQLDatabase implements Database{
    @Override
    public void connect() {
        System.out.println("Connecting MySQL Database");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting MySQL Database");
    }
}
