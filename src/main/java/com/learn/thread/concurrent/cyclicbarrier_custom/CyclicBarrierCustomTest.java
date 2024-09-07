package com.learn.thread.concurrent.cyclicbarrier_custom;



public class CyclicBarrierCustomTest {
    public static void main(String[] args) {
        CyclicBarreirCustom cyclicBarrierCustom=new CyclicBarreirCustom(2);

       SendingMailTask t1=new SendingMailTask(cyclicBarrierCustom);
       SendingSMSTask t2=new SendingSMSTask(cyclicBarrierCustom);

        new Thread(t1).start();
        new Thread(t2).start();
    }
}
