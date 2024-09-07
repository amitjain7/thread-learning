package com.learn.thread.concurrent.countdownlatch;


import java.util.concurrent.CountDownLatch;

public class SendingMailTask implements Runnable{

    CountDownLatch countDownLatch=null;
    SendingMailTask(CountDownLatch countDownLatch){
        this.countDownLatch=countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("Start sending Mail");
        try {
            Thread.sleep(2000);
            System.out.println("Sending Mail done");
            countDownLatch.countDown();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("End run");
    }
}
