package com.learn.thread.concurrent.blockingqueue_custom;

public class BlockingQueueCustomTest {
    public static void main(String[] args) {
        BlockingQueueCustom<String> queue=new LinkedBlockingQueueCustom<>(4);

        ConsumerTask consumerTask=new ConsumerTask(queue);
        ProducerTask cproducerTask=new ProducerTask(queue);

        new Thread(cproducerTask).start();
        new Thread(consumerTask).start();

    }
}
