package PattBehavioural.Command;

public class Client {
    public static void main(String[] args) {
        FileSystemReceiver fsr=FileSystemReceiverUtil.getUnderlyingFileSystem();

        //Create Command and asociated receiver
        OpenFileCommand openFileCommand=new OpenFileCommand(fsr);

        //Create Invoker
        FileInvoker fileInvoker=new FileInvoker(openFileCommand);

        //Performe Invoker Action
        fileInvoker.execute();
    }
}
