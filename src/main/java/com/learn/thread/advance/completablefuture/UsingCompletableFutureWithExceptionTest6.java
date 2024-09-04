package com.learn.thread.advance.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class UsingCompletableFutureWithExceptionTest6 {
    public static void main(String[] args) {
        Supplier<String> supplier1=()-> FutureGame.play("Task 1",10000,false);

        CompletableFuture completableFuture=CompletableFuture.supplyAsync(supplier1)
                .exceptionally(err-> new String("Some Error - "+err))
                .thenApply(result->result + " Get Result"+1/0)
                .exceptionally(err-> new String("Some Error - "+err))
                .thenAccept(System.out::println);

        try {
            completableFuture.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
