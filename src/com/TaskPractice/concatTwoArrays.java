package com.TaskPractice;

import java.util.Arrays;

public class concatTwoArrays { public static void main(String[] args) {// first I am creating and assigning 2 int arrays
//        then I am going  to create my return method
    int [] a = {10,20,30,40,};
    int [] b = {55,66,77};

    int[] merge = concatTwoArrays(a,b);
    System.out.println("arrays concatenated" + Arrays.toString(merge));// in order not to get hash code I have to
//        to String method so I can print the entire Array, this can be also part of method but the return type must be String
//        my return type is int[]


}


    public static int[] concatTwoArrays(int [] ar1, int [] ar2) {//return type is int array and I also have int []
// in the paramether which I will use in array merge above (a,b)
        int arrLength = ar1.length + ar2.length;
        int[] concatArr = new int[arrLength];//I am assigning new array with merged two arrays to have the size of the length of both arrays

        int position = 0;// I create position so I can order the element in concatArr one by one
        for (int element : ar1) {
            concatArr[position] = element;
            position++;
        }
        for (int element : ar2) {
            concatArr[position] = element;
            position++;
        }
        return concatArr;
    }

}
