package com.java.collection;

class OuterClass{
    int number;

    void OuterMethod(){
        System.out.println("This is outer class. ");
    }

    class InnerClass{
        int innerNumber;
        void innerMethod(){
            System.out.println("This is inner class.");
        }
    }

        }

public class InnerClassTwo {
    public static void main(String[] args) {

        OuterClass oc = new OuterClass();
        oc.OuterMethod();

        OuterClass.InnerClass ic = oc.new InnerClass();
        ic.innerMethod();

    }
}
