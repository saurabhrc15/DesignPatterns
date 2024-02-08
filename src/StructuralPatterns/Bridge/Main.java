package StructuralPatterns.Bridge;

public class Main {
    public static void main(String[] args) {
        /*
            "Device" is the implementor interface, and "Radio" and "TV" are its concrete implementations.
            They provide specific implementations for device operations.

            "RemoteControl" is the abstraction, and "BasicRemoteControl" is a refined abstraction that adds some more functionality.
            It uses a "Device" object to perform operations.

            The "Device" can change independently of the "RemoteControl", and vice versa.
            This is the "BRIDGE" between the two different hierarchies — the "RemoteControl" and the "Devices" it controls.

            In the below code, we demonstrate using the "RemoteControl" with both a "Radio" and a "TV" without altering the "RemoteControl" code.
         */

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
