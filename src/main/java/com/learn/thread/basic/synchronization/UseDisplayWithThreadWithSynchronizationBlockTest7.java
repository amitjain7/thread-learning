package com.learn.thread.basic.synchronization;

public class UseDisplayWithThreadWithSynchronizationBlockTest7 {
    public static void main(String[] args) {
        DisplayWithSynchronizedBlock displayWithSynchronizedBlock=new DisplayWithSynchronizedBlock();

        Runnable task1=new ThreadForWithSynchronizedBlockDisplay(displayWithSynchronizedBlock,"Amit1");
        Runnable task2=new ThreadForWithSynchronizedBlockDisplay(displayWithSynchronizedBlock,"Amit2");
        Runnable task3=new ThreadForWithSynchronizedBlockDisplay(displayWithSynchronizedBlock,"Amit3");
        Runnable task4=new ThreadForWithSynchronizedBlockDisplay(displayWithSynchronizedBlock,"Amit4");
        Runnable task5=new ThreadForWithSynchronizedBlockDisplay(displayWithSynchronizedBlock,"Amit5");
        Runnable task6=new ThreadForWithSynchronizedBlockDisplay(displayWithSynchronizedBlock,"Amit6");
        Runnable task7=new ThreadForWithSynchronizedBlockDisplay(displayWithSynchronizedBlock,"Amit7");
        Runnable task8=new ThreadForWithSynchronizedBlockDisplay(displayWithSynchronizedBlock,"Amit8");

        new Thread(task1).start();
        new Thread(task2).start();
        new Thread(task3).start();
        new Thread(task4).start();
        new Thread(task5).start();
        new Thread(task6).start();
        new Thread(task7).start();
        new Thread(task8).start();



    }
}

