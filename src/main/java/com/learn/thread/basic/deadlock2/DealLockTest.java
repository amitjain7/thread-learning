package com.learn.thread.basic.deadlock2;

public class DealLockTest {
    public static void main(String[] args) {
        Shared shared1=new Shared();
        Shared shared2=new Shared();

        Task1 task1=new Task1(shared1,shared2);
        new Thread(task1).start();

        Task2 task2=new Task2(shared1,shared2);
        new Thread(task2).start();


    }
}
