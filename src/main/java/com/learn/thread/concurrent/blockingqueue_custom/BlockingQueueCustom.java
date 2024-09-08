package com.learn.thread.concurrent.blockingqueue_custom;

public interface BlockingQueueCustom<E> {
    void put(E item) throws InterruptedException;
    E  take() throws InterruptedException;
}
