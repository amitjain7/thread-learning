package com.learn.thread.concurrent.blockingqueue_custom;

import java.util.*;

public class LinkedBlockingQueueCustom<E> implements BlockingQueueCustom<E>{

    List<E> queue=null;
    int maxSize;
    LinkedBlockingQueueCustom(int size){
        queue =new LinkedList<>();
        this.maxSize=size;
    }

    @Override
    public synchronized void put(E item) throws InterruptedException {
        if(queue.size()==maxSize){
            this.wait();
        }
        queue.add(item);
        this.notifyAll();
    }

    @Override
    public synchronized E take() throws InterruptedException {
        if(queue.size()==0){
            this.wait();
        }
        this.notifyAll();
        return queue.remove(0);
    }
}
