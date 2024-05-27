/* 

flow of execution of the program:


                     Software (s\w)
                    s\w  ====>  s1  ---->  s2  ---->  s3 (3 software running at the same time)
                                    |           |
                                    \|/         \|/
                                     os

                                    Hardware (H\w)
                                    H\w  ---->  CPU (executes instructions)
                                                RAM (temporary storage)

 
    What is a thread?

    - A thread is a lightweight sub-process, the smallest unit of processing. It is a separate path of execution.  
    -Threads are independent, if an exception occurs in one thread, it doesn't affect other threads. It shares a common memory area. 

    Why use threads?
    -Threads are used to perform multiple tasks at the same time.
    -Threads are independent, so it doesn't affect other threads if an exception occurs in a single thread.

    How to create a thread?
    -There are two ways to create a thread:
        1. By extending Thread class
        2. By implementing Runnable interface

    1. By extending Thread class:
        -Create a class that extends the Thread class.
        -Override the run() method.
        -Create an object of the class and call the start() method.
    
    Example:
        class MyThread extends Thread{
            public void run(){
                System.out.println("Thread is running");
            }
            public static void main(String[] args){
                MyThread t = new MyThread();
                t.start();
            }
        }

    2. By implementing Runnable interface:
        -Create a class that implements the Runnable interface.
        -Override the run() method.
        -Create an object of the class and pass it

    Example:
        class MyThread implements Runnable{
            public void run(){
                System.out.println("Thread is running");
            }
            public static void main(String[] args){
                MyThread t = new MyThread();
                Thread t1 = new Thread(t);
                t1.start();
            }
        }

    -The Runnable interface should be implemented by any class whose instances are intended to be executed by a thread.
    -The class must define a method of no arguments called run.

    -The Thread class provides constructors and methods to create and perform operations on a thread.
    -The Thread class extends Object class and implements Runnable interface.



*/
package Threads_Concepts_WithExamples;

public class threadsDemo_1 {
    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        threadOne t1 = new threadOne(); // it is not object , it is a thread
        threadTwo t2 = new threadTwo(); // it is not object , it is a thread

        t2.setPriority(Thread.MAX_PRIORITY); // Even if we set the priority of t2 to MAX_PRIORITY, it will not run first because t1 is already running. 
        t1.setPriority(Thread.MIN_PRIORITY); 

        //Remember this we can only optimize the probability of the thread to run first by setting the priority but not control it.


        t1.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        
        t2.start();
        
        t1.setName("DemoT1");
        System.out.println(t1.getName() + " :: " + t1.isAlive());

        t2.setName("DemoT2");
        System.out.println(t2.getName() + " :: " + t2.isAlive()); 

    }
    
}


class threadOne extends Thread {
    public void run(){
        for(int i = 1; i <= 100; i++){
            System.out.println("Hi - t1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class  threadTwo extends Thread {
    public void run(){
        for(int i = 1 ; i <= 100 ; i++){
            System.out.println("hello - t2");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}