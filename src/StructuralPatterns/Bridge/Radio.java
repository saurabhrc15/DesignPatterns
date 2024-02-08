package StructuralPatterns.Bridge;

public class Radio implements Device{
    @Override
    public void turnOn() {
        System.out.println("Radio : Turning ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio : Turning OFF");
    }

    @Override
    public void setChannel(int channelNumber) {
        System.out.println("Radio : Setting channel number to : " + channelNumber);
    }
}
