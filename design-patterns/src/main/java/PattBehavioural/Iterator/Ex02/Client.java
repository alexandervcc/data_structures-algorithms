package PattBehavioural.Iterator.Ex02;

public class Client {
    static void printIterator(IteratorInterface iteratorInterface){
        while(!iteratorInterface.isDone()){
            System.out.println(iteratorInterface.next());
        }
    }

    public static void main(String[] args) {
            SubjectInterface science=new Science();
            SubjectInterface arts= new Arts();

            IteratorInterface itScience = science.createIterator();
            IteratorInterface itArts = arts.createIterator();

            printIterator(itArts);
            printIterator(itScience);

    }
}
