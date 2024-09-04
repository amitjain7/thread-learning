package com.learn.thread.advance.completablefuture;


import java.time.Duration;
import java.time.LocalTime;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class UsingCompletablerFutureTest3 {
    public static void main(String[] args) {
        Supplier<String> supplier1=()-> FutureGame.play("Task 1",10000,false);
        Supplier<String> supplier2=()-> FutureGame.play("Task 2",10000,false);
        Supplier<String> supplier3=()-> FutureGame.play("Task 3",10000,false);
        Supplier<String> supplier4=()-> FutureGame.play("Task 4",10000,false);
        LocalTime startTime=LocalTime.now();
        CompletableFuture<Void> completableFuture=CompletableFuture
                .supplyAsync(supplier1)
                .thenCombine(CompletableFuture.supplyAsync(supplier2),(r1,r2)-> r1+" - "+r2)
                .thenCombine(CompletableFuture.supplyAsync(supplier3),(r1,r2)-> r1+" - "+r2)
                .thenCombine(CompletableFuture.supplyAsync(supplier4),(r1,r2)-> r1+" - "+r2)
               .thenApply(data-> data+" Done")
               .thenAccept(data-> System.out.println("Data is ="+data));

        try {
            completableFuture.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        LocalTime endTime=LocalTime.now();

        Duration d=Duration.between(endTime,startTime);
        System.out.println(d.getSeconds());

    }
}
