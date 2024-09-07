package com.learn.thread.basic.inter_thread_communication.producerconsumer_thraed_save_common_object;

public class Sender implements Runnable{
    private Data data;
    Sender(Data data){
        this.data=data;
    }

    @Override
    public void run() {
        String[] packets={"Amit","Rajesh","Vikram","End"};
        for(String packet:packets){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            data.send(packet);// Send is thread safe method

        }
    }
}
