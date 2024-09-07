package com.learn.thread.concurrent.countdownlatch;



import java.util.concurrent.*;

public class CountDownLatchTest {
    public static void main(String[] args) {
        CountDownLatch countDownLatch=new CountDownLatch(2);

        SendingMailTask t1=new SendingMailTask(countDownLatch);
        SendingSMSTask t2=new SendingSMSTask(countDownLatch);

        new Thread(t1).start();
        new Thread(t2).start();
        System.out.println("Mail/SMS - Wating for other task complete");
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Mail/SMS - Wating End for other task complete");
    }

}
