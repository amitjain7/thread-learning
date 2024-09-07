package com.learn.thread.concurrent.lock;

public class MyTaskWithTryLock implements Runnable{

    DisplayWithTryLock display=null;
    MyTaskWithTryLock(DisplayWithTryLock display){
        this.display =display;
    }
    @Override
    public void run() {
        display.wish();
    }
}
