package PattCreational.Prototype;

public abstract class Shape implements Cloneable{
    private String id;
    protected String type;

    abstract void draw();

    public String getType(){
        return this.type;
    }

    public String getId(){
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone(){
        Object clone=null;
        try {
            clone=super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}

class Rectangle extends Shape{
    public Rectangle(){
        this.type="Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle Draw Method");
    }
}

class Square extends Shape{
    public Square(){
        this.type="Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square Draw Method");
    }
}

class Circle extends Shape{
    public Circle(){
        this.type="Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle Draw Method");
    }
}