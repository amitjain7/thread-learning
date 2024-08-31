package com.learn.thread.basic.threadclass;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UsingThreadClass extends Thread
{
    public void run(){
        log.info("Thread Start = > "+Thread.currentThread());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info("Thread End = > "+Thread.currentThread());
    }
}
