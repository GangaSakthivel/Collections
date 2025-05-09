package com.java.collection;

class A extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Good morning.");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Good afternoon");
        }
    }
}

public class ThreadsJava {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.start();
        b.start();
    }
}
