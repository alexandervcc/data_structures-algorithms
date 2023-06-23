package PattStructural.Facade;

public class Client {
    public static void main(String[] args) {
        FacadeHomeTheater fhm = new FacadeHomeTheater(new Amplifier(),new CdPlayer(), new DvdPlayer(), new PopcornPopper(),new Projector(),new Screen(), new TheatherLigths(),new Tuner());
        fhm.watchMovie("Mijotron");
        fhm.endMovie();
    }
}
