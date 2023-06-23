package PattStructural.Proxy;

public interface Image {
    void display();
}

class RealImage implements Image{
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk(this.filename);
    }

    private void loadFromDisk(String filename){
        System.out.println("Loading: "+filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying REAL image: "+this.filename);
    }
}
