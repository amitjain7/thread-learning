package com.learn.thread.basic.synchronization;

public class ThreadForWithSynchronizedBlockWithExternalLockDisplay implements Runnable{

    DisplayWithSynchronizedBlockWithExternalLock displayWithSynchronizedBlockWithExternalLock =null;
    String name=null;
    ThreadForWithSynchronizedBlockWithExternalLockDisplay(DisplayWithSynchronizedBlockWithExternalLock  displayWithSynchronizedBlockWithExternalLock , String name){
        this.displayWithSynchronizedBlockWithExternalLock=displayWithSynchronizedBlockWithExternalLock;
        this.name=name;
    }

    @Override
    public void run() {
        displayWithSynchronizedBlockWithExternalLock.wish(name);
    }
}
