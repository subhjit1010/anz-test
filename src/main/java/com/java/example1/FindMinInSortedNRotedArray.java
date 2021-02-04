package com.java.example1;

/*
Reference : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/solution/
If the array is not rotated and the array is in ascending order, then last element > first element.
[] = { 2, 3, 4, 5, 6, 7 } //No Rotation
In the above example 7 > 2. This means that the array is still sorted and has no rotation.


[] = { 4, 5, 6, 7, 2, 3 }//Rotated Array
In the above example 3 < 4. Hence the array is rotated. This happens because the array was initially [2, 3 ,4 ,5 ,6 ,7].
But after the rotation the smaller elements[2,3] go at the back. i.e. [4, 5, 6, 7, 2, 3].
Because of this the first element [4] in the rotated array becomes greater than the last element.

This means there is a point in the array at which you would notice a change.
This is the point which would help us in this question. We call this the Inflection Point.
                            Decrease
                            ---------->
Increase                            Increase
------------->                    ---------->
[] = {    4,    5,    6,    7,    2,    3    }
                                  ^
                                  Inflection Point
                                  2 < 7



******************
Algorithm
*****************
1 . Find the mid element of the array.

2 . If mid element > first element of array this means that we need to look for the inflection point on the right of mid.

3 . If mid element < first element of array this that we need to look for the inflection point on the left of mid.

[] = { 4, 5, 6, 7, 2, 3 }
In the above example mid element 6 is greater than first element 4. Hence we continue our search for the inflection point to the right of mid.

4 . We stop our search when we find the inflection point, when either of the two conditions is satisfied:

nums[mid] > nums[mid + 1] Hence, mid+1 is the smallest.

nums[mid - 1] > nums[mid] Hence, mid is the smallest.

 */

public class FindMinInSortedNRotedArray {

    public static void main (String[] args)
    {
        int arr1[] =  {5, 6, 1, 2, 3, 4};
        System.out.println("The minimum element is "+ findMin(arr1));

        int arr2[] =  {1, 2, 3, 4};
        System.out.println("The minimum element is "+ findMin(arr2));

        int arr3[] =  {1};
        System.out.println("The minimum element is "+ findMin(arr3));

        int arr4[] =  {1, 2};
        System.out.println("The minimum element is "+ findMin(arr4));

        int arr5[] =  {2, 1};
        System.out.println("The minimum element is "+ findMin(arr5));

        int arr6[] =  {5, 6, 7, 1, 2, 3, 4};
        System.out.println("The minimum element is "+ findMin(arr6));

        int arr7[] =  {1, 2, 3, 4, 5, 6, 7};
        System.out.println("The minimum element is "+ findMin(arr7));

        int arr8[] =  {2, 3, 4, 5, 6, 7, 8, 1};
        System.out.println("The minimum element is "+ findMin(arr8));

        int arr9[] =  {3, 4, 5, 1, 2};
        System.out.println("The minimum element is "+ findMin(arr9));
    }

    public static int findMin(int[] nums) {
        // If the list has just one element then return that element.
        if (nums.length == 1) {
            return nums[0];
        }

        // initializing left and right pointers.
        int left = 0, right = nums.length - 1;

        // if the last element is greater than the first element then there is no rotation.
        // e.g. 1 < 2 < 3 < 4 < 5 < 7. Already sorted array.
        // Hence the smallest element is first element. A[0]
        if (nums[right] > nums[0]) {
            return nums[0];
        }

        // Binary search way
        while (right >= left) {
            // Find the mid element
            int mid = left + (right - left) / 2;

            // if the mid element is greater than its next element then mid+1 element is the smallest
            // This point would be the point of change. From higher to lower value.
            if (nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }

            // if the mid element is lesser than its previous element then mid element is the smallest
            if (nums[mid - 1] > nums[mid]) {
                return nums[mid];
            }

            // if the mid elements value is greater than the 0th element this means
            // the least value is still somewhere to the right as we are still dealing with elements
            // greater than nums[0]
            if (nums[mid] > nums[0]) {
                left = mid + 1;
            } else {
                // if nums[0] is greater than the mid value then this means the smallest value is somewhere to
                // the left
                right = mid - 1;
            }
        }
        return -1;
    }

}
