package com.learn.thread.concurrent.cyclicbarrier_custom;

import java.util.concurrent.CyclicBarrier;

public class SendingSMSTask implements Runnable{

    CyclicBarreirCustom cyclicBarrier=null;
    SendingSMSTask(CyclicBarreirCustom cyclicBarrier){
        this.cyclicBarrier=cyclicBarrier;
    }

    @Override
    public void run() {
        System.out.println("Start sending SMS");
        try {
            Thread.sleep(2000);
            System.out.println("Sending SMS done");
            System.out.println("SMS - Wating for other task complete");
            cyclicBarrier.await();
            System.out.println("SMS - Wating End for other task complete");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("End run");
    }
}
