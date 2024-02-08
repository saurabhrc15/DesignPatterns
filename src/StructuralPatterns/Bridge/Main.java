package StructuralPatterns.Bridge;

public class Main {
    public static void main(String[] args) {
        //! TV device
        Device tv = new TV();
        RemoteControl tvRemoteControl = new BasicRemoteControl(tv);
        tvRemoteControl.togglePower();
        tvRemoteControl.nextChannel();
        tvRemoteControl.prevChannel();
        tvRemoteControl.togglePower();

        System.out.println("--------------------------------------------");

        //! Radio device
        Device radio = new Radio();
        RemoteControl radioRemoteControl = new BasicRemoteControl(radio);

        radioRemoteControl.togglePower();
        radioRemoteControl.nextChannel();
        radioRemoteControl.prevChannel();
        radioRemoteControl.togglePower();
    }
}
