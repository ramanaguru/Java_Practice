/*
 
    "synchronized" keyword in Java is used to control access to critical sections of code by multiple threads, 
    ensuring that only one thread can execute the synchronized method or block at a time. 
    This is crucial in concurrent programming to prevent race conditions and ensure thread safety when multiple threads are accessing shared resources.


    In the context of the Stack class, the synchronized keyword is used to ensure that only one thread can push or pop elements from the stack at a time.
    This is important because the stack is a shared resource that can be accessed by multiple threads concurrently.



    synchronised behind the scenes --> locks the object on which it is called, preventing other threads from accessing the synchronized block or method on the same object until the lock is released.
    


*/


package Threads_Concepts_WithExamples.Stack_Example;

public class demo {
    public static void main(String[] args) {

        
        Stack stack = new Stack(5);
        // System.out.println(stack.isEmpty());
        
        Thread t1 = new Thread(() ->{
            int counter = 0;

            while(++counter <= 5){
                System.out.println("Pushed: " + stack.push(counter));
            }
        });
        
        t1.setName("PusherThread");
        t1.start();


        new Thread(() -> {
            int counter = 0;

            while(++counter <= 5){
                System.out.println("Popped: " + stack.pop());
            }
        }, "PopperThread").start();
        
        System.out.println(t1.getName());

    

    }
}
