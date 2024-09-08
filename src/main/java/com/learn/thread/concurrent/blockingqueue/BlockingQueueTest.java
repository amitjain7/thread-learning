package com.learn.thread.concurrent.blockingqueue;

import java.util.concurrent.*;

public class BlockingQueueTest {
    public static void main(String[] args) {
        BlockingQueue<String>  queue=new ArrayBlockingQueue<>(4);

        ConsumerTask consumerTask=new ConsumerTask(queue);
        ProducerTask cproducerTask=new ProducerTask(queue);

        new Thread(cproducerTask).start();
        new Thread(consumerTask).start();
    }
}
