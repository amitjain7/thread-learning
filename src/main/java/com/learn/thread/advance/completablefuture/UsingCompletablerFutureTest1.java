package com.learn.thread.advance.completablefuture;


import java.time.Duration;
import java.time.LocalTime;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class UsingCompletablerFutureTest1 {
    public static void main(String[] args) {
        Supplier<String> supplier1=()-> FutureGame.play("Task 1",10000,false);
        LocalTime startTime=LocalTime.now();
        CompletableFuture<Void> completableFuture=CompletableFuture
                .supplyAsync(supplier1)
                .thenApply(data-> data+" Done")
                .thenAccept(data-> System.out.println("Data is ="+data));
        try {
            Thread.sleep(12000);
            //completableFuture.get();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
        LocalTime endTime=LocalTime.now();

        Duration d=Duration.between(endTime,startTime);
        System.out.println(d.getSeconds());

    }
}
