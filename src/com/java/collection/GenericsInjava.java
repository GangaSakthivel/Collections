package com.java.collection;



public class GenericsInjava {
    public static void main(String[] args) {
        Printer<Integer> p = new Printer<>(23);
        p.print();

    }
}
