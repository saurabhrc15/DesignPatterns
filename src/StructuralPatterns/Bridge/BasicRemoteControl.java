package StructuralPatterns.Bridge;

public class BasicRemoteControl extends RemoteControl{
    private int channelNumber = 1;
    private boolean powerOn = false;

    public BasicRemoteControl(Device device) {
        super(device);
    }

    @Override
    public void togglePower() {
        if (powerOn) {
            System.out.println("Remote : Powering Off");
            device.turnOff();
        } else {
            System.out.println("Remote : Powering On");
            device.turnOn();
        }

        powerOn = !powerOn;
    }

    @Override
    public void nextChannel() {
        System.out.println("Remote : Next Channel");
        device.setChannel(++channelNumber);
    }

    @Override
    public void prevChannel() {
        System.out.println("Remote : Previous Channel");
        device.setChannel(--channelNumber);
    }
}
