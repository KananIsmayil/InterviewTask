package com.TaskPractice;

public class sumofDigits {
    public static void main() {
        System.out.println(sumOfDigits("DC51GCA098911"));

    }

    public static int sumOfDigits(String str) {

        char[] c = str.toCharArray();
        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            if (Character.isDigit(c[i])) {
                System.out.print("The numbers in the String : " + c[i]);
                System.out.println();
                int a = Integer.parseInt(String.valueOf(c[i]));
                sum = sum + a;
            }
        }
        return sum;
    }
    public static void main(String[] args) {

        System.out.println(sumOfDigits("DC51GCA098911"));

    }

        /*
    String - sum of digits in a string
Write a method that can return the sum of the digits in a string
     */

//    public static int sumOfDigits1(String str){
//
//        int sum = 0;
//
//        for (int i = 0; i < str.length(); i++) {
//
//            if (Character.isDigit(str.charAt(i))) {
//                sum += Integer.parseInt("" + str.charAt(i));
//            }
//        }
//        return sum;
//    }
}
