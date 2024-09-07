package com.learn.thread.concurrent.cyclicbarrier;
import java.util.concurrent.*;

public class CyclicBarrierTest {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier=new CyclicBarrier(2);

        SendingMailTask t1=new SendingMailTask(cyclicBarrier);
        SendingSMSTask t2=new SendingSMSTask(cyclicBarrier);

        new Thread(t1).start();
        new Thread(t2).start();
    }

}
