package com.java.example1;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        // Nuts and bolts are represented as array of characters
        char nuts[] = {'@', '#', '$', '%', '^', '&'};
        char bolts[] = {'$', '%', '&', '^', '@', '#'};

        // Method based on quick sort which matches nuts and bolts
        matchPairs(nuts, bolts, 5);

        System.out.println("Matched nuts and bolts are : ");
        printArray(nuts);
        printArray(bolts);
    }
    static void printArray(char[] arr) {
        for (char ch : arr){
            System.out.print(ch + " ");
        }
        System.out.print("\n");
    }

    static void matchPairs(char nuts[], char bolts[], int n) {
        int low=0,high=n;
        matchPairs1(nuts,bolts,low,high);
    }
    static void matchPairs1(char nuts[], char bolts[], int low,int high) {
        if(low<high){
            int pivot = partition(nuts,low,high,bolts[high]);
            partition(bolts,low,high,nuts[pivot]);
            matchPairs1(nuts,bolts,low,pivot-1);
            matchPairs1(nuts,bolts,pivot+1,high);
        }
    }
    static int partition(char[] arr,int low,int high,int pivot){
        int i=low; char temp1,temp2;
        for(int j=low;j<high;j++){
            if(arr[j]< pivot){
                temp1 = arr[j];
                arr[j] = arr[i];
                arr[i] = temp1;
                i++;
            }else if(arr[j] == pivot){
                temp1 = arr[j];
                arr[j] = arr[high];
                arr[high] = temp1;
                j--;
            }
        }
        temp2 = arr[i];
        arr[i] = arr[high];
        arr[high] = temp2;

        return i;
    }
}