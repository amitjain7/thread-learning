package com.learn.thread.concurrent.lock_custom;

public class CustomLockTest {
    public static void main(String[] args) {
        CustomLock lock=new CustomReentrantLock();

        CustomLockTask task1=new CustomLockTask(lock);
        CustomLockTask task2=new CustomLockTask(lock);

        new Thread(task1).start();
        new Thread(task2).start();
    }
}
