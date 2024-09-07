package com.learn.thread.basic.synchronization;

public class UseMultiDisplayTest6 {
    public static void main(String[] args) {
        DisplayWithMultipleMethods displayWithMultipleMethods=new DisplayWithMultipleMethods();

        Runnable taskForAmit=new ThreadForMultiDisplaySimpleMethod(displayWithMultipleMethods,"Amit");
        Runnable taskForAnuj=new ThreadForMultiDisplayStaticSimpleMethod(displayWithMultipleMethods,"Anuj");
        Runnable taskForRK=new ThreadForMultiDisplaySynchronizedMethod1(displayWithMultipleMethods,"RK");
        Runnable taskForDJ=new ThreadForMultiDisplaySynchronizedMethod2(displayWithMultipleMethods,"DJ");
        Runnable taskForPJ=new ThreadForMultiDisplayStaticSynchronizedMethod1(displayWithMultipleMethods,"PJ");
        Runnable taskForAJ=new ThreadForMultiDisplayStaticSynchronizedMethod2(displayWithMultipleMethods,"AJ");


        new Thread(taskForAmit).start();
        new Thread(taskForAnuj).start();
        new Thread(taskForRK).start();
        new Thread(taskForDJ).start();
        new Thread(taskForPJ).start();
        new Thread(taskForAJ).start();


    }
}

