package Structural.Facade;

import Structural.Facade.Subsystem.*;

public class HomeTheaterFacade {
    private final Amplifier amplifier;
    private final DvdPlayer dvdPlayer;
    private final Projector projector;
    private final Screen screen;
    private final TheaterLights theaterLights;

    public HomeTheaterFacade(Amplifier amplifier, DvdPlayer dvdPlayer, Projector projector, Screen screen, TheaterLights theaterLights) {
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.screen = screen;
        this.theaterLights = theaterLights;
    }

    public void watchMovie(String movie){

        theaterLights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setVolume(50);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie(){
        theaterLights.on();
        dvdPlayer.stop();
        dvdPlayer.off();
        amplifier.off();
        projector.off();
        screen.up();
    }
}
