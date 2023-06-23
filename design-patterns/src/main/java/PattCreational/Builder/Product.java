package PattCreational.Builder;

import java.util.LinkedList;
import java.util.List;

public class Product {
    private List<String> parts;

    public Product(){
        parts=new LinkedList<String>();
    }

    public void add(String part){
        this.parts.add(part);
    }

    public void show(){
        System.out.println("Product Completed");
        for(String str:this.parts){
            System.out.println(" Part: "+str);
        }
    }
}
