package Structural.Bridge.Abstraction;

import Structural.Bridge.Implementor.Device;

public class Remote {
    private Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public Device getDevice() {
        return device;
    }

    void togglePower(){
        if(device.isEnabled()) device.disable();
        else device.enable();
    }

    void volumeDown(){
        int newVolume = device.getVolume() - 10;
        device.setVolume(newVolume);
    }

    void volumeUp(){
        int newVolume = device.getVolume() + 10;
        device.setVolume(newVolume);
    }
}
