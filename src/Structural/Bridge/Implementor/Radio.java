package Structural.Bridge.Implementor;

public class Radio implements Device{
    private boolean enabled;
    private int volume;

    public Radio(boolean enabled, int volume) {
        this.enabled = enabled;
        this.volume = volume;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void enable() {
        enabled = true;
    }

    @Override
    public void disable() {
        enabled = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        if (volume > 100) {
            this.volume = 100;
        } else if (volume < 0) {
            this.volume = 0;
        } else {
            this.volume = percent;
        }
        System.out.println(getClass().getSimpleName() + ": гучність встановлена на " + this.volume + "%");
    }
}
