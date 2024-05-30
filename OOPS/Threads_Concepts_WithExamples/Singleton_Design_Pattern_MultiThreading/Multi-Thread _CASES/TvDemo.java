
public class TvDemo {

    // Volatile keyword ensures visibility of changes to the instance across threads
    private static  volatile TvDemo tvSetInstance = null;
   
    // Private constructor to prevent instantiation from other classes
    private TvDemo(){
         System.out.println("TvDemo Object Created");
    }


    // Public method to provide global access
    public  static TvDemo getTvSetInstance() {
        if (tvSetInstance == null) { // First check (without locking)

            synchronized(TvDemo.class){

                if (tvSetInstance == null){ // Second check (with locking)  This is also called as "Double-Checked Locking Pattern"
                    tvSetInstance = new TvDemo(); // Create the instance
                }

            }
        }
        return tvSetInstance;
    }

  
    
    
}

/*
 
    DIAGRAM :


        NOT THREAD SAFE : WORKS WITH SINGLE THREAD
        public class Singleton {
            private static Singleton instance;

            private Singleton() {
                // Private constructor
            }

            public static Singleton getInstance() {
                if (instance == null) {
                    instance = new Singleton();
                }
                return instance;
            }
        } 

                +----------------+
                |    Main        |
                |                |  
                +-------+--------+
                        |
                        | 1. Call getInstance() from T1, T2, T3
                        v
                +-------+--------+                  +-------+--------+                              +-------+--------+
                |  T1                |              |  T2                       |                   |  T3                |
                |                    |              |                           |                   |                    |
                | if (instance == null) -> Yes          if (instance == null) -> Yes                if (instance == null) -> Yes
                | Create new instance                   Create new instance                         Create new instance
                | Return instance                       Return instance                             Return instance
                +--------------------+                  +--------------------+                        +--------------------+


            * works fine with single thread but not with multiple threads.

           PROBLEM : Multiple threads can create multiple instances simultaneously, defeating the Singleton purpose.




        THREAD SAFE : WORKS WITH MULTIPLE THREADS

        public class Singleton {
            private static Singleton instance;

            private Singleton() {
                // Private constructor
            }

            public static synchronized Singleton getInstance() {
                if (instance == null) {
                    instance = new Singleton();
                }
                return instance;
            }
        }


       DIAGRAM : 


    +----------------+
    |    Main        |
    |                |
    +-------+--------+
            |
            | 1. Call synchronized getInstance() from T1, T2, T3
            v
    +-------+--------+
    |  T1  synchronized call  |
    | if (instance == null) --> Yes
    | Create new instance
    | Return instance
    +------------------------+
            |
            | T2 and T3 wait until T1 finishes
            v
    +-------+--------+
    |  T2 synchronized call  |
    | if (instance == null) --> No
    | Return instance
    +------------------------+
            |
            | T3 waits until T2 finishes
            v
    +-------+--------+
    |  T3 synchronized call  |
    | if (instance == null) --> No
    | Return instance
    +------------------------+


            * works fine with multiple threads but has performance issues due to synchronized keyword. 
            SYNCHRONIZED : Only one thread can access the method at a time, others have to wait. so it is slow., overhead of synchronization.

            PROBLEM : Performance issues due to synchronized keyword. 

    

    Double-Checked Locking (Thread-Safe and Efficient)

    public class Singleton {
        private static volatile Singleton instance;

        private Singleton() {
            // Private constructor
        }

        public static Singleton getInstance() {
            if (instance == null) {
                synchronized (Singleton.class) {
                    if (instance == null) {
                        instance = new Singleton();
                    }
                }
            }
            return instance;
        }
    }   



    DIAGRAM : 


    +----------------+
    |    Main        |
    |                |
    +-------+--------+
            |
            | 1. Call getInstance() from T1, T2, T3
            v
    +------------------+                        +------------------+                    +------------------+
    | T1                        |               | T2               |                    | T3               |
    |                           |               |                  |                    |                  |
    | if (instance == null)                     | if (instance == null)                 | if (instance == null) 
    | --> YES                                   | -> YES      
    
    | synchronized block                        |                                       | 
                                                (Wait for T1 to release)                   (Wait for T1 to release)
    | if (instance == null)                     | if (instance == null)                 | if (instance == null) 
    |  --> YES                                  |  --> NO                               |  --> NO 
    | Create new instance                       | (Continue after T1)                   | (Continue after T1)
    | Return instance                           | Return instance                       | Return instance
    +------------------+                        +------------------+                    +------------------+



    * works fine with multiple threads and is efficient due to double-checked locking.
    * The volatile keyword ensures that multiple threads handle the instance variable correctly when it is being initialized to the Singleton instance. (Its like a flag to JVM that don't cache the value of this variable, always read from main memory)
    * The synchronized block is only executed when the instance is null, avoiding the performance issues of the synchronized method.



    Final Implementation : Bill Pugh Singleton Design Pattern

    public class Singleton {
        private Singleton() {
            // Private constructor
        }

        private static class SingletonHelper {
            private static final Singleton INSTANCE = new Singleton();
        }

        public static Singleton getInstance() {
            return SingletonHelper.INSTANCE;
        }
    }


    

    Diagram :


    +----------------+
    |    Main        |
    |                |
    +-------+--------+
            |
            | 1. Call getInstance() from T1, T2, T3
            v
    +------------------+                        +------------------+                    +------------------+
    | T1                        |               | T2               |                    | T3               |
    |                           |               |                  |                    |                  |
    | Load SingletonHelper                      | Load SingletonHelper                  | Load SingletonHelper
    | if (INSTANCE == null)                     | if (INSTANCE == null)                 | if (INSTANCE == null)
    | --> YES                                   | -> YES            
    | Create new instance                       | (Wait for T1 to release)                  (Wait for T1 to release) 
    | Return instance                           | if (INSTANCE == null)                     if (INSTANCE == null)
                                                |  --> NO                                   --> NO
                                                | (Continue after T1)                       (Continue after T1)
                                                | Return instance                           Return instance
    +------------------+                        +------------------+                    +------------------+


    
    * works fine with multiple threads and is efficient due to the Bill Pugh Singleton Design Pattern.
    * The SingletonHelper class is loaded only when getInstance() is called, avoiding the overhead of loading the Singleton class when the application starts.





*/