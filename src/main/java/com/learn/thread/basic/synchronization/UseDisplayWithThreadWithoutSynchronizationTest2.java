package com.learn.thread.basic.synchronization;

public class UseDisplayWithThreadWithoutSynchronizationTest2 {
    public static void main(String[] args) {
        DisplayWithOutSynchronized displayWithOutSynchronized=new DisplayWithOutSynchronized();

        Runnable taskForAmit=new ThreadForWithOutSynchronizedDisplay(displayWithOutSynchronized,"Amit");
        Runnable taskForAnuj=new ThreadForWithOutSynchronizedDisplay(displayWithOutSynchronized,"Anuj");

        new Thread(taskForAmit).start();
        new Thread(taskForAnuj).start();


    }
}

