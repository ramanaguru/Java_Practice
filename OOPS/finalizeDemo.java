/*
    Finalize ? 
    - The finalize method is called by the garbage collector on an object when it determines that there are no more references to the object.
    - A method that the garbage collector calls before destroying an object, intended for cleanup operations but generally discouraged in modern Java programming
*/




public class finalizeDemo {
    
    public static void main(String[] args) {

        @SuppressWarnings("unused") // @SuppressWarnings` annotation is used to suppress warnings issued by the compiler
        finalizeDemo obj = new finalizeDemo();

        obj = null; // Make the object eligible for garbage collection

        // Suggest to the JVM to run the garbage collector
        System.gc();

        System.out.println("Main method execution called");

        // Adding a delay to increase the chance of the garbage collector running
        try {
            Thread.sleep(1000); // 1 second delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called");
        
    }
}

/*
    OUTPUT : 

    Finalize method called
    Main method execution called

    (or)

    Main method execution called
    Finalize method called


    Note : The finalize method is called by the garbage collector on an object when it determines that there are no more references to the object.
          The finalize method is called only once by the garbage collector for an object.
            The finalize method is called before the object is garbage collected.

 */