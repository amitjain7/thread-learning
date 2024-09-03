package com.learn.thread.advance.future;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
@Slf4j
public class UsingCallableWithoutExecutorServiceWithLambdaTest2 {
        public static void main(String[] args) {
            log.info("Start main() -> "+Thread.currentThread());
            FutureTask futureTask=new FutureTask(()-> 5000);
            Thread t=new Thread(futureTask);
            t.start();
            try {
                System.out.println(futureTask.get());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
            log.info("End main() -> "+Thread.currentThread());
        }
}
