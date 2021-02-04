package com.java.example;

public class LeftRotate {
    static void leftRotate(int arr[], int d)
    {

        if (d == 0)
            return;
        int n = arr.length;
        rvereseArray(arr, 0, d - 1);
        rvereseArray(arr, d, n - 1);
        rvereseArray(arr, 0, n - 1);
    }

    /*Function to reverse arr[] from index start to end*/
    static void rvereseArray(int arr[], int start, int end)
    {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    /* Driver program to test above functions */
    public static void main(String[] args)
    {
        //int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int arr[] = {41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51};
        int n = arr.length;
        int d = 10;

        // in case the rotating factor is
        // greater than array length
        d = d % n;
        leftRotate(arr, d); // Rotate array by d
        printArray(arr);
    }
}
