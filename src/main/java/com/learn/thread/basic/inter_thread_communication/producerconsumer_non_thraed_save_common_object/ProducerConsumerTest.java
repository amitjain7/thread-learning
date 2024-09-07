package com.learn.thread.basic.inter_thread_communication.producerconsumer_non_thraed_save_common_object;

import java.util.concurrent.*;

public class ProducerConsumerTest {
    public static void main(String[] args) {
        Message msg=new Message("Process It");

        Waiter waiter=new Waiter(msg);
        new Thread(waiter).start();

        Notifire notifire=new Notifire(msg);
        new Thread(notifire).start();

    }
}
