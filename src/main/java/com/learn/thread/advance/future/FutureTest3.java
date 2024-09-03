package com.learn.thread.advance.future;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Slf4j
public class FutureTest3 {
    public static void main(String[] args) {
        log.info("Start main - "+Thread.currentThread());
        ExecutorService executorService =null;
        try{
            executorService = Executors.newSingleThreadExecutor();
            Future<String> futureData=executorService.submit(()->FutureGame.play("My Task",5000,false));
            String data=futureData.get();
            log.info(data);
        }catch (Exception e){
            log.error("Exception main - "+e.getMessage());
        }
        executorService.shutdown();
        log.info("End main - "+Thread.currentThread());
    }
}
