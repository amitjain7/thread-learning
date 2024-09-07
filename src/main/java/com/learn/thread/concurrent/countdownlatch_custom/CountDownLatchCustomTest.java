package com.learn.thread.concurrent.countdownlatch_custom;



public class CountDownLatchCustomTest {
    public static void main(String[] args) {
        CountDownLatchCustom countDownLatchCustom=new CountDownLatchCustom(2);

        SendingMailTask t1=new SendingMailTask(countDownLatchCustom);
        SendingSMSTask t2=new SendingSMSTask(countDownLatchCustom);


        new Thread(t1).start();
        new Thread(t2).start();
        System.out.println("Mail/SMS - Wating for other task complete");
        try {
            countDownLatchCustom.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Mail/SMS - Wating End for other task complete");
    }
}
