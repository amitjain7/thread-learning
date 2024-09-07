package com.learn.thread.advance.completablefuture;

import com.learn.thread.advance.future.FutureGame;

import java.time.Duration;
import java.time.LocalTime;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class UsingCompletableFutureWithAnyOfTest9 {
    public static void main(String[] args) {
        LocalTime startTime=LocalTime.now();

        Supplier<String> supplier1=()-> FutureGame.play("Task 1",2000,false);
        Supplier<String> supplier2=()-> FutureGame.play("Task 2",4000,false);
        Supplier<String> supplier3=()-> FutureGame.play("Task 3",5000,false);
        Supplier<String> supplier4=()-> FutureGame.play("Task 4",6000,false);

        CompletableFuture<String> completableFuture1=CompletableFuture.supplyAsync(supplier1);
        CompletableFuture<String> completableFuture2=CompletableFuture.supplyAsync(supplier2);
        CompletableFuture<String> completableFuture3=CompletableFuture.supplyAsync(supplier3);
        CompletableFuture<String> completableFuture4=CompletableFuture.supplyAsync(supplier4);

        CompletableFuture<Object> f=CompletableFuture
                .anyOf(completableFuture1,completableFuture2,completableFuture3,completableFuture4);

        f.join();

        LocalTime endTime=LocalTime.now();

        Duration d=Duration.between(startTime,endTime);
        System.out.println(d.getSeconds());

    }
}
