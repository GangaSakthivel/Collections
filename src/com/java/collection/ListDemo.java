package com.java.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Element1");
        list.add("Element1");
        list.add("Element3");
        list.add("");

        //adding the null
        list.add(null);
        list.add(null);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(3));
    }
}
