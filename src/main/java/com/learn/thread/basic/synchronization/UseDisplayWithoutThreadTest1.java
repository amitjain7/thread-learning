package com.learn.thread.basic.synchronization;

public class UseDisplayWithoutThreadTest1 {
    public static void main(String[] args) {
        DisplayWithOutSynchronized d=new DisplayWithOutSynchronized();
        d.wish("Amit");
        d.wish("Anuj");
    }
}