package com.learn.thread.concurrent.lock;

import java.util.concurrent.locks.ReentrantLock;

public class DisplayWithTryLock {
    ReentrantLock reentrantLock = new ReentrantLock();

    public void wish(){
        if(reentrantLock.tryLock()){
            for(int i=0;i<=10;i++){
                System.out.println("First Approach Thread "+Thread.currentThread());
            }
            reentrantLock.unlock();
        }else{
            for(int i=0;i<=10;i++){
                System.out.println("Second Approach Thread "+Thread.currentThread());
            }
        }

    }
}
