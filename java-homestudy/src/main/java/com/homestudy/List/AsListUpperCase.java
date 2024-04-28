package com.homestudy.List;

import java.util.Arrays;
import java.util.List;

public class AsListUpperCase {

    public static void main(String[] args) {

        String[] lowercaseArray = new String[] {"java", "is", "fun"};
        List<String> lowercaseList = Arrays.asList(lowercaseArray);
        List<String> uppercaseList = lowercaseList.stream().map(value -> value.toUpperCase()).toList();

        uppercaseList.stream().forEach(value -> System.out.println(value));

    }
}
