package PattBehavioural.Command;

public class FileSystemReceiverUtil {
    public static FileSystemReceiver getUnderlyingFileSystem(){
        String osName=System.getProperty("os.name");
        System.out.println("OS is: "+osName);
        if(osName.contains("Linux")){
            return new UnixFileSystemReceiver();
        }else {
            return new WindowsFileSystemReceiver();
        }
    }
}
