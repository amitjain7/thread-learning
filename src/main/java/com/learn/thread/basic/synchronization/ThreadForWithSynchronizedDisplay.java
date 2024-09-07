package com.learn.thread.basic.synchronization;

public class ThreadForWithSynchronizedDisplay implements Runnable{

    DisplayWithSynchronized displayWithSynchronized=null;
    String name=null;
    ThreadForWithSynchronizedDisplay(DisplayWithSynchronized displayWithSynchronized, String name){
        this.displayWithSynchronized=displayWithSynchronized;
        this.name=name;
    }

    @Override
    public void run() {
        displayWithSynchronized.wish(name);
    }
}
