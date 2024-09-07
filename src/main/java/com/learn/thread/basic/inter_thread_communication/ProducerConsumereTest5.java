package com.learn.thread.basic.inter_thread_communication;

import java.util.*;

public class ProducerConsumereTest5 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        ProducerThread producer=new ProducerThread(queue);
        ConsumereThread consumere=new ConsumereThread(queue);
        producer.start();
        consumere.start();

    }
}
