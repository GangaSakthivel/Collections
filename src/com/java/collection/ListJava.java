package com.java.collection;

import java.util.ArrayList;
import java.util.List;

public class ListJava {
    public static void main(String[] args) {
        //creating a list
        //syntax: List<Data types> listname = new implementation<>();

        List<String> fruits = new ArrayList<>();
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Strawberry");
        fruits.add("Avacado");
        fruits.addAll(List.of("Mango", "Grapes"));// Add multiple
        fruits.add(0, "apple");// adding in specific index
        //Accessing Elements
        String firstElement = fruits.getFirst();
        System.out.println(firstElement);
        System.out.println(fruits.get(3));
        System.out.println(fruits.contains("Avacado"));
        int size = fruits.size();
        System.out.println(size);
        boolean exist = fruits.contains("Banana");
        System.out.println(exist);
        System.out.println(fruits.remove("Banana"));
        fruits.set(1, "Cherry");// Replace at index
        fruits.remove(0);// Remove by index
        fruits.remove("Banana");// // Remove by object

        //iterating through a list
        for(int i = 0; i < fruits.size(); i++){
            System.out.println(fruits.get(i));
        }


        //enhance for loop
        for(String fruitsList: fruits){
            System.out.println(fruitsList);

        }



    }


}
