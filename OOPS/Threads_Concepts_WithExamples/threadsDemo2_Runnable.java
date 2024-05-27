/*  
    Threads with Runnable interface:
    - Runnable interface is used to create a thread in java.
    - Runnable interface is present in java.lang package.
    - Runnable interface has only one method called run().
    - Runnable interface is a functional interface.
    - Runnable interface is used to create a thread in java by implementing the run() method.


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


    - The Runnable interface should be implemented by any class whose instances are intended to be executed by a thread.
    - The class must define a method of no arguments called run.

    - The Thread class provides constructors and methods to create and perform operations on a thread.
    - The Thread class extends Object class and implements Runnable interface.





*/

package Threads_Concepts_WithExamples;

public class threadsDemo2_Runnable {
    public static void main(String[] args) {
        Runnable obj1 = () -> {  
            for(int i = 0 ; i <= 4; i++){
                System.out.println(i);
                try{ Thread.sleep(10);}
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        Runnable obj2 = () -> {
            for(int i = 0 ; i <= 4; i++){
                System.out.println("hello from B");
                try{ Thread.sleep(10);}
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();


    }
    
}

/* 

First Write this and then optimise with lambda expressions since runnable interface is functional interface

class threadA implements Runnable{
    public void run(){
        for(int i = 0 ; i <= 4; i++){
           System.out.println("hi from A");
           try{
                Thread.sleep(10);
           }catch(InterruptedException e){
                e.printStackTrace();
           }
        }
    }
}


class threadB implements Runnable{
    public void run(){
        for(int i = 0 ; i <= 4; i++){
            System.out.println("hello from B");
            try{
                 Thread.sleep(10);
            }catch(InterruptedException e){
                 e.printStackTrace();
            }
         }
    }
}

*/