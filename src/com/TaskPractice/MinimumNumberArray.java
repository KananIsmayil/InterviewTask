package com.TaskPractice;

import java.util.Arrays;

public class MinimumNumberArray {
    public static String minNumber1 (int [] arr){
        if(arr != null) {
            int num = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < num) {
                    num = arr[i];
                }
            }
            return "Min number is " + num;
        } else {
            return "Array is empty";
        }
    }

    public static String minNumber2 (int [] arr){
        if(arr != null){
            Arrays.sort(arr);
            return "Min number is " + arr[0];
        } else {
            return "Array is empty";
        }

    }

    public static String minNumber3 (int [] arr){
        if(arr != null) {
            int num = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < num) {
                    num = arr[i];
                }
            }
            return "Min number is " + arr[0];
        }
        return "Array is empty";
    }

    public static void main(String[] args) {

        int [] arr = {10000, 3, 1455, -20, 0, 2};

        System.out.println(minNumber1(arr));
        System.out.println(minNumber2(arr));
        System.out.println(minNumber3(arr));
    }
}
