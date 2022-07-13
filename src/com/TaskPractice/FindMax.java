package com.TaskPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindMax {
    // from for loop
    public static void main(String[] args) {
        int [] nums = {500, 120, -80, 250, -10};
        int max =nums[0];
        for (int i=0; i<nums.length; i++){
            int number = nums[i];
            if (number>max){
                max=number;
            }
        }
        System.out.println("Maximum is " + max);

        int [] nums1 = {500, 120, -80, 250, -10};
        //sort method
        //sort() method rearrange elements to be in order of smallest to largest
        Arrays.sort(nums1);
        System.out.println("Maximum is "+ nums1[nums1.length-1]);


        ArrayList<Integer> list = new ArrayList<>();
        // from Collections
        //addAll- add all of the given collection type elements to the arraylist
        list.addAll(Arrays.asList(500,120,-80,250,-10));
        System.out.println("Maximum is "+ Collections.max(list)); //returns the biggest elements in the collection


        //with stream
        int [] nums2 = {500, 120, -80, 250, -10};
        int x= nums2.length;
        System.out.println("Maximum is " + getMax(nums2, x));

    }
    public static int getMax(int arr[], int x){
        return Arrays.stream(arr).max().getAsInt();
    }
}

