package com.java.example;

public class Reverse_StringBuffer {
    public static void main(String args[]){

        String str = "MyJava";
        reverseUsingStringBuffer(new StringBuffer(str));
        reverseUsingIterative(str);
       String reversed = reverseUsingrecursive(str);
       System.out.println(reversed);

    }

    static void reverseUsingStringBuffer(StringBuffer sbf){
        System.out.println("Original String: "+sbf.toString());
        System.out.println("Reverse: "+sbf.reverse().toString());
    }

    static void reverseUsingIterative(String str){
        char [] charArray = str.toCharArray();
        for(int i=str.length()-1; i>=0;i--)
            System.out.println(charArray[i]);
    }
    static String reverseUsingrecursive(String str){
        if((null==str) || (str.length()< 1))
            return str;
        return reverseUsingrecursive(str.substring(1)) + str.charAt(0);
    }
}
