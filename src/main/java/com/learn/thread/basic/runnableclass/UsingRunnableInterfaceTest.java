package com.learn.thread.basic.runnableclass;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UsingRunnableInterfaceTest {
    public static void main(String[] args) {
        log.info("Main Start = > "+Thread.currentThread());
        Thread t=new Thread(new UsingRunnableInterface(),"Custom-T");
        t.start();
        log.info("Main End = > "+Thread.currentThread());
    }
}
