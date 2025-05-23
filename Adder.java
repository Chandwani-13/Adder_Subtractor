package com.Adder_Subtractor;

public class Adder implements Runnable {

    private Count count;

    public Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {

        for (long i = 0; i <= 1000000; i++) {

            this.count.value += 1;

        }
    }

}
