package com.learn.thread.concurrent.countdownlatch_custom;

public class CountDownLatchCustom {
    int count=0;
    CountDownLatchCustom(int count){
        this.count=count;
    }

    public synchronized void await() throws InterruptedException{
        if(count>0){
            this.wait();
        }
    }

    public synchronized void countDown(){
        count--;
        if(count==0){
            this.notifyAll();
        }
    }

}
