package com.homestudy;

public class GetSumeString {

    private static String getSomeString() {
        return null;
    }

    public static void main(String[] args) {

        String isThisNull = getSomeString();

        if(null != isThisNull) {
            System.out.println(isThisNull.toUpperCase());
        }
        
    }
}
