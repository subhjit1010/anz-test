package com.java.example;

public class FindMissingNumberInSortedArrayExample {
    public static void main(String[] args) {
        int ar[] = {3,5,8,44};
        displayMissing(ar);
    }

    private static void displayMissing(int[] ar) {
        int j=0;
        for(int i=0;i<100;i++){
            if(j<ar.length && i==ar[j])
                j++;
            else
                System.out.println(i);
        }
    }
}
