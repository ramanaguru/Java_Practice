package Exceptions;
/*
    
    what is Exception Handling ? 
        It is used to deal with errors an exceptional situations that occur during the execution of a program.(Critical situations)
        An exception is an event that disrupts the normal flow of program execution.


        Exceptions will throw as Objects
        Exceptions are thrown by the JVM.

        
        Exceution of the program will be stopped if an exception occurs. otherwise it will continue.
        try block will be executed first and it will java try this block of code. if execution is successful then catch block will not be executed.
        catch block will be executed if an exception occurs.
        
        Types of Exceptions:
            1.  Compile Time Exceptions  ===>  Spelling mistakes, syntax errors, etc. 
            2.  Run Time Exceptions      ===>  Null Pointer Exception, Arithmetic Exception, etc.
            3.  Logical Exceptions       ===>  When the code is not working as expected . for ex: 2 + 2 == 4 but the code is written as 2 + 2 == 5. (This is example is to understand , for complex code )


*/



public class ExceptionHandling_Example {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        
        try {
            j = 10/i; // Output ==>  Some exception occured : java.lang.ArithmeticException: / by zero  , Execution is continued after exception. , Result : 0


            /* 
                i = 5;
                j = 10/i;   Output ==>   Execution is continued after exception. , Result : 2
            */
        } 
        catch (Exception e) { // Exception is the parent class of all the exceptions , Throws as Object 
            System.out.println("Some exception occured : " + e);
        }

        System.out.println("Execution is continued after exception.");
        System.out.println("Result : " + j);
    }
    
}
