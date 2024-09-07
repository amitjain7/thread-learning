package com.learn.thread.concurrent.lock_custom;

public class CustomLockTask implements Runnable{
    CustomLock customLock;
    CustomLockTask(CustomLock customLock){
        this.customLock=customLock;
    }

    @Override
    public void run() {
        customLock.lock();
        for(int i=0;i<=10;i++){
            System.out.println("Thread "+Thread.currentThread());
        }
        customLock.unlock();
    }
}
