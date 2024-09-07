package com.learn.thread.basic.synchronization;

public class ThreadForWithStaticSynchronizedBlockDisplay implements Runnable{

    DisplayWithStaticSynchronizedBlock  displayWithStaticSynchronizedBlock=null;
    String name=null;
    ThreadForWithStaticSynchronizedBlockDisplay(DisplayWithStaticSynchronizedBlock  displayWithStaticSynchronizedBlock , String name){
        this.displayWithStaticSynchronizedBlock=displayWithStaticSynchronizedBlock;
        this.name=name;
    }

    @Override
    public void run() {

        displayWithStaticSynchronizedBlock.wish(name);
    }
}
