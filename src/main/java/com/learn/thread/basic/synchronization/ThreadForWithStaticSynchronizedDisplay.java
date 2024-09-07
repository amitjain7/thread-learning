package com.learn.thread.basic.synchronization;

public class ThreadForWithStaticSynchronizedDisplay implements Runnable{

    DisplayWithStaticSynchronized displayWithStaticSynchronized=null;
    String name=null;
    ThreadForWithStaticSynchronizedDisplay(DisplayWithStaticSynchronized displayWithStaticSynchronized, String name){
        this.displayWithStaticSynchronized=displayWithStaticSynchronized;
        this.name=name;
    }

    @Override
    public void run() {
        displayWithStaticSynchronized.wish(name);
    }
}
