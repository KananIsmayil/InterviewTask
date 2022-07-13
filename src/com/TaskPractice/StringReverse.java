package com.TaskPractice;

public class StringReverse {

    public static void main(String[] args) {
        String str = "Java is fun";
        String result = "";
        result+=new StringBuilder(str).reverse();
        System.out.println(result);
    }



}
