package com.homestudy.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListFor {

    public static void main(String[] args) {

        List list = new ArrayList<String>();

        list.add("자바는");
        list.add("정말");
        list.add("재밌다.");

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.remove(1);
        int funIndex = list.indexOf("재밌다.");
        System.out.println(list);
        System.out.println("재밌다. 의 Index = " + funIndex);

    }

}
