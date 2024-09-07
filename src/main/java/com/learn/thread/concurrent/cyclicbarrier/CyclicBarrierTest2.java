package com.learn.thread.concurrent.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest2 {
    public static void main(String[] args) {
        Runnable event=()->{
            System.out.println("Final event after all task completed..");
        };
        CyclicBarrier cyclicBarrier=new CyclicBarrier(2,event);

        SendingMailTask t1=new SendingMailTask(cyclicBarrier);
        SendingSMSTask t2=new SendingSMSTask(cyclicBarrier);

        new Thread(t1).start();
        new Thread(t2).start();
    }

}
