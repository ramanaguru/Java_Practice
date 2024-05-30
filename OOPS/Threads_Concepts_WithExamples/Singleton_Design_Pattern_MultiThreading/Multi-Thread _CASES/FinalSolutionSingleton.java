public class FinalSolutionSingleton {

    private FinalSolutionSingleton() {
        System.out.println("From Bill Push Singleton"); // This will be printed only once , when the object is created
    }

    private static class SingletonHelper {
        private static final FinalSolutionSingleton INSTANCE = new FinalSolutionSingleton(); // This will be created only once , when the object is created for the first time 
    }

    public static FinalSolutionSingleton getInstance() { 
        return SingletonHelper.INSTANCE; // This will be called multiple times , but the object will be created only once  if it is created already then it will return the same object because of static final instance of the Singleton class..
    }
}



/*  WORK FLOW : 

public class Singleton {

    private Singleton() {
        ==> Private constructor to prevent external instantiation (ENCAPSULATION)
    }

    private static class SingletonHelper {
        ==>  Static final instance of the Singleton class (THREAD SAFETY , LAZY INITIALIZATION ) WHEN CALLED FIRST TIME , INSTANCE WILL BE CREATED


        private static final Singleton INSTANCE = new Singleton(); 

    }

    public static Singleton getInstance() {
        ==>  Access point to get the Singleton instance (THREAD SAFETY , LAZY INITIALIZATION ) WHEN CALLED FIRST TIME , INSTANCE WILL BE CREATED 

        return SingletonHelper.INSTANCE;
    }
}   

HOW IT WORKS :::

ONE OBJECT is already created, and when the other thread tries to create the object, it will not create the object again, but it will return the same object. because we are using the static final instance of the Singleton class , and 
it is thread safe and lazy initialization.  (THREAD SAFETY , LAZY INITIALIZATION ) WHEN CALLED FIRST TIME , INSTANCE WILL BE CREATED


It ensures that the Singleton instance is immutable. The INSTANCE field cannot be modified after it is initialized. , its sort of double check locking mechanism.



 
Diagram : 


    +-------------------+
    |       Main        |
    +---------+---------+
              |
              | 1. Call getInstance() from T1, T2, T3 ===>> (T3 is first time called , so it will create the object and T1 and T2 will not create the object again )
              v
    +---------+---------+        Memory
    |         T3        |     +-------------------+
    |                   |     |     Singleton     |
    | getInstance()     |     |                   |
    |                   |     |    - SingletonHelper     |
    |  +---------------+|     |      - INSTANCE    |
    |  |    Memory     || --> |    - (Singleton)   |
    |  |               ||     +-------------------+
    |  |               ||
    |  |               ||
    |  +---------------+|
    |                   |
    |                   |
    |                   |
    |                   |
    +-------------------+



    works fine with multiple threads and also it is lazy initialization. 
    this also involves  encapsulation, lazy initialization, thread safety, and the use of static final fields for immutability.


    *  Encapsulation : 
            - The Singleton class is encapsulated within the Singleton class.
            - The SingletonHelper class is encapsulated within the Singleton class.
            - The INSTANCE field is encapsulated within the SingletonHelper class.

    *  Lazy Initialization :
            - The Singleton instance is created only when the getInstance() method is called for the first time.
            - This is known as lazy initialization.

    *  Thread Safety :
            - The Singleton instance is thread-safe.
            - The SingletonHelper class is thread-safe.
            - The INSTANCE field is thread-safe.

    *  Static Final Fields for Immutability :
            - The INSTANCE field is declared as static and final.
            - This ensures that the Singleton instance is immutable.
            - The INSTANCE field cannot be modified after it is initialized.


*/