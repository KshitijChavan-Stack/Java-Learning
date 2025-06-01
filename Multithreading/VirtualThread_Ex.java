package Multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class VirtualThread_Ex {
    public static void main(String[] args) throws InterruptedException {
//        Runnable task = () ->{
//            System.out.println("Running in : "+Thread.currentThread());
//            try {
//                Thread.sleep(1000);
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }
//
//        };

        //Thread th = Thread.startVirtualThread(task);
        //th.join(); // but using this is more cleaner and recommended
                   // this makes main thread wait for virtual to complete


       // Thread.sleep(2000); // if the virtual thread dont run this is
                                  // a quick fix bcoz the main thread exit to quickly

        //USING EXECUTORSERVICE + VIRTUAL THREAD

        ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor();

        for (int i = 1; i < 11; i++) {
            int Taskid = i;
            executorService.submit(()->{
                System.out.println("Task : "+Taskid+ "Thread NUM : "+Thread.currentThread() );
            });

        }

        executorService.shutdown();
        executorService.awaitTermination(5, TimeUnit.SECONDS);// this will make the main thread wait

        System.out.println("ALL TASK COMPLETED");

    }
}
