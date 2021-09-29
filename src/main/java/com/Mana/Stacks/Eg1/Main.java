package com.Mana.Stacks.Eg1;

import java.util.Arrays;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        Stack s1=new Stack();
        Stack s2=new Stack();
        Stack s3=new Stack();

        String[] str1={"I did, did I?","racecar","hello"};

        for(String xd :str1){
            System.out.println(isPalindrome(xd));
        }

    }

    public static boolean isPalindrome(String str){
        Stack s1=new Stack();
        StringBuilder build=new StringBuilder(str.length());
        StringBuilder rever=new StringBuilder(str.length());
        char[] chars=str.trim().replaceAll("[ ,.?]","").toCharArray();
        for(int i=0;i<chars.length;i++){
            build.append(chars[i]);
            s1.push(chars[i]);
        }
        while(!s1.isEmpty()){
            rever.append(s1.pop());
        }
        rever.reverse();
        return build.toString().equals(rever.toString());
    }
}
