package com.learn.thread.concurrent.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class ConsumerTask implements Runnable{
    BlockingQueue<String> queue=null;
    ConsumerTask(BlockingQueue queue){
        this.queue=queue;
    }
    @Override
    public void run() {
        while(true){
            try {
                String data=queue.take();
                System.out.println("Consume --------> "+data);
                Thread.sleep(3000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
    }
}
