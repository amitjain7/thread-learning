package com.learn.thread.concurrent.lock;

public class MyTaskWithLock implements Runnable{

    DisplayWithLock display=null;
    MyTaskWithLock(DisplayWithLock display){
        this.display =display;
    }
    @Override
    public void run() {
        display.wish();
    }
}
