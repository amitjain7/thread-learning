package com.learn.thread.basic.inter_thread_communication;

public class SumOfNNumberWithThreadAndWaitAndNotifyTest3 {
    public static void main(String[] args) {
        SumOfNNumberWithThreadAndWaitAndNotifyTest3 test=new SumOfNNumberWithThreadAndWaitAndNotifyTest3();
        test.checkTotal();
    }

    public  void checkTotal(){
        SumTheNNumbersWithNotify sumTheNNumbersWithNotify=new SumTheNNumbersWithNotify();
        SumTheNNumbersTaskWithNotify sumTheNNumbersTaskWithNotify=new SumTheNNumbersTaskWithNotify(sumTheNNumbersWithNotify);
        Thread t=new Thread(sumTheNNumbersTaskWithNotify);
        t.start();
        synchronized (sumTheNNumbersTaskWithNotify) {
            try {
                sumTheNNumbersTaskWithNotify.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(sumTheNNumbersWithNotify.total);

    }

}
