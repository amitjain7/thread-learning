package com.learn.thread.basic.inter_thread_communication.producerconsumer_thraed_save_common_object;

public class ProducerConsumereTest {
    public static void main(String[] args) {
        Data data=new Data();

        Sender senderTask =new Sender(data);
        Receiver receiverTask =new Receiver(data);

        Thread sender=new Thread(senderTask);
        Thread receiver=new Thread(receiverTask);

        receiver.start();
        sender.start();


    }
}
