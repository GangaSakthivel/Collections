package com.java.collection;

import java.util.HashSet;
import java.util.Set;

public class SetJava {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Ganga");
        names.add("Ganga"); //duplicates ignored
        names.add("vino");
        names.add("Neha");
        System.out.println(names);

        boolean hasAlice = names.contains("Alice");
        System.out.println(hasAlice);// false there is no name such as alice
        names.remove("vino");

        for (String name : names) {
            System.out.println(name);
        }
        

    }
    }

