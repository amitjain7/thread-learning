package com.learn.thread.advance.future;

import java.util.Queue;
import java.util.concurrent.*;

public class MyCustomFutureTaskTest6 {
    public static void main(String[] args) {

        ArrayBlockingQueue<String> queue=new ArrayBlockingQueue<>(2);

        MyFutureTask<String> task1=new MyFutureTask<>(()-> FutureGame.play("Task 1",2000,false),queue);
        MyFutureTask<String> task2=new MyFutureTask<>(()-> FutureGame.play("Task 2",1000,false),queue);

        ExecutorService executorService= Executors.newFixedThreadPool(5);

        Future<?> future1 = executorService.submit(task1);
        Future<?> future2 = executorService.submit(task2);

        for(int i=1;i<=2;i++){
            try {
                String f = queue.take();
                System.out.println(f);
            }catch(Exception e){

            }
        }

        executorService.shutdown();
    }
}

class MyFutureTask<V> extends FutureTask<V> {
    Queue<V> queue=null;
    public MyFutureTask(Callable<V> callable,Queue<V> queue) {
        super(callable);
        this.queue=queue;
    }

    @Override
    protected void done(){
        try{
            V s=get();
            queue.add(s);
        }
        catch(Exception e){

        }
    }
}
