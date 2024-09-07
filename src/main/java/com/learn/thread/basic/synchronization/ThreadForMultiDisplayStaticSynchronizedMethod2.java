package com.learn.thread.basic.synchronization;

public class ThreadForMultiDisplayStaticSynchronizedMethod2 implements Runnable{

    DisplayWithMultipleMethods displayWithMultipleMethods=null;
    String name=null;
    ThreadForMultiDisplayStaticSynchronizedMethod2(DisplayWithMultipleMethods displayWithMultipleMethods, String name){
        this.displayWithMultipleMethods=displayWithMultipleMethods;
        this.name=name;
    }

    @Override
    public void run() {
        displayWithMultipleMethods.wishStaticSynchronized2(name);
    }
}
