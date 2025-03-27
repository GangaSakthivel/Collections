package com.java.collection;
import java.util.ArrayList;
import java.util.Collection;



public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> fruitCollection = new ArrayList<>();
        fruitCollection.add("Banana");
        fruitCollection.add("Apple");
        fruitCollection.add("Mango");
        fruitCollection.add("Orange");
        System.out.println(fruitCollection);
        for(String number: fruitCollection){
            System.out.println(number);
        }
        }

    }




//graph TD;
//    Collection --> List;
//    Collection --> Set;
//    Collection --> Queue;
//    List --> ArrayList;
//    List --> LinkedList;
//    Set --> HashSet;
//    Set --> TreeSet;
//    Queue --> PriorityQueue;
//    Queue --> LinkedList;