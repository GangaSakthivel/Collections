package com.threadJava;

class A extends Thread{
    @Override
    public void run() {
        System.out.println("The program is running. ");
    }
}

public class ExampleThrea {
    public static void main(String[] args) {
        A a = new A();
        a.start(); // Starts the thread (calls run())

    }
}
