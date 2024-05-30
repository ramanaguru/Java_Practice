package Threads_Concepts_WithExamples.Stack_Example;

public class Stack {
    
    private int[] array;
    private int top;
    Object lock;

    public Stack(int capacity){
        array = new int[capacity];
        top = -1;
        lock = new Object();
    }

    public boolean isEmpty(){
        return array.length <= 0;
    }

    public boolean isFull(){
        return top == array.length - 1;
    }

    // public boolean push (int element){  =====> If you like to have boolean return type
    //     synchronized(this){
    //         if(isFull()){
    //             return false;
    //         }
    
    //         ++top;
    
    //         try{Thread.sleep(1000);}catch(Exception e){ }
    
    //         array[top] = element;
    
    //         return true;

    //     }
     
    // }

    public int push (int element){
        synchronized(lock){
            if(isFull()){
                throw new IllegalStateException("Stack is full");
            }
    
            ++top;
    
            try{Thread.sleep(1000);}catch(Exception e){ }
    
            array[top] = element;
    
            return element;

        }
     
    }


    public int pop(){
        synchronized(lock){
            if(isEmpty()){return Integer.MIN_VALUE;}
            int element = array[top];
    
            array[top] = Integer.MIN_VALUE;
    
            try{ Thread.sleep(1000); }catch(Exception e){ }
    
            top--;
    
            return element;
        }
       
    }

/* This is another way to write the above code


    using synchronized keyword in the method signature itself instead of using synchronized block 

    this is will be useful when you want to synchronize the entire method and not just a block of code within the method.
    this is will lock the object on which the method is called, preventing other threads from accessing the synchronized method on the same object until the lock is released.
    
    this is same as using synchronized block with "this" as the lock object.

    
    public  static  synchronized int push (int element){
        
            if(isFull()){
                throw new IllegalStateException("Stack is full");
            }
    
            ++top;
    
            try{Thread.sleep(1000);}catch(Exception e){ }
    
            array[top] = element;
    
            return element;

        
     
    }


    public static synchronized int pop(){
        
            if(isEmpty()){return Integer.MIN_VALUE;}
            int element = array[top];
    
            array[top] = Integer.MIN_VALUE;
    
            try{ Thread.sleep(1000); }catch(Exception e){ }
    
            top--;
    
            return element; 
        }
       
    }

 */



}
