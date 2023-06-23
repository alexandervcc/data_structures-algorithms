package PattStructural.Proxy;

public class Client {
    public static void main(String[] args) {
        Image im1 = new ProxyImage("image1.png");

        im1.display();
        System.out.println("\n");
        im1.display();


    }
}
