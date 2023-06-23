package PattBehavioural.Command;

public interface FileSystemReceiver {
    void openFile();
    void writeFile();
    void closeFile();
}

class UnixFileSystemReceiver implements FileSystemReceiver{
    @Override
    public void openFile() {
        System.out.println("Opening file in: UNIX");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file in: UNIX");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file in: UNIX");
    }
}

class WindowsFileSystemReceiver implements FileSystemReceiver{
    @Override
    public void openFile() {
        System.out.println("Opening file in: WINDOWS");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file in: WINDOWS");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file in: WINDOWS");
    }
}