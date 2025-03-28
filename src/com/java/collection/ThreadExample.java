package com.java.collection;

class myThread extends Thread{
    public void run(){
        for(int i = 0; i <= 5; i++){
            System.out.println("Runnable thread " + i);
        }

    }
}


public class ThreadExample {
    public static void main(String[] args) {
        myThread mt = new myThread();
        mt.run();

    }

}
