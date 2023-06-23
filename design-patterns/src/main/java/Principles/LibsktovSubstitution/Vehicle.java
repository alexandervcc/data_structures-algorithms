package Principles.LibsktovSubstitution;

abstract class Vehicle {
    abstract int getSpeed();
    abstract int getCubicCapacity();
}

class Car extends Vehicle{
    @Override
    int getSpeed() {
        return 0;
    }

    @Override
    int getCubicCapacity() {
        return 0;
    }

    boolean sHatchBack(){
        return true;
    }
}

class Bus extends Vehicle{
    @Override
    int getSpeed() {
        return 0;
    }

    @Override
    int getCubicCapacity() {
        return 0;
    }
    String getEmergencyExitLoc(){
        return "";
    }
}


class Main{
    public static void main(String[] args) {
        Vehicle v1=new Bus();
        v1.getSpeed();
        v1=new Car();
        v1.getCubicCapacity();
    }
}