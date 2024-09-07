package com.learn.thread.concurrent.lock;

public class LockTest {
    public static void main(String[] args) {
        DisplayWithLock display=new DisplayWithLock();

        MyTaskWithLock t1=new MyTaskWithLock(display);
        MyTaskWithLock t2=new MyTaskWithLock(display);

        new Thread(t1).start();
        new Thread(t2).start();

    }
}
