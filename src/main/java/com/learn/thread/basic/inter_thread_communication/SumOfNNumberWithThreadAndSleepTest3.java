package com.learn.thread.basic.inter_thread_communication;

public class SumOfNNumberWithThreadAndSleepTest3 {
    public static void main(String[] args) {
        SumTheNNumbers sumTheNNumbers=new SumTheNNumbers();
        SumTheNNumbersTask sumTheNNumbersTask=new SumTheNNumbersTask(sumTheNNumbers);
        Thread t=new Thread(sumTheNNumbersTask);
        t.start();

        try {
            Thread.sleep(1100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(sumTheNNumbers.total);

    }

}
