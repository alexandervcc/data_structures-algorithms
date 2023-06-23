package PattCreational.Builder;

public class Director {
    BuilderInterface myBuilder;

    public void construct(BuilderInterface builder){
        this.myBuilder=builder;
        myBuilder.buildBody();
        myBuilder.insertWheels();
        myBuilder.addHeadLigths();
    }





}
