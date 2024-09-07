package com.learn.thread.basic.synchronization;

public class ThreadForMultiDisplayStaticSimpleMethod implements Runnable{

    DisplayWithMultipleMethods displayWithMultipleMethods=null;
    String name=null;
    ThreadForMultiDisplayStaticSimpleMethod(DisplayWithMultipleMethods displayWithMultipleMethods, String name){
        this.displayWithMultipleMethods=displayWithMultipleMethods;
        this.name=name;
    }

    @Override
    public void run() {

        displayWithMultipleMethods.wishStaticSimple(name);
    }
}
