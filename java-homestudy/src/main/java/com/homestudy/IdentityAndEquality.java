package com.homestudy;

public class IdentityAndEquality {

    public static void main(String[] args) {

        String str1 = new String("is same?");
        String str2 = new String("is same?");

        System.out.println(str1 == str2); // false

        System.out.println(str1.equals(str2)); // true
        System.out.println(str2.equals(str1)); // true


    }
}
