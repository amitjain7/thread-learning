package com.learn.thread.basic.synchronization;

public class DisplayWithMultipleMethods {

    public void wishSimple(String name){
        for(int i=1;i<=10;i++){
            System.out.print(i+ ".  wishSimple :: Good Morning : ");
            try {
                Thread.sleep(Util.getRandomNumber());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name);
        }
    }

    public static void  wishStaticSimple(String name){
        for(int i=1;i<=10;i++){
            System.out.print(i+ ".  wishStaticSimple :: Good Morning : ");
            try {
                Thread.sleep(Util.getRandomNumber());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name);
        }
    }

    public synchronized void  wishSynchronized1(String name){
        for(int i=1;i<=10;i++){
            System.out.print(i+ ".  wishSynchronized1 ::  Good Morning : ");
            try {
                Thread.sleep(Util.getRandomNumber());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name);
        }
    }

    public synchronized void wishSynchronized2(String name){
        for(int i=1;i<=10;i++){
            System.out.print(i+ ".  wishSynchronized2 :: Good Morning : ");
            try {
                Thread.sleep(Util.getRandomNumber());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name);
        }
    }

    public static synchronized void  wishStaticSynchronized1(String name){
        for(int i=1;i<=10;i++){
            System.out.print(i+ ".  wishStaticSynchronized1 ::  Good Morning : ");
            try {
                Thread.sleep(Util.getRandomNumber());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name);
        }
    }

    public static synchronized void wishStaticSynchronized2(String name){
        for(int i=1;i<=10;i++){
            System.out.print(i+ ".  wishStaticSynchronized2 :: Good Morning : ");
            try {
                Thread.sleep(Util.getRandomNumber());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name);
        }
    }

}
