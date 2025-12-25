package Structural.Facade.Subsystem;

public class Amplifier {
    public void on(){
        System.out.println("turn on Amplifier");
    }
    public void off(){
        System.out.println("turn off Amplifier");
    }
    public void setVolume(int level){
        System.out.println("set volume " + level);
    }
}
