package com.learn.thread.advance.future;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Slf4j
public class FutureTest4 {
    public static void main(String[] args) {
        log.info("Start main - "+Thread.currentThread());
        ExecutorService executorService =null;
        try{
            executorService = Executors.newFixedThreadPool(10);

            Future<String> futureData1=executorService.submit(()->FutureGame.play("My Task 1",5000,false));
            Future<String> futureData2=executorService.submit(()->FutureGame.play("My Task 2",1000,false));
            Future<String> futureData3=executorService.submit(()->FutureGame.play("My Task 3",1,true));

            log.info(futureData1.get());
            log.info(futureData2.get());
            log.info(futureData3.get());

        }catch (Exception e){
            log.error("Exception main - "+e.getMessage());
        }
        executorService.shutdown();
        log.info("End main - "+Thread.currentThread());
    }
}
