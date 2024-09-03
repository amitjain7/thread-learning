package com.learn.thread.advance.future;

import java.util.concurrent.*;

public class ExecutorCompletionServiceTest5 {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(5);
        ExecutorCompletionService executorCompletionService=new ExecutorCompletionService(executorService);

        Callable<String> callable1=()->FutureGame.play("Task 1",5000,false);
        Callable<String> callable2=()->FutureGame.play("Task 2",3000,false);
        Callable<String> callable3=()->FutureGame.play("Task 3",4000,false);

        Future<String> future1 = executorCompletionService.submit(callable1);
        Future<String> future2 = executorCompletionService.submit(callable2);
        Future<String> future3 = executorCompletionService.submit(callable3);

        try{
            for(int i=1;i<=3;i++){
                Future<String> future=executorCompletionService.take();
                if(future==future1){
                    System.out.println("Task 1 Completed....");
                }
                else if(future==future2){
                    System.out.println("Task 2 Completed....");
                }
                else if(future==future3){
                    System.out.println("Task 3 Completed....");
                }
            }
        }catch (Exception e){

        }
    }
}
