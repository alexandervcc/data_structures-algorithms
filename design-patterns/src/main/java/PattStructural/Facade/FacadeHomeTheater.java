package PattStructural.Facade;

public class FacadeHomeTheater {
    Amplifier amplifier;
    CdPlayer cdPlayer;
    DvdPlayer dvdPlayer;
    PopcornPopper popcornPopper;
    Projector projector;
    Screen screen;
    TheatherLigths theatherLigths;
    Tuner tuner;

    public FacadeHomeTheater(Amplifier amplifier, CdPlayer cdPlayer, DvdPlayer dvdPlayer, PopcornPopper popcornPopper, Projector projector, Screen screen, TheatherLigths theatherLigths, Tuner tuner) {
        this.amplifier = amplifier;
        this.cdPlayer = cdPlayer;
        this.dvdPlayer = dvdPlayer;
        this.popcornPopper = popcornPopper;
        this.projector = projector;
        this.screen = screen;
        this.theatherLigths = theatherLigths;
        this.tuner = tuner;
    }

    public void watchMovie(String movie) {
        System.out.println("Starting the stage for whatching a movie");
       /* popcornPopper.on();
        popcornPopper.pop();

        theatherLigths.dim(10);
        screen.down();

        projector.on();
        projector.wideScreenMode();

        amplifier.on();
        amplifier.setDvd(dvdPlayer);
        amplifier.setSurroundSound();
        amplifier.setVolume(5);

        dvdPlayer.on();
        dvdPlayer.play(movie)*/
    }

    public void endMovie(){
        System.out.println("Turining off the stage for movies");
        /*popcornPopper.off();
        theatherLigths.on();
        screen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
*/
    }
}
