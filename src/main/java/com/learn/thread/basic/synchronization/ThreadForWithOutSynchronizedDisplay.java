package com.learn.thread.basic.synchronization;

public class ThreadForWithOutSynchronizedDisplay implements Runnable{

    DisplayWithOutSynchronized displayWithOutSynchronized=null;
    String name=null;
    ThreadForWithOutSynchronizedDisplay(DisplayWithOutSynchronized displayWithOutSynchronized,String name){
        this.displayWithOutSynchronized=displayWithOutSynchronized;
        this.name=name;
    }

    @Override
    public void run() {
        displayWithOutSynchronized.wish(name);
    }
}
