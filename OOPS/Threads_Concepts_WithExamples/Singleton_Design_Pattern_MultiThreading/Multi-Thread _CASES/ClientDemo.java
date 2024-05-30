import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientDemo {
    public static void main(String[] args) {

        
        ExecutorService es = Executors.newFixedThreadPool(10);

        es.execute(() -> TvDemo.getTvSetInstance());
        es.execute(() -> TvDemo.getTvSetInstance());
        es.execute(() -> TvDemo.getTvSetInstance());
        es.execute(() -> TvDemo.getTvSetInstance());
        es.execute(() -> TvDemo.getTvSetInstance());
        es.execute(() -> TvDemo.getTvSetInstance());

        System.out.println(TvDemo.getTvSetInstance()); // all the objects are same ,for verification lets print and check it,  see the output
        System.out.println(TvDemo.getTvSetInstance());
        System.out.println(TvDemo.getTvSetInstance());

        es.execute(() -> FinalSolutionSingleton.getInstance());
        es.execute(() -> FinalSolutionSingleton.getInstance());
        es.execute(() -> FinalSolutionSingleton.getInstance());
        es.execute(() -> FinalSolutionSingleton.getInstance());
        es.execute(() -> FinalSolutionSingleton.getInstance());


        System.out.println(FinalSolutionSingleton.getInstance()); // all the objects are same ,for verification lets print and check it,  see the output
        System.out.println(FinalSolutionSingleton.getInstance());
        System.out.println(FinalSolutionSingleton.getInstance());

        System.out.println(es);
        es.shutdown(); // for good practice to shutdown the executor service 

        /*
         
         
        */


        
    }
}





/* 

    What is ExecutorService in Java?
    ExecutorService is a framework provided by the JDK which simplifies the execution of tasks in asynchronous mode.
    It is an interface that extends Executor interface. It provides a way of decoupling task submission from the mechanics of how each task will be run, including details of thread use, scheduling, etc.
    It is a higher level replacement for the Timer class.


    ExecutorService.execute() method is used to submit a task to the ExecutorService. It takes a Runnable object as a parameter and returns void.

    ExecutorService.submit() method is used to submit a task to the ExecutorService. It takes a Callable object as a parameter and returns a Future object.




    example:

    ExecutorService executor = Executors.newFixedThreadPool(10);
    executor.execute(new Runnable() {
        public void run() {
            System.out.println("Asynchronous task");
        }
    });


    ExecutorService executor = Executors.newFixedThreadPool(10);
    Future future = executor.submit(new Callable() {
        public Object call() throws Exception {
            System.out.println("Asynchronous Callable");
            return "Callable Result";
        }
    });

     returns null if the task has finished correctly.

    newFixedThreadPool() -->  
    Creates a thread pool that reuses a fixed number of threads operating off a shared unbounded queue. At any point, at most nThreads threads will be active processing tasks. 
    If additional tasks are submitted when all threads are active, they will wait in the queue until a thread is available. 
    If any thread terminates due to a failure during execution prior to shutdown, a new one will take its place if needed to execute subsequent tasks. 
    The threads in the pool will exist until it is explicitly shutdown.







*/

