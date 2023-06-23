package PattBehavioural.Memento;

//Originator to create Mementos
public class FileWriteUtil {
    private String filename;
    private StringBuilder content;

    public FileWriteUtil(String filename) {
        this.filename = filename;
        this.content = new StringBuilder();
    }

    @Override
    public String toString(){
        return this.content.toString();
    }

    public void write(String str){
        this.content.append(str);
    }

    public Memento createMemento(){
        return new Memento(this.filename,this.content);
    }

    public void undoToPrevState(Object obj){
        Memento m=(Memento) obj;
        this.filename=m.filename;
        this.content=m.content;
    }

    private class Memento{
        private String filename;
        private StringBuilder content;

        public Memento(String filename, StringBuilder content) {
            this.filename = filename;
            //deep copy, not reference
            this.content = new StringBuilder(content);
        }
    }

}
