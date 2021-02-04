package com.java.example;

import java.util.Arrays;

/*
Rearrange an array in order – smallest, largest, 2nd smallest, 2nd largest, ..

 */
public class RearrangeArray {
    public static void main(String[] args) {
        int arr[] = { 5, 8, 1, 4, 2, 9, 3, 7, 6 };
        int n = arr.length;
        rearrangeArray(arr, n);

        for (int i = 0; i < n; i++)
            System.out.print(arr[i]+" ");
    }

    private static void rearrangeArray(int[] arr, int n) {
        // Sorting the array elements
        Arrays.sort(arr);

        int[] tempArr = new int[n]; // To store modified array

        // Adding numbers from sorted array to
        // new array accordingly
        int ArrIndex = 0;

        // Traverse from begin and end simultaneously
        for (int i = 0, j = n-1; i <= n / 2 || j > n / 2;
             i++, j--) {
            if(ArrIndex < n)
            {
                tempArr[ArrIndex] = arr[i];
                ArrIndex++;
            }

            if(ArrIndex < n)
            {
                tempArr[ArrIndex] = arr[j];
                ArrIndex++;
            }
        }

        // Modifying original array
        for (int i = 0; i < n; i++)
            arr[i] = tempArr[i];

    }
}

