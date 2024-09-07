package com.learn.thread.basic.synchronization;

public class UseDisplayWithThreadWithSynchronizationTest3 {
    public static void main(String[] args) {
        DisplayWithSynchronized displayWithSynchronized=new DisplayWithSynchronized();

        Runnable taskForAmit=new ThreadForWithSynchronizedDisplay(displayWithSynchronized,"Amit");
        Runnable taskForAnuj=new ThreadForWithSynchronizedDisplay(displayWithSynchronized,"Anuj");

        new Thread(taskForAmit).start();
        new Thread(taskForAnuj).start();


    }
}

