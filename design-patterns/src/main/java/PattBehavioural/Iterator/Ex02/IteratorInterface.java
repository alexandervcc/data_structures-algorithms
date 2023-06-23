package PattBehavioural.Iterator.Ex02;

import java.util.LinkedList;

public interface IteratorInterface {
    void first();
    String next();
    boolean isDone();
    String currentItem();
}

class ArtsIterator implements IteratorInterface{
    private String[] subjects;
    private int pos;

    public ArtsIterator(String[] subjects) {
        this.subjects = subjects;
        this.pos=0;
    }

    @Override
    public void first() {
        pos=0;
    }

    @Override
    public String next() {
        return subjects[pos++];
    }

    @Override
    public boolean isDone() {
        return pos>=subjects.length;
    }

    @Override
    public String currentItem() {
        return subjects[pos];
    }
}

class ScienceIterator implements IteratorInterface{
    private LinkedList<String> subjects;
    private int pos;

    public ScienceIterator(LinkedList<String> subjects) {
        this.subjects = subjects;
        this.pos=0;
    }

    @Override
    public void first() {
        this.pos=0;
    }

    @Override
    public String next() {
        return subjects.get(pos++);
    }

    @Override
    public boolean isDone() {
        return pos>=subjects.size();
    }

    @Override
    public String currentItem() {
        return subjects.get(pos);
    }
}