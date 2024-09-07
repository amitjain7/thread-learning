package com.learn.thread.basic.deadlock2;

public class Task2 implements Runnable{
    private Shared shared1;
    private Shared shared2;

    Task2(Shared shared1, Shared shared2){
        this.shared1=shared1;
        this.shared2=shared2;
    }

    @Override
    public void run() {
        shared2.test2(shared1);
    }
}
