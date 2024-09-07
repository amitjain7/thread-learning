package com.learn.thread.basic.deamon;

import java.io.*;
public class DeamonTest {
    public static void main(String[] args) {
        System.out.println(" main start ");
        Runnable r=()->{
            System.out.println(" Thread start ");
            try {
                try (PrintStream out = new PrintStream(new FileOutputStream("D:\\amit\\removeit\\aa.txt"))) {
                    for (int i = 1; i <= 10; i++) {
                        out.println("Amit -"+i);
                        System.out.println("data " + i);
                        Thread.sleep(100);
                    }
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println(" Thread end ");
        };

        Thread t=new Thread(r);
        t.setDaemon(true);
        t.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(" main end ");
    }
}
