package PattStructural.Composite;

public class Client {
    public static void main(String[] args) {
        Employee dev1=new Developer("Alexander",1,"Cheems Developer");
        Employee dev2=new Developer("Cheems",11,"Cheems Developer");
        Employee man1= new Manager("Andrea",2,"Manager TI");
        Employee man2= new Manager("Marcel",3,"Manager Finance");

        Directory engDir = new Directory();
        Directory finDir = new Directory();

        Directory comDir = new Directory();

        engDir.addEmployee(dev1);
        engDir.addEmployee(dev2);

        finDir.addEmployee(man1);
        finDir.addEmployee(man2);

        comDir.addEmployee(engDir);
        comDir.addEmployee(finDir);

        comDir.showEmployeeDetails();

    }
}
