package com.TaskPractice;

import java.util.*;
import java.util.stream.Collectors;

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

        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,1,5,6,6,6,6,7,7,0,9));
        //        1. LinkedHashSet
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(numbers);
        ArrayList<Integer>numberListWithoutDuplicates = new ArrayList<Integer>(linkedHashSet);
        System.out.println("numberListWithoutDuplicates = " + numberListWithoutDuplicates);
//        1.1. with string as data
        ArrayList<String> threeMusk = new ArrayList<String>(Arrays.asList("Sasha","Kanan","Kanan","Vicky"));
        LinkedHashSet<String>linkedThreeMusk = new LinkedHashSet<String>(threeMusk);
        System.out.println("linkedThreeMusk = " + linkedThreeMusk);

//        2. JDK 8 -stream:
        ArrayList<Integer> streamNumbers = new ArrayList<Integer>(Arrays.asList(1,1,5,6,6,6,6,7,7,0,9));
        List<Integer>streamNumbersUnique = streamNumbers.stream().distinct().collect(Collectors.toList());
        System.out.println("streamNumbersUnique = " + streamNumbersUnique);
//        2.1 stream with string
        ArrayList<String> streamThreeMusk = new ArrayList<String>(Arrays.asList("Sasha","Kanan","Kanan","Vicky"));
        List<String>streamThreeMuskUnique = streamThreeMusk.stream().distinct().collect(Collectors.toList());
        System.out.println("streamThreeMuskUnique = " + streamThreeMuskUnique);







    }
}
