package com.learn.thread.basic.synchronization;

public class UseDisplayWithThreadWithStaticSynchronizationForTwoDisplayTest5 {
    public static void main(String[] args) {
        DisplayWithStaticSynchronized displayWithStaticSynchronized1=new DisplayWithStaticSynchronized();
        DisplayWithStaticSynchronized displayWithStaticSynchronized2=new DisplayWithStaticSynchronized();

        Runnable taskForAmit=new ThreadForWithStaticSynchronizedDisplay(displayWithStaticSynchronized1,"Amit");
        Runnable taskForAnuj=new ThreadForWithStaticSynchronizedDisplay(displayWithStaticSynchronized2,"Anuj");

        new Thread(taskForAmit).start();
        new Thread(taskForAnuj).start();


    }
}

