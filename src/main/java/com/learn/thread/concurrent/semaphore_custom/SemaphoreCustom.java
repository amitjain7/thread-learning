package com.learn.thread.concurrent.semaphore_custom;

public class SemaphoreCustom {
    int permits;
    int initialPermits;

    SemaphoreCustom(int permits){
        this.permits=permits;
        this.initialPermits=permits;
    }
    public synchronized void acquire(){
        if(permits>0){
            permits--;
        }
        else{
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public synchronized void release(){
        if(initialPermits>permits){
            permits++;
            notifyAll();
        }

    }
}
