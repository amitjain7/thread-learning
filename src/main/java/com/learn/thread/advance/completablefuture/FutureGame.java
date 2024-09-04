package com.learn.thread.advance.completablefuture;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FutureGame {
    public static String play(String name,int sec,boolean fail){
        log.info("Start play() with Task - "+name+"  ::  "+Thread.currentThread());

        try {
            Thread.sleep(sec);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if(fail){
            log.info("End play() with Exception in task - "+ name+ " - "+Thread.currentThread());
            throw new RuntimeException("FAILED");
        }

        log.info("End play() with Task - "+name+"  ::  "+Thread.currentThread());
        return "SUCCESS";
    }
}

