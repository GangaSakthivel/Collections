package com.java.collection;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("apple", 10);
        map.put("Banana", 10);
        map.put("Orange", 20);
        map.put("Strawberry", 70);
        System.out.println(map.get("Strawberry"));
        System.out.println(map.containsKey("apple"));

        for(Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        Map<String, Integer> linkedMap = new LinkedHashMap<>();
        linkedMap.put("Zebra", 10);
        linkedMap.put("Apple", 20);
        linkedMap.put("Orange", 49);
        System.out.println(linkedMap);

    }
}
