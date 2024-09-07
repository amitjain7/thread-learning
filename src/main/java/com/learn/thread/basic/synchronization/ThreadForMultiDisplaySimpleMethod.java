package com.learn.thread.basic.synchronization;

public class ThreadForMultiDisplaySimpleMethod implements Runnable{

    DisplayWithMultipleMethods displayWithMultipleMethods=null;
    String name=null;
    ThreadForMultiDisplaySimpleMethod(DisplayWithMultipleMethods displayWithMultipleMethods, String name){
        this.displayWithMultipleMethods=displayWithMultipleMethods;
        this.name=name;
    }

    @Override
    public void run() {
        displayWithMultipleMethods.wishSimple(name);
    }
}
