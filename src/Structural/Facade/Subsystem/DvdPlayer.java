package Structural.Facade.Subsystem;

public class DvdPlayer {
    public void on(){
        System.out.println("turn on DvdPlayer");
    }
    public void off(){
        System.out.println("turn off DvdPlayer");
    }

    public void play(String movie){
        System.out.println("play movie");
    }
    public void stop(){
        System.out.println("stop DvdPlayer");
    }
}
