package com.learn.thread.concurrent.lock;

public class LockTest2 {
    public static void main(String[] args) {
        DisplayWithTryLock display=new DisplayWithTryLock();

        MyTaskWithTryLock t1=new MyTaskWithTryLock(display);
        MyTaskWithTryLock t2=new MyTaskWithTryLock(display);

        new Thread(t1).start();
        new Thread(t2).start();

    }
}
