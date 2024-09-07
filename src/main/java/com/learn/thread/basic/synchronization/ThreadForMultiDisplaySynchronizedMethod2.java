package com.learn.thread.basic.synchronization;

public class ThreadForMultiDisplaySynchronizedMethod2 implements Runnable{

    DisplayWithMultipleMethods displayWithMultipleMethods=null;
    String name=null;
    ThreadForMultiDisplaySynchronizedMethod2(DisplayWithMultipleMethods displayWithMultipleMethods, String name){
        this.displayWithMultipleMethods=displayWithMultipleMethods;
        this.name=name;
    }

    @Override
    public void run() {
        displayWithMultipleMethods.wishSynchronized2(name);
    }
}
