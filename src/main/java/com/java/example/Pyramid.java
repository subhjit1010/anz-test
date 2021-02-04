package com.java.example;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows you want in your pyramid ?");
        int noOfRows = sc.nextInt();
        printPattern1(noOfRows);
    }

    static  void printPattern1(int noOfRows){
        int rowCount = 1;
        for(int i= noOfRows; i>0;i--){
            for(int j= 1; j<i;j++) {
                System.out.println("");
            }
            for(int k= 1; k <=rowCount;k++) {
                System.out.println(rowCount + "");
            }
            System.out.println();
            rowCount++;
        }
    }
}
