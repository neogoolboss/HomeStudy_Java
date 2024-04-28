package com.homestudy.List;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AsList2 {

    public static void main(String[] args) {

        Integer[] integerArray = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        List<Integer> list = Arrays.asList(integerArray);

        List evenList = list.stream().filter(value -> value % 2 == 0).collect(Collectors.toList());

        evenList.stream().forEach(value -> System.out.println(value));
        System.out.println("------");
        list.stream().forEach(value -> System.out.println(value));

    }

}
