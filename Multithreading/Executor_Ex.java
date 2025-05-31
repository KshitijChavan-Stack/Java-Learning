package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor_Ex {
    public static void main(String[] args) {

        // Created a Thread pool with 3 Threads
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // submit 3 task to Thread Pool

        for (int i = 0; i < 6; i++) {
            int TaskId = i;
            executorService.submit(()->{
                System.out.println("Task : " + TaskId + "Started by : "+ Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);
                }catch (InterruptedException e){
                    System.out.println(e);
                }
                // this will execute ones threads complete execution and as it have delay of 2 sec
                // the execution will start before the .sleep() is called and ones the sleep is over
                // execution is already finished and it prints this ⬇️
                System.out.println("Task : " +TaskId+ "Finished by : " + Thread.currentThread().getName());
            });

        }
        executorService.shutdown();

    }
}
