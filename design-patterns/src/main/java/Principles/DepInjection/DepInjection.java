package Principles.DepInjection;

public class DepInjection {
}
/*
interface Service{
    void write(String message);
}

class ServiceA implements Service{
    @Override
    public void write(String message) {
        System.out.println(message);
    }
}

class Client{
    private Service service;

    //Injection Constructor

    public Cliente(Service service) {
        this.service = service;
    }

    public void doSometing(){
       this.service.write("Messagae XD");
    }

    public static void main(String[] args) {
        Service s1=new ServiceA();//Injector
        Client c=new Client();
    }
}
*/