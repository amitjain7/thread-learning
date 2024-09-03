package com.learn.thread.basic.lambdafunction;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThreadTest {
    public static void main(String[] args) {
        log.info("Start main "+Thread.currentThread());

        new Thread(()->{
                    log.info("Start play "+Thread.currentThread());
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    log.info("End play "+Thread.currentThread());
                }).start();

        log.info("End main "+Thread.currentThread());
    }
}
