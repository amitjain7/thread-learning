package com.learn.thread.basic.synchronization;

import java.util.Random;

public class Util {
    public static int getRandomNumber(){
        Random random = new Random();
        int randomNumber = random.nextInt(900) + 100;
        return randomNumber;
    }
}
