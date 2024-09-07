package com.learn.thread.basic.inter_thread_communication;

public class SumOfNNumberWithThreadTest2 {
    public static void main(String[] args) {
        SumTheNNumbers sumTheNNumbers=new SumTheNNumbers();
        SumTheNNumbersTask sumTheNNumbersTask=new SumTheNNumbersTask(sumTheNNumbers);
        Thread t=new Thread(sumTheNNumbersTask);
        t.start();
        System.out.println(sumTheNNumbers.total);

    }

}
