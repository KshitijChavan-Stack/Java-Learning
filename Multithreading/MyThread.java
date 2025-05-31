package Multithreading;

public class MyThread {
    static class Mythread extends Thread{
        @Override
        public void run() {
            System.out.println("Inside Thread using Thread class Extension");
        }
    }
    static class Mythread1 implements Runnable{

        @Override
        public void run() {
            System.out.println("Inside Thread using Runnable Interface");
        }
    }

    public static void main(String[] args) {
        Mythread t1 = new Mythread(); // i have to make the mythread class here as static to acces the instance bcoz
                                     // im creating instance in a static method
        t1.start();

        Thread t2 = new Thread(new Mythread1());

        t2.start();

    }
}
