package com.java.example;

import java.util.Arrays;

public class ArrayEquality {
    public static void main(String[] args) {
        int [] arrayOne = {2,5,1,7,4};
        int [] arrayTwo = {2,5,1,7,4};
       // method1(arrayOne,arrayTwo);
        //method2(arrayOne,arrayTwo);
        method3(arrayOne,arrayTwo);
    }
    static void method1(int [] arrayOne, int [] arrayTwo){
        boolean equalOrNot = true;
        if(arrayOne.length == arrayTwo.length){
            for(int i =0;i<arrayOne.length;i++){
                if(arrayOne[i]!=arrayTwo[i])
                    equalOrNot = false;
            }
        }else{
            equalOrNot = false;
        }
        if(equalOrNot)
            System.out.println("Arrays are equal");
        else
            System.out.println("Arrays are not equal");
    }

    static void method2(int [] arrayOne, int [] arrayTwo){
        System.out.println(Arrays.equals(arrayOne,arrayTwo));
    }

    static void method3(int [] arrayOne, int [] arrayTwo){
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        System.out.println(Arrays.equals(arrayOne,arrayTwo));
    }
}
