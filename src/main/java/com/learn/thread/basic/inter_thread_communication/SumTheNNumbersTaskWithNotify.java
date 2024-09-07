package com.learn.thread.basic.inter_thread_communication;

public class SumTheNNumbersTaskWithNotify implements Runnable{

    SumTheNNumbersWithNotify sumTheNNumbersWithNotify=null;
    SumTheNNumbersTaskWithNotify(SumTheNNumbersWithNotify sumTheNNumbersWithNotify){
        this.sumTheNNumbersWithNotify=sumTheNNumbersWithNotify;
    }

    @Override
    public void run() {
        synchronized (this) {
        sumTheNNumbersWithNotify.sum();
            try {
                this.notify();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("After Notify before sleep...");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("After Notify after sleep...");

    }
}
