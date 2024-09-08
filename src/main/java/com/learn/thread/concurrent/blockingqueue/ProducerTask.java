package com.learn.thread.concurrent.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class ProducerTask implements Runnable{
    BlockingQueue<String> queue=null;
    ProducerTask(BlockingQueue queue){
        this.queue=queue;
    }
    @Override
    public void run() {
        for(int i=1;i<10;i++){
            try {
                queue.put("Number - "+i);
                Thread.sleep(2000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
