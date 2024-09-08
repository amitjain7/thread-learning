package com.learn.thread.concurrent.blockingqueue_custom;

public class ConsumerTask implements Runnable{

    BlockingQueueCustom<String> queue=null;
    ConsumerTask(BlockingQueueCustom queue){
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
