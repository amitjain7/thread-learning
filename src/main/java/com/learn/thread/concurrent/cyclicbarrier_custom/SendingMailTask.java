package com.learn.thread.concurrent.cyclicbarrier_custom;

import java.util.concurrent.CyclicBarrier;

public class SendingMailTask implements Runnable{

    CyclicBarreirCustom cyclicBarrier=null;
    SendingMailTask(CyclicBarreirCustom cyclicBarrier){
        this.cyclicBarrier=cyclicBarrier;
    }

    @Override
    public void run() {
        System.out.println("Start sending Mail");
        try {
            Thread.sleep(4000);
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
