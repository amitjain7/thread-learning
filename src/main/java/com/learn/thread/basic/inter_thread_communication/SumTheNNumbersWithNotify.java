package com.learn.thread.basic.inter_thread_communication;

public class SumTheNNumbersWithNotify {

    int total=0;
    public synchronized void sum() {
        for(int i=1;i<10;i++){
            total=total+i;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
