package com.homestudy.List;

import java.util.List;

public class ArrayList {

    public static void main(String[] args) {

        List list = new java.util.ArrayList<Integer>();
        // 클래스 명이랑 동일해서 import가 안 되므로 주의할 것.
        // <Integer>는 ArrayList에 Integer 타입이 저장 될 수 있다는 것을 의미함.

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);
        System.out.println(list.get(0));

    }
}
