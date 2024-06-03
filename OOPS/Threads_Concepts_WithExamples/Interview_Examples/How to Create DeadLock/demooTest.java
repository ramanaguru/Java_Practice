/*

    What is Deadlock ? 

    - It is a situation where a thread is waiting for an object lock that another thread holds, and this second thread is waiting for an object lock that the first thread holds.
    - Since each thread is waiting for the other to release the lock, they will wait forever.(BLOCKED-STATE)
    - Deadlocks are a common problem in concurrent programming where two threads are blocked forever, waiting for each other.
    - Deadlocks can occur in Java when the synchronized keyword causes the executing thread to block while waiting to get the lock, associated with the specified object.



*/

public class demooTest {

     public static void main(String[] args) {

        System.out.println("Main started");
        
        String lock1 = "Ramana";
        String lock2 = "Guru";

        Thread thread1 = new Thread(() -> {
            synchronized(lock1){
                try{
                    Thread.sleep(100);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
                
                synchronized(lock2){
                    System.out.println("Lock is acquired by thread1  and lock2 is also acquired by thread1");
                }
            }

        });



        Thread thread2 = new Thread(() -> {
            synchronized(lock1){  //lock2 will not work here we must use same object/order  to avoid deadlock 
                try{
                    Thread.sleep(100);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
                
                synchronized(lock2){
                    System.out.println("Lock is acquired by thread2  and lock1 is also acquired by thread2");
                }
            }

        });

        thread1.start();
        thread2.start();




     }


}