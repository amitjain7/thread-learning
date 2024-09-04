package com.learn.thread.advance.completablefuture;


import java.time.Duration;
import java.time.LocalTime;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;

public class UsingCompletablerFutureTest5 {
    public static void main(String[] args) {
        LocalTime startTime=LocalTime.now();
        Supplier<String> supplier1=()-> FutureGame.play("Task 1",10000,false);

        CompletableFuture completableFuture=CompletableFuture.supplyAsync(supplier1);

        completableFuture= completableFuture.thenApply(data-> data+" Done123");

        completableFuture.thenAccept(data-> System.out.println("Data is 123 = "+data));

        System.out.println("Done");

        try {
            completableFuture.get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        LocalTime endTime=LocalTime.now();

        Duration d=Duration.between(startTime,endTime);
        System.out.println(d.getSeconds());

    }
}
