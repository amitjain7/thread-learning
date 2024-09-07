package com.learn.thread.basic.synchronization;

public class ThreadForWithSynchronizedBlockDisplay implements Runnable{

    DisplayWithSynchronizedBlock displayWithSynchronizedBlock =null;
    String name=null;
    ThreadForWithSynchronizedBlockDisplay(DisplayWithSynchronizedBlock  displayWithSynchronizedBlock , String name){
        this.displayWithSynchronizedBlock=displayWithSynchronizedBlock;
        this.name=name;
    }

    @Override
    public void run() {
        displayWithSynchronizedBlock.wish(name);
    }
}
