package com.learn.thread.basic.threadclass;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UsingThreadClassTest {
    public static void main(String[] args) {
        log.info("Main Start = > "+Thread.currentThread());
        UsingThreadClass t=new UsingThreadClass();
        t.start();
        UsingThreadClass t2=new UsingThreadClass();
        t2.start();
        log.info("Main End = > "+Thread.currentThread());
    }
}
