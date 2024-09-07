package com.learn.thread.basic.inter_thread_communication;

import java.util.Queue;

public class ConsumereThread extends Thread{
    Queue<String> queue = null;
    ConsumereThread(Queue queue){
        this.queue=queue;
    }

    public void run(){
        while(true){
            if(queue.isEmpty()){
                synchronized (queue) {
                    try {
                        System.out.println("aa");
                        queue.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            System.out.println("Successfully wait");
            System.out.println(queue.peek());
        }
    }
}
