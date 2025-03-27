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

        fruitCollection.remove("Banana");
        System.out.println(fruitCollection);
//        for(String number: fruitCollection){
//            System.out.println(number);
//        }

        System.out.println(fruitCollection.contains("orange"));
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

//A collection tracks the number of elements it contains
//The capacity of a collection is not limited: you can add (almost) any amount of elements in a collection
//A collection can control what elements you may store in it. For instance, you can prevent null elements to be added
//A collection can be queried for the presence of a given element
//A collection provides operations like intersecting or merging with another collection.