package PattCreational.Prototype;

public class Client {
    public static void main(String[] args) {
        ShapeCache.loadItems();
        Shape cloned1=(Shape) ShapeCache.getShape("1");
        Shape cloned2=(Shape) ShapeCache.getShape("1");

        System.out.println(cloned1+"\n"+cloned2);
    }
}
