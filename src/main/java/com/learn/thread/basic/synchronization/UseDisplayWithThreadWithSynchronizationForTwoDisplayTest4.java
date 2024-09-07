package com.learn.thread.basic.synchronization;

public class UseDisplayWithThreadWithSynchronizationForTwoDisplayTest4 {
    public static void main(String[] args) {
        DisplayWithSynchronized displayWithSynchronized1=new DisplayWithSynchronized();
        DisplayWithSynchronized displayWithSynchronized2=new DisplayWithSynchronized();

        Runnable taskForAmit=new ThreadForWithSynchronizedDisplay(displayWithSynchronized1,"Amit");
        Runnable taskForAnuj=new ThreadForWithSynchronizedDisplay(displayWithSynchronized2,"Anuj");

        new Thread(taskForAmit).start();
        new Thread(taskForAnuj).start();


    }
}

