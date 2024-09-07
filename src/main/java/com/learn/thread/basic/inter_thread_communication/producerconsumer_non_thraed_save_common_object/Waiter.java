package com.learn.thread.basic.inter_thread_communication.producerconsumer_non_thraed_save_common_object;

public class Waiter implements Runnable{
    private Message message;
    Waiter(Message message){
        this.message=message;
    }

    @Override
    public void run() {
        synchronized (message){
            try {
                System.out.println("Initial message => "+message.getMessage());
                message.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(" Final Message--> "+message.getMessage());
        }
    }
}
