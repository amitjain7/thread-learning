package com.learn.thread.basic.synchronization;

public class DisplayWithSynchronizedBlock {

    public  void wish(String name){
        for(int i=1;i<=10;i++){
            System.out.println(i+". Outside Synchronized Block name => "+name);
            synchronized (this){
                System.out.print(i+". Inside Synchronized Block - Good Morning : ");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(name);
            }

        }
    }
}
