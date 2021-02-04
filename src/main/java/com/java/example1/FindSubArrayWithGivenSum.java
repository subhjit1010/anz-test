package com.java.example1;

import java.util.HashMap;

public class FindSubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {10, 2, -2, -20, 10};
        int n = arr.length;
        int sum = -10;
        subArraySum(arr, n, sum);

    }

    static int subArraySum(int arr[], int n, int sum)
    {
        int curr_sum, i, j;

        // Pick a starting point
        for (i = 0; i < n; i++) {
            curr_sum = arr[i];

            // try all subarrays starting with 'i'
            for (j = i + 1; j <= n; j++) {
                if (curr_sum == sum) {
                    int p = j - 1;
                    System.out.println(
                            "Sum found between indexes " + i
                                    + " and " + p);
                    return 1;
                }
                if (curr_sum > sum || j == n)
                    break;
                curr_sum = curr_sum + arr[j];
            }
        }

        System.out.println("No subarray found");
        return 0;
    }

    /*private static void subArraySum(int[] arr, int n, int sum) {
        int cur_sum = 0;
        int start = 0;
        int end = -1;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            cur_sum = cur_sum + arr[i];
            if (cur_sum - sum == 0) {
                start = 0;
                end = i;
                break;
            }
            if (hashMap.containsKey(cur_sum - sum)) {
                start = hashMap.get(cur_sum - sum) + 1;
                end = i;
                break;
            }
            hashMap.put(cur_sum, i);
        }
        }*/
}
