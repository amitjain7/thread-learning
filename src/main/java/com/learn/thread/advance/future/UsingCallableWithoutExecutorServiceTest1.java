package com.learn.thread.advance.future;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

@Slf4j
public class UsingCallableWithoutExecutorServiceTest1 {
    public static void main(String[] args) {
        log.info("Start main() -> "+Thread.currentThread());
        FutureTask futureTask=new FutureTask(new MyCallable());
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

@Slf4j
class MyCallable implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        log.info("Callable.call() -> "+Thread.currentThread());
        Thread.sleep(5000);
        return 1000;
    }
}
