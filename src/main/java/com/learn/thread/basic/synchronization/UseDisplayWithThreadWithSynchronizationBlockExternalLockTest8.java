package com.learn.thread.basic.synchronization;

public class UseDisplayWithThreadWithSynchronizationBlockExternalLockTest8 {
    public static void main(String[] args) {
        MyLock lock=new MyLock();
        DisplayWithSynchronizedBlockWithExternalLock displayWithSynchronizedBlockWithExternalLock1=new DisplayWithSynchronizedBlockWithExternalLock(lock);
        DisplayWithSynchronizedBlockWithExternalLock displayWithSynchronizedBlockWithExternalLock2=new DisplayWithSynchronizedBlockWithExternalLock(lock);

        Runnable task1=new ThreadForWithSynchronizedBlockWithExternalLockDisplay(displayWithSynchronizedBlockWithExternalLock1,"Amit1");
        Runnable task2=new ThreadForWithSynchronizedBlockWithExternalLockDisplay(displayWithSynchronizedBlockWithExternalLock2,"Amit2");


        new Thread(task1).start();
        new Thread(task2).start();




    }
}

