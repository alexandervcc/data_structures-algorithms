package PattBehavioural.Memento;

public class Client {
    public static void main(String[] args) {
        FileWriteCaretaker fileWriteCaretaker=new FileWriteCaretaker();
        FileWriteUtil fileWriteUtil1=new FileWriteUtil("file1");
        fileWriteUtil1.write("Mijotron\n");
        fileWriteUtil1.write("Manaseses\n");
        System.out.println("Content:\n"+fileWriteUtil1.toString());
        fileWriteCaretaker.saveMemento(fileWriteUtil1);
        fileWriteUtil1.write("Cuicochas\n");
        fileWriteUtil1.write("Babitas\n");
        System.out.println("Content:\n"+fileWriteUtil1.toString());
        fileWriteCaretaker.undo(fileWriteUtil1);
        System.out.println("Content:\n"+fileWriteUtil1.toString());

    }
}
