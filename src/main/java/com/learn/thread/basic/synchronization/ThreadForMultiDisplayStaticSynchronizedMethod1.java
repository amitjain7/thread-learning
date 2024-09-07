package com.learn.thread.basic.synchronization;

public class ThreadForMultiDisplayStaticSynchronizedMethod1 implements Runnable{

    DisplayWithMultipleMethods displayWithMultipleMethods=null;
    String name=null;
    ThreadForMultiDisplayStaticSynchronizedMethod1(DisplayWithMultipleMethods displayWithMultipleMethods, String name){
        this.displayWithMultipleMethods=displayWithMultipleMethods;
        this.name=name;
    }

    @Override
    public void run() {
        displayWithMultipleMethods.wishStaticSynchronized1(name);
    }
}
