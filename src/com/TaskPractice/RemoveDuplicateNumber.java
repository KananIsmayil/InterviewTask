package com.TaskPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateNumber {

    public static void main(String[] args) {
        String str = "AAABBBCCC";
        String [] eachChar = str.split("");     // creating new array to store for String type
        Set<String> duplicate = new HashSet<>(Arrays.asList(eachChar));  //Hashset doesn't accept duplicate element
        String result = "";  // creating empty string to store non duplicate element
        for (String each:duplicate) {      // convert element from hashset to string
            result+= each;   //   each element A,B,C
        }
        System.out.println(result);







    }
}
