package com.learn.thread.basic.runnableclass;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UsingRunnableInterface implements Runnable{
    @Override
    public void run() {
        log.info("Thread Start = > "+Thread.currentThread());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info("Thread End = > "+Thread.currentThread());
    }
}
