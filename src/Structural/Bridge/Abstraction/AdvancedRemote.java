package Structural.Bridge.Abstraction;

import Structural.Bridge.Implementor.Device;
import Structural.Bridge.Implementor.Radio;
import Structural.Bridge.Implementor.Tv;

public class AdvancedRemote extends Remote{

    public AdvancedRemote(Device device) {
        super(device);
    }

    void mute(){
        super.getDevice().setVolume(0);
    }

    static void main() {
        Device tv = new Tv(true, 50);
        Remote remoteTv = new Remote(tv);
        remoteTv.volumeDown();
        remoteTv.volumeDown();
        System.out.println(tv.getVolume());
        Device radio = new Radio(true, 45);
        AdvancedRemote advancedRemoteRadio = new AdvancedRemote(radio);
        advancedRemoteRadio.mute();
        System.out.println(radio.getVolume());
    }
}
