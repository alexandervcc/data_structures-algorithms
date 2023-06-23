package PattStructural.Flyweight;

import java.util.Random;

public class Client {
    public static void main(String[] args) throws Exception{
        RobotFactory fac=new RobotFactory();
        RobotInt r1=fac.getRobotFromFactory("small");
        r1.print();
        RobotInt r2=fac.getRobotFromFactory("small");
        r2.print();
        RobotInt r3=fac.getRobotFromFactory("large");
        r3.print();

        System.out.println("\n\nTYPES ROBOTS");
        RobotFactory2 fac2 = new RobotFactory2();
        RobotInt r4;
        for (int i = 0; i <3 ; i++) {
            r4=(Robot) fac2.getRobotFromFactory("king");
            r4.setColor(getRandomColor());
            r4.print();
        }
        for (int i = 0; i <3 ; i++) {
            r4=(Robot) fac2.getRobotFromFactory("queen");
            r4.setColor(getRandomColor());
            r4.print();
        }

        int totalObjects= fac2.totalObjectsCreated();
        System.out.println("Number of distinct robots created: "+totalObjects);

    }

    static String getRandomColor(){
        Random r= new Random();
        int num=r.nextInt(20);
        if(num%2==0){
            return "red";
        }else {
            return "blue";
        }
    }
}
