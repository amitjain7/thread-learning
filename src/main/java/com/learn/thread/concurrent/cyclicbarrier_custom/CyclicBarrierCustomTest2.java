package com.learn.thread.concurrent.cyclicbarrier_custom;



public class CyclicBarrierCustomTest2 {
    public static void main(String[] args) {
        Runnable event=()->{
            System.out.println("Final event after all task completed..");
        };
        CyclicBarreirCustom cyclicBarrierCustom=new CyclicBarreirCustom(2,event);

       SendingMailTask t1=new SendingMailTask(cyclicBarrierCustom);
       SendingSMSTask t2=new SendingSMSTask(cyclicBarrierCustom);

        new Thread(t1).start();
        new Thread(t2).start();
    }
}
