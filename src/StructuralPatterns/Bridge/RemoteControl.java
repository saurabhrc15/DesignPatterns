package StructuralPatterns.Bridge;

public abstract class RemoteControl {
    protected Device device;
    public RemoteControl(Device device) {
        this.device = device;
    }

    public abstract void togglePower();
    public abstract void nextChannel();
    public abstract void prevChannel();
}
