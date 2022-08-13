package com.ljw4dakeai.jinjieban.chapter11.test03implementscallable.testpackage01;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author ZJH
 *
 * @info 具有返回值
 */
public class Test01TestImplementsCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 101; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> target = new FutureTask<>(new Test01TestImplementsCallable());
        new Thread(target).start();

        System.out.println(target.get());
    }
}
