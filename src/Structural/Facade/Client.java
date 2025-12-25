package Structural.Facade;

import Structural.Facade.Subsystem.*;

public class Client {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        DvdPlayer dvdPlayer = new DvdPlayer();
        Projector projector = new Projector();
        Screen screen = new Screen();
        TheaterLights theaterLights = new TheaterLights();
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier, dvdPlayer, projector, screen, theaterLights);
        homeTheaterFacade.watchMovie("Inception");
        homeTheaterFacade.endMovie();
    }
}
