package com.homestudy;

import java.util.ArrayList;
import java.util.List;

public class Stream {


    public static void main(String[] args) {

        List list = new ArrayList<>();

        list.add("자바는");
        list.add("정말루");
        list.add("어렵다");

        list.stream().forEach(str -> System.out.println(str));

    }
}
