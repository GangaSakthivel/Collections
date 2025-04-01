package com.java.collection;

class Outer {
    int number;
    void outerDisplay() {
        System.out.println("Outer Display.");
    }

    class Inner {
        int x;

        void innerDisplay() {
            System.out.println("Inner class.");
        }
    }
}

public class InnerClassJava {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.outerDisplay();

        // Correct instantiation of Inner class
        Outer.Inner i = outer.new Inner();


        i.innerDisplay(); // Calling method of Inner class
    }
}
