package com.learn.thread.basic.methodreference;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThreadGame {
    public static void play(){
        log.info("Start play "+Thread.currentThread());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info("End play "+Thread.currentThread());
    }
}
