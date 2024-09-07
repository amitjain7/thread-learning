package com.learn.thread.basic.synchronization;

public class UseDisplayWithThreadWithStaticSynchronizationBlockTest8 {
    public static void main(String[] args) {
        DisplayWithStaticSynchronizedBlock displayWithStaticSynchronizedBlock1=new DisplayWithStaticSynchronizedBlock();
        DisplayWithStaticSynchronizedBlock displayWithStaticSynchronizedBlock2=new DisplayWithStaticSynchronizedBlock();


        Runnable task1=new ThreadForWithStaticSynchronizedBlockDisplay(displayWithStaticSynchronizedBlock1,"Amit1");
        Runnable task2=new ThreadForWithStaticSynchronizedBlockDisplay(displayWithStaticSynchronizedBlock2,"Amit2");

        new Thread(task1).start();
        new Thread(task2).start();
    }
}

