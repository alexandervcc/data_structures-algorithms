package PattBehavioural.Memento;

public class FileWriteCaretaker {
    private Object object;

    public void saveMemento(FileWriteUtil fileWriteUtil){
        this.object=fileWriteUtil.createMemento();
    }

    public void undo(FileWriteUtil fileWriteUtil){
        fileWriteUtil.undoToPrevState(this.object);
    }
}
