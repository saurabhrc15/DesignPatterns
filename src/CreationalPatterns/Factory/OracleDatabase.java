package DesignPatterns.Factory;

public class OracleDatabase implements Database{
    @Override
    public void connect() {
        System.out.println("Connecting Oracle Database");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting Oracle Database");
    }
}
