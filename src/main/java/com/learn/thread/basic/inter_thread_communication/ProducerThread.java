package com.learn.thread.basic.inter_thread_communication;

import java.util.*;
public class ProducerThread extends Thread{
    Queue<String> queue = null;
    ProducerThread(Queue queue){
        this.queue=queue;
    }

    public  void run(){
        synchronized(queue) {
            for (int i = 0; i < 10; i++) {
                queue.offer("Amit-" + i);
                queue.notify();
                System.out.println("Successfully Notify...");
            }
        }
    }
}
