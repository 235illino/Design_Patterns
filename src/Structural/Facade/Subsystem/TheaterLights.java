package Structural.Facade.Subsystem;

public class TheaterLights {
    public void on(){
        System.out.println("on TheaterLights");
    }
    public void dim(int percent){
        System.out.println("dim to " + percent + "%");
    }
}
