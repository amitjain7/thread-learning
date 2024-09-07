package com.learn.thread.basic.inter_thread_communication.producerconsumer_non_thraed_save_common_object;

public class Notifire implements Runnable{
    private Message message;
    Notifire(Message message){
        this.message=message;
    }

    @Override
    public void run() {
        synchronized (message){
                message.setMessage("New 1");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            message.notify();
        }
    }
}
