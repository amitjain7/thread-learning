package com.learn.thread.concurrent.lock_custom;

public class CustomReentrantLock implements CustomLock{

    int lockHoldCount;
    long idOfThreadCurrentHoldingLock;

    @Override
    public synchronized void lock() {
        if(lockHoldCount==0){
            lockHoldCount++;
            idOfThreadCurrentHoldingLock=Thread.currentThread().getId();
        }
        else if(lockHoldCount>0
                && idOfThreadCurrentHoldingLock==Thread.currentThread().getId()){
            lockHoldCount++;
        }
        else{
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            lock();
        }
    }

    @Override
    public synchronized void unlock() {
        if(lockHoldCount==0){
            throw new RuntimeException("There is no lock");
        }
        lockHoldCount--;
        if(lockHoldCount==0){
            notify();
        }
    }

    @Override
    public synchronized boolean tryLock() {
        if(lockHoldCount==0){
            lock();
            return true;
        }
        else{
            return false;
        }
    }
}
