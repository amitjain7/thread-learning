package com.learn.thread.basic.inter_thread_communication;

public class SumTheNNumbersTask implements Runnable{

    SumTheNNumbers sumTheNNumbers=null;
    SumTheNNumbersTask(SumTheNNumbers sumTheNNumbers){
        this.sumTheNNumbers=sumTheNNumbers;
    }

    @Override
    public void run() {
        sumTheNNumbers.sum();
    }
}
