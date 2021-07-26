package com.Mana.Algorithms;

public class Recursion {
    public static void main(String[] args) {
        System.out.println("------------------Recursion------------------");

        System.out.println("Factorial of: 4 is: "+String.valueOf(factorial(4)));
    }

    public static int factorial(int num){
        if(num==0){
            return 1;
        }

        return num*factorial(num-1);

    }
}
