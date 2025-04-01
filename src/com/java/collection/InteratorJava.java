package com.java.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class InteratorJava {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Orange");
        myList.add("Banana");
        myList.add("Cherry");
        myList.add("Apple");
        Iterator<String> iterator = myList.iterator();
        while(iterator.hasNext()){
            String fruit = iterator.next();
            System.out.println(fruit);
        }
    }
}
