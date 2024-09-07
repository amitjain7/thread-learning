package com.learn.thread.basic.inter_thread_communication;

public class SumOfNNumberWithOutThreadTest1 {
    public static void main(String[] args) {
        SumTheNNumbers sumTheNNumbers=new SumTheNNumbers();
        sumTheNNumbers.sum();
        System.out.println(sumTheNNumbers.total);
    }

}
