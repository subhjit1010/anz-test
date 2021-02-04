package com.java.example1;

public class LeftRotate {
    public static void main (String[] args)
    {
        int arr[] = {1, 3, 5, 7, 9};
        int n = arr.length;

        int temp[] = new int[2*n];
        //preprocess(arr, n, temp);

        /*int k = 2;
        leftRotate(arr, n, k, temp);

        k = 3;
        leftRotate(arr, n, k, temp);

        k = 4;
        leftRotate(arr, n, k, temp);*/

        int k = 2;
        leftRotate(arr, n, k);

        k = 3;
        leftRotate(arr, n, k);

        k = 4;
        leftRotate(arr, n, k);
    }

    // Fills temp[] with two copies of arr[]
    static void preprocess(int arr[], int n,
                           int temp[])
    {
        // Store arr[] elements at i and i + n
        for (int i = 0; i<n; i++)
            temp[i] = temp[i + n] = arr[i];
    }

    // Function to left rotate an array k time
    static void leftRotate(int arr[], int n, int k,
                           int temp[])
    {
        // Starting position of array after k
        // rotations in temp[] will be k % n
        int start = k % n;

        // Print array after k rotations
        for (int i = start; i < start + n; i++)
            System.out.print(temp[i] + " ");

        System.out.print("\n");
    }

    static void leftRotate(int arr[],
                           int n, int k)
    {
        // Print array after
        // k rotations
        System.out.println();
        for (int i = k; i < k + n; i++)
            System.out.print(arr[i % n] + " ");
    }

    /*static void leftRotate(int arr[], int n, int k)
    {
        *//* To get the starting point of
        rotated array *//*
        int mod = k % n;

        // Prints the rotated array from
        // start position
        for (int i = 0; i < n; ++i)
            System.out.print(arr[(i + mod) % n] + " ");

        System.out.println();
    }*/
}
