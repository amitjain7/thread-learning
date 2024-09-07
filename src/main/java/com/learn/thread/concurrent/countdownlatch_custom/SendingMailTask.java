package com.learn.thread.concurrent.countdownlatch_custom;

public class SendingMailTask implements Runnable{

    CountDownLatchCustom countDownLatch=null;
    SendingMailTask(CountDownLatchCustom countDownLatch){
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
