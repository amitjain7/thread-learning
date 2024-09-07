package com.learn.thread.concurrent.countdownlatch_custom;

public class SendingSMSTask implements Runnable{

    CountDownLatchCustom countDownLatch=null;
    SendingSMSTask(CountDownLatchCustom countDownLatch){
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
