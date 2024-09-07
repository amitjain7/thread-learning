package com.learn.thread.basic.synchronization;

public class ThreadForMultiDisplaySynchronizedMethod1 implements Runnable{

    DisplayWithMultipleMethods displayWithMultipleMethods=null;
    String name=null;
    ThreadForMultiDisplaySynchronizedMethod1(DisplayWithMultipleMethods displayWithMultipleMethods, String name){
        this.displayWithMultipleMethods=displayWithMultipleMethods;
        this.name=name;
    }

    @Override
    public void run() {
        displayWithMultipleMethods.wishSynchronized1(name);
    }
}
