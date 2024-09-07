package com.learn.thread.concurrent.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

public class SendingMailTask implements Runnable{

    CyclicBarrier cyclicBarrier=null;
    SendingMailTask(CyclicBarrier cyclicBarrier){
        this.cyclicBarrier=cyclicBarrier;
    }

    @Override
    public void run() {
        System.out.println("Start sending Mail");
        try {
            Thread.sleep(7000);
            System.out.println("Sending Mail done");
            System.out.println("Mail - Wating for other task complete");
            cyclicBarrier.await();
            System.out.println("Mail - Wating End for other task complete");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("End run");
    }
}
