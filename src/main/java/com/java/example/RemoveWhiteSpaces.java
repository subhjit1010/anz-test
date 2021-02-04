package com.java.example;

import java.util.Scanner;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter input string to be cleaned from white spaces...!");
        String inputString = sc.nextLine();
        //method1(inputString);
        //method2(inputString);
        method3(inputString);

    }
    static void method1(String inputString){
        System.out.println("Input String : "+inputString);
        System.out.println("Input String without whitespaces :" +inputString.replaceAll("\\s+",""));
    }

    static void method2(String inputString){
        char[] charArray = inputString.toCharArray();
        String stringWithoutSpace = "";
        for(int i=0; i < inputString.length(); i++){
            if((charArray[i] !=' ') && (charArray[i]!='\t'))
                stringWithoutSpace += charArray[i];
        }
        System.out.println("Input String :"+inputString);
        System.out.println("String without spaces :"+ stringWithoutSpace);
    }
    static void method3(String inputString){
        String stringWithoutSpace = "";
        for (int i= 0;i <inputString.length();i++){
            if(!Character.isWhitespace(inputString.charAt(i)))
                stringWithoutSpace+= inputString.charAt(i);
        }
        System.out.println("String without spaces :"+ stringWithoutSpace);
    }
}
