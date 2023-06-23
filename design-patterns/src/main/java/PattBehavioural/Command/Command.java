package PattBehavioural.Command;

public interface Command {
    void execute();
    //void undo();
    //void redo();
}

class OpenFileCommand implements Command{
    private FileSystemReceiver fileSystem;
    //Store of States

    public OpenFileCommand(FileSystemReceiver fileSystem) {
        this.fileSystem = fileSystem;
    }
    @Override
    public void execute() {
        this.fileSystem.openFile();
    }
}

class CloseFileCommand implements Command{
    private FileSystemReceiver fileSystem;
    //Store of States

    public CloseFileCommand(FileSystemReceiver fileSystem) {
        this.fileSystem = fileSystem;
    }
    @Override
    public void execute() {
        this.fileSystem.closeFile();
    }
}
class WriteFileCommand implements Command{
    private FileSystemReceiver fileSystem;
    //Store of States

    public WriteFileCommand(FileSystemReceiver fileSystem) {
        this.fileSystem = fileSystem;
    }
    @Override
    public void execute() {
        this.fileSystem.writeFile();
    }
}