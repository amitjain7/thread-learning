package com.learn.thread.basic.methodreference;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThreadUsingMethodReference {
    public static void main(String[] args) {
        log.info("Start main "+Thread.currentThread());
        Thread t=new Thread(ThreadGame::play);
        t.start();
        log.info("End main "+Thread.currentThread());
    }
}
