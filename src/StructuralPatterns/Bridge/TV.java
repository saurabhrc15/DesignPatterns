package StructuralPatterns.Bridge;

public class TV implements Device{
    @Override
    public void turnOn() {
        System.out.println("TV : Turning ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV : Turning OFF");
    }

    @Override
    public void setChannel(int channelNumber) {
        System.out.println("TV : Setting channel number to : " + channelNumber);
    }
}
