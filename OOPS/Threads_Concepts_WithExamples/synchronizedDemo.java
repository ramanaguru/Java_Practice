/* 


    In Interview give an example :  
    ATM Example :
    
        Let's say You and your friend going to ATM to withdraw money , you both are using same ATM card to withdraw money. (ONE BANK ACCOUNT WITH TWO ATM CARDS)
        If you both are trying to withdraw money at same time , then there will be a conflict.

        Available balance in your account is 8000 rupees.
        You are withdrawing 5000 rupees and your friend is withdrawing 5000 rupees. so total money you are trying to withdraw is 10000 rupees. so it is not possible. 
        So, you have to withdraw money one by one.

        Same way , in programming , if multiple threads are trying to access same resource at same time , then there will be a conflict.    
        So, we use "SYNCHRONIZED KEYWORD" to avoid this conflict.


 
    What is synchronized keyword in Java?
        - Synchronized keyword in Java is used to provide mutually exclusive access to a shared resource with multiple threads in Java.
        - Synchronized keyword can be applied to methods and blocks.
        - When a method is declared as synchronized, the thread holds the monitor for that method's object.
        

    Why do we use synchronized keyword in Java?
        - This prevents other threads from executing the synchronized method or block simultaneously.
        - This is useful when multiple threads are accessing a shared resource and we want only one thread to access the resource at a time.
        
        
    synchronize Vs asynchronize : 

        - Synchronized means that only one thread can access the resource at a time.
        - Asynchronized means that multiple threads can access the resource at a time.
        
        - Synchronized is used to provide mutually exclusive access to a shared resource with multiple threads in Java.
        - Asynchronized is used to provide non-blocking access to a shared resource with multiple threads in Java.
        
        
    

*/



package Threads_Concepts_WithExamples;

class Counter{
    int count ; 

    public synchronized void increment(){
        count++;
    }
}

public class synchronizedDemo {

    public static void main(String[] args)  throws InterruptedException{
        Counter c = new Counter();

        Runnable obj1 = () -> {
            for(int i = 1 ; i <= 10000; i++){
                c.increment();
            }
        };

        Runnable obj2 = () -> {
            for(int i = 1 ; i <= 10000; i++){
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join(); // join() method is used to wait for the thread to die.


        System.out.println(c.count);
        
    }
}
