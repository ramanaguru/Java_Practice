package Exceptions;

//Using throw keyword to throw an exception 

public class Exception_With_Throw{

    public static void main(String[] args) {
        int i = 20 ; 
        int j = 0 ;

        try{
            j = 18/i;

            if(j == 0)
                throw new ArithmeticException("Throwing an Arthmetic exception.");
            

        }
        catch(ArithmeticException e){
            j = 10/1;
            System.out.println("Some Arthmetic Exception Occured : " + e);
        }


        System.out.println("Execution is continued after exception.");
        System.out.println("Result : " + j);
    }

}

/* 

OUTPUT :

Some Arthmetic Exception Occured : java.lang.ArithmeticException: Throwing an Arthmetic exception.
Execution is continued after exception.
Result : 10

*/