package PattStructural.Flyweight;

public interface RobotInt {
    void print();

    //extrinsic data
    void setColor(String robotColor);
}

//GENDER
class Robot implements RobotInt{
    public String robotType;
    public String robotColor;//Extrinsic data

    public Robot(String robotType) {
        this.robotType = robotType;
    }

    @Override
    public void print() {
        System.out.println("Robot Type: "+robotType+"\nRobot Color: "+robotColor);
    }

    @Override
    public void setColor(String robotColor) {
        this.robotColor = robotColor;
    }
}








//SIZE
class SmallRobot implements RobotInt{
    @Override
    public void print() {
        System.out.println("This is a SMALL Robot");
    }

    @Override
    public void setColor(String robotColor) {

    }
}

class LargeRobot implements RobotInt{
    @Override
    public void print() {
        System.out.println("This is a LARGE Robot");
    }
    @Override
    public void setColor(String robotColor){

    }
}