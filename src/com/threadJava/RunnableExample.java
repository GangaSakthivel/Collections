package com.threadJava;

class B implements Runnable{
    @Override
    public void run() {
        System.out.println("Runnable interface...");
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new B());
        t1.start();

    }
}
