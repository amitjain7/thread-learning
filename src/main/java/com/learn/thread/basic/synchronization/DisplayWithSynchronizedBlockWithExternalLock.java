package com.learn.thread.basic.synchronization;

public class DisplayWithSynchronizedBlockWithExternalLock {
    MyLock myLock;
    DisplayWithSynchronizedBlockWithExternalLock(MyLock myLock){
        this.myLock=myLock;
    }

    public  void wish(String name){
        for(int i=1;i<=10;i++){
            synchronized (myLock){
                System.out.print(i+". Inside Synchronized Block - Good Morning : ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(name);
            }

        }
    }
}
