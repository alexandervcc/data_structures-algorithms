package Principles.Abstract_Interfaces;

interface DisplayModule {
    public void display();
}

class Monitor implements  DisplayModule{
    @Override
    public void display() {
        System.out.println("Display through monitor");
    }
}

class Proyector implements DisplayModule{
    @Override
    public void display() {
        System.out.println("Display through Proyector");
    }
}

class Computer{
    DisplayModule dm;

    public void setDisplayModule(DisplayModule dmPar){
        this.dm=dmPar;
    }

    public void display(){
        this.dm.display();
    }

    public static void main(String[] args) {
        Computer cm=new Computer();
        DisplayModule dm1=new Monitor();
        DisplayModule dm2=new Proyector();

        cm.setDisplayModule(dm1);
        cm.display();
        cm.setDisplayModule(dm2);
        cm.display();


    }
}
