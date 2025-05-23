package com.Adder_Subtractor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.Inheritance.A;
import com.Inheritance.C;

public class Client {

    public static void main(String[] args) {
        Count count = new Count();

        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(adder);
        executorService.submit(subtractor);

        System.out.println("Count value: " + count.value);
        executorService.shutdown();
    }
}
