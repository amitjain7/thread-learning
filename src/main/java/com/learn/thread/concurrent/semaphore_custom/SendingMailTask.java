package com.learn.thread.concurrent.semaphore_custom;


import java.util.concurrent.Semaphore;

public class SendingMailTask implements Runnable{

    SemaphoreCustom semaphore=null;
    SendingMailTask(SemaphoreCustom semaphore){
        this.semaphore=semaphore;
    }

    @Override
    public void run() {
        System.out.println("Start sending Mail");
        System.out.println(Thread.currentThread()+" Thread wating for permit");

        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread()+" Thread got the permit");
            Thread.sleep(2000);
            System.out.println("Sending Mail done");
            semaphore.release();
            System.out.println(Thread.currentThread()+" Thread release the permit");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("End run");
    }
}
