package com.learn.thread.concurrent.lock;

import java.util.concurrent.locks.*;

public class DisplayWithLock {
    ReentrantLock reentrantLock = new ReentrantLock();

    public void wish(){
        reentrantLock.lock();
        for(int i=0;i<=10;i++){
            System.out.println("Thread "+Thread.currentThread());
        }
        reentrantLock.unlock();
    }
}
