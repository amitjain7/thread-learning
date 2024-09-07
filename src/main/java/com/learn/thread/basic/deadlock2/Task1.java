package com.learn.thread.basic.deadlock2;

public class Task1 implements Runnable{
    private Shared shared1;
    private Shared shared2;

    Task1(Shared shared1, Shared shared2){
        this.shared1=shared1;
        this.shared2=shared2;
    }

    @Override
    public void run() {
        shared1.test1(shared2);
    }
}
