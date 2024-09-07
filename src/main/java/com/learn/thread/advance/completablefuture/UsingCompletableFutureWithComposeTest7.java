package com.learn.thread.advance.completablefuture;

import com.learn.thread.advance.future.FutureGame;
import lombok.SneakyThrows;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class UsingCompletableFutureWithComposeTest7 {

    public static void main(String[] args) {

        Supplier<String> supplier1=()-> FutureGame.play("Task 1",2000,false);
        Supplier<String> supplier2=()-> FutureGame.play("Task 2",2000,false);
        Supplier<String> supplier3=()-> FutureGame.play("Task 3",2000,false);
        Supplier<String> supplier4=()-> FutureGame.play("Task 4",2000,false);


        CompletableFuture<String> completableFuture1=CompletableFuture.supplyAsync(supplier1);
        CompletableFuture<String> completableFuture2=CompletableFuture.supplyAsync(supplier2);


        CompletableFuture f=completableFuture1
               .thenCombine(completableFuture2,(result1,result2) -> "Result 1 - "+result1+" :: Result 2 - "+result2)
                .thenCompose((result12)->{
                    CompletableFuture<String> completableFuture3=CompletableFuture.supplyAsync(supplier3);
                    CompletableFuture<String> completableFuture4=CompletableFuture.supplyAsync(supplier4);

                    return completableFuture3.thenCombine(completableFuture4,(result3,result4)-> result12 +" :: Result 3 - "+result3+" :: Result 4 - "+result4);
                })
                .thenAccept(System.out::println);
        try {
            f.get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
