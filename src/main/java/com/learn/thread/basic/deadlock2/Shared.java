package com.learn.thread.basic.deadlock2;

public class Shared {
    public synchronized void test1(Shared sharedInstance2){
        System.out.println("Start test1");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        sharedInstance2.test2(this);
        System.out.println("End test1");
    }

    public synchronized void test2(Shared sharedInstance1){
        System.out.println("Start test2");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        sharedInstance1.test1(this);
        System.out.println("End test2");
    }
}
