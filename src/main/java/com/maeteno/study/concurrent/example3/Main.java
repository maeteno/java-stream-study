package com.maeteno.study.concurrent.example3;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable c = new CallableImpl();

        FutureTask<Integer> f = new FutureTask<>(c);
        new Thread(f).start();
        System.out.println("Main 1");
        var result = f.get();
        System.out.println(result);

        ExecutorService executor = Executors.newFixedThreadPool(10);
        Future f2 = executor.submit(c);
        var result2 = f2.get();
        System.out.println(result2);

        System.out.println("Main End");
    }
}