package com.java.example1;

import java.util.*;

public class FindDuplicate {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i=0; i<tc; i++){
            List<Integer> arr = new ArrayList<Integer>();
            while(sc.hasNextInt()){
                arr.add(sc.nextInt());
            }
            Set<Integer> set = new HashSet<Integer>();
            for(int value : arr){
                if(set.contains(value)){
                    System.out.print(value);
                }
                set.add(value);
            }
        }
    }
}

