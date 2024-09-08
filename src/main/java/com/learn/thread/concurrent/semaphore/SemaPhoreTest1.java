package com.learn.thread.concurrent.semaphore;

import java.util.concurrent.Semaphore;

public class SemaPhoreTest1 {
    public static void main(String[] args) {

        Semaphore semaphore=new Semaphore(2);
        SendingMailTask sendingMailTask1=new SendingMailTask(semaphore);
        SendingMailTask sendingMailTask2=new SendingMailTask(semaphore);
        SendingMailTask sendingMailTask3=new SendingMailTask(semaphore);

        new Thread(sendingMailTask1).start();
        new Thread(sendingMailTask2).start();
        new Thread(sendingMailTask3).start();


    }

    }
