package PattStructural.Flyweight;

import java.util.HashMap;
import java.util.Map;

class RobotFactory {
    Map<String,RobotInt> shapes=new HashMap<String,RobotInt>();

    public int totalObjectsCreated(){
        return shapes.size();
    }

    //FactoryMethod
    public RobotInt getRobotFromFactory(String robotCat) throws Exception{
        RobotInt robot=null;
        if(shapes.containsKey(robotCat)){
            robot=shapes.get(robotCat);
        }else {
            switch (robotCat){
                case "small":
                    System.out.println("Factory is creating SMALL robot");
                    robot=new SmallRobot();
                    shapes.put("small",robot);
                    break;
                case "large":
                    System.out.println("Factory is creating LARGE robot");
                    robot=new LargeRobot();
                    shapes.put("large",robot);
                    break;
                default:
                    throw new Exception("Robot Factory cant process inserted Category");
            }
        }
        return robot;
    }
}

class RobotFactory2 {
    Map<String,RobotInt> shapes=new HashMap<String,RobotInt>();

    public int totalObjectsCreated(){
        return shapes.size();
    }

    //FactoryMethod
    public RobotInt getRobotFromFactory(String robotType) throws Exception{
        RobotInt robot=null;
        if(shapes.containsKey(robotType)){
            robot=shapes.get(robotType);
        }else {
            switch (robotType){
                case "king":
                    System.out.println("Factory is creating KING robot");
                    robot=new Robot(robotType);
                    shapes.put("king",robot);
                    break;
                case "queen":
                    System.out.println("Factory is creating QUEEN robot");
                    robot=new Robot(robotType);
                    shapes.put("queen",robot);
                    break;
                default:
                    throw new Exception("Robot Factory cant process inserted Type");
            }
        }
        return robot;
    }
}
