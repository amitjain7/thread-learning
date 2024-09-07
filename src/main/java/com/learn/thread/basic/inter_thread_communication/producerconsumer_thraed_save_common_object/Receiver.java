package com.learn.thread.basic.inter_thread_communication.producerconsumer_thraed_save_common_object;

public class Receiver implements Runnable{
    private Data data;
    Receiver(Data data){
        this.data=data;
    }

    @Override
    public void run() {
        for(String receiveMessage= data.receive();
            !"End".equals(receiveMessage);
            receiveMessage=data.receive()){  // receive is thread safe method
            System.out.println(receiveMessage);
        }
    }
}