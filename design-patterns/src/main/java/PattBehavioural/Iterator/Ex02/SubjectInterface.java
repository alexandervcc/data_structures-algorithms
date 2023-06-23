package PattBehavioural.Iterator.Ex02;

import java.util.LinkedList;

public interface SubjectInterface {
    public IteratorInterface createIterator();
}

class Arts implements SubjectInterface{
    private String[] subjects;

    public Arts() {
        this.subjects = new String[2];
        subjects[0]="Music";
        subjects[1]="Drawing";
    }

    @Override
    public IteratorInterface createIterator() {
        return new ArtsIterator(subjects);
    }
}

class Science implements SubjectInterface{
    private LinkedList<String > subjects;

    public Science() {
        this.subjects = new LinkedList<String>();
        subjects.add("Maths");
        subjects.add("Science");
        subjects.add("Physics");
        subjects.add("Chemistry");

    }

    @Override
    public IteratorInterface createIterator() {
        return new ScienceIterator(subjects);
    }
}