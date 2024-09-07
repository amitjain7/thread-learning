package com.learn.thread.concurrent.countdownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class SendingSMSTask implements Runnable{

    CountDownLatch countDownLatch=null;
    SendingSMSTask(CountDownLatch countDownLatch){
        this.countDownLatch=countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("Start sending SMS");
        try {
            Thread.sleep(2000);
            System.out.println("Sending SMS done");
            countDownLatch.countDown();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("End run");
    }
}
