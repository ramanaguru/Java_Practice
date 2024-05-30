package Threads_Concepts_WithExamples.Interview_Examples;


public class Restaurant {

    
    //static class Kitchen implements Runnable{

       // static Object lock = new Object();

        // public void run(){
        //     System.out.println("/n Order Taken");
        //     prepareFood();
        // }


        // public static  void prepareFood(){  // Critical Session

        //     synchronized(lock){
        //             System.out.println("Food Preparation :: Started");

        //             System.out.println(Thread.currentThread().getName() );

        //             try{
        //                 Thread.sleep(3000);
        //             }
        //             catch(InterruptedException e){
        //                 e.printStackTrace();
        //             }

        //             System.out.println("Food Preparation :: Done");
        //     }
            
        // }
    // }

    private static Object lock = new Object();

    public static void main(String[] args) {

        Runnable runnable = new Runnable(){


            @Override
            public void run(){
                System.out.println(" Order Taken " + Thread.currentThread().getName());
                prepareFood();
            }
    
    
            public static  void prepareFood(){  // Critical Session
    
                synchronized(lock){
                    System.out.println("Food Preparation :: Started by " + Thread.currentThread().getName());
    
                        System.out.println(Thread.currentThread().getName() );
    
                        try{
                            Thread.sleep(3000);
                        }
                        catch(InterruptedException e){
                            e.printStackTrace();
                        }
    
                        System.out.println("Food Preparation :: Done by " + Thread.currentThread().getName());
                    }
                
            }
        };

       Thread t1 = new Thread(runnable);
        t1.start();

        Thread t2 = new Thread(runnable);
        t2.start();

        Thread t3 = new Thread(runnable);
        t3.start();


        // Kitchen kitchen = new Kitchen();
       

        // Thread thread1 = new Thread(kitchen);
        // thread1.start();

        // Thread thread2 = new Thread(kitchen);
        // thread2.start();

        // Thread thread3 = new Thread(kitchen);
        // thread3.start();

        
        
       
    }
}
