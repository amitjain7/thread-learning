package com.learn.thread.basic.synchronization;

public class DisplayWithSynchronized {

    public synchronized void wish(String name){
        for(int i=1;i<=10;i++){
            System.out.print("Good Morning : ");
            try {
                Thread.sleep(Util.getRandomNumber());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name);
        }
    }
}
