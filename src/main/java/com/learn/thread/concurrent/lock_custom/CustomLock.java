package com.learn.thread.concurrent.lock_custom;

public interface CustomLock {
    void lock();
    void unlock();
    boolean tryLock();
}
