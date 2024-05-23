/*

    Custom Exception Handling:
    --------------------------
    - We can create our own exception class by extending the RuntimeException or (ultimate parent) Exception class.


    why constructor is used in custom exception class?
    ---------------------------------------------------
    - To pass the message to the parent class constructor, we need to create a constructor in the custom exception class.
    - super() is used to call the parent class constructor


    Syntax:

    class CustomException extends RuntimeException{
        public CustomException(String str){
            super(str);  
        }
    }


                            (OR)

    class CustomException extends Exception{
        public CustomException(String str){
            super(str);
        }
    }




*/



package Exceptions;

// Custom Exception Handling
class RamanaException extends RuntimeException{
    public RamanaException(String str){
        super(str);
    }
}

public class CustomExceptionHandling {
    
    public static void main(String[] args) {
        int i = 10;
        int j = 0;

        try{
            j = i/2;
            if(j == 5){
                throw new RamanaException("This is Custom Exception");
            }
        }
        catch(RamanaException e){
            System.out.println("Ramana Exception  : " + e.getMessage());
        }

        System.out.println(j);
    }
}


/*
Output:

Ramana Exception  : This is Custom Exception
5
 
*/
